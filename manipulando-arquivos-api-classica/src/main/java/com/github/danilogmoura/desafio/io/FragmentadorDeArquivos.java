package com.github.danilogmoura.desafio.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class FragmentadorDeArquivos {

    private final File orgigem;
    private final File arquivoDestino = new File(PathFiles.PARENT_PATH_FOTOS_FRAGMENTADAS);
    private final int tamanhoFragmento;


    public FragmentadorDeArquivos(File orgigem, int tamanhoFragmento) {
        Objects.requireNonNull(orgigem);

        if (tamanhoFragmento < 1) {
            throw new IllegalArgumentException("Tamanho do fragmento deve ser a partir de 1 byte");
        }

        this.orgigem = orgigem;
        this.tamanhoFragmento = tamanhoFragmento;
    }

    private static int lerFragmento(FileInputStream fileInputStream, byte[] conteudoFragmento) throws IOException {
        return fileInputStream.read(conteudoFragmento);
    }

    private static void escreverFragmento(String arquivoFragmento, byte[] conteudoFragmento, int quantidadeBytesLidos) throws IOException {
        try (var fileOutputStream = new FileOutputStream(arquivoFragmento)) {
            fileOutputStream.write(conteudoFragmento, 0, quantidadeBytesLidos);
        }
    }

    public void fragmentar() throws IOException {
        try (var fileInputStream = new FileInputStream(orgigem)) {

            byte[] conteudoFragmento = new byte[tamanhoFragmento];
            int quantidadeBytesLidos;

            while ((quantidadeBytesLidos = lerFragmento(fileInputStream, conteudoFragmento)) > 0) {
                var arquivoFragmento = criarArquivoFragmento();
                escreverFragmento(arquivoFragmento, conteudoFragmento, quantidadeBytesLidos);
            }
        }
    }

    private String criarArquivoFragmento() {
        return PathFiles.PARENT_PATH_FOTOS_FRAGMENTADAS + "//" + orgigem.getName() + "." + arquivoId();
    }

    private int arquivoId() {
        var files = Objects.requireNonNull(arquivoDestino.listFiles(File::isFile));
        return Arrays.stream(files)
                       .map(File::getName)
                       .map(nome -> nome.substring(nome.lastIndexOf('.') + 1))
                       .mapToInt(Integer::parseInt)
                       .max().orElse(0) + 1;
    }
}
