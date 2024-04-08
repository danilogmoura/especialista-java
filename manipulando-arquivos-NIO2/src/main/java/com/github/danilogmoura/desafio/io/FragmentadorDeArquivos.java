package com.github.danilogmoura.desafio.io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

import static com.github.danilogmoura.desafio.io.PathFiles.FOTOS_FRAGMENTADAS;
import static java.nio.file.StandardOpenOption.*;

public class FragmentadorDeArquivos {

    private final Path origem;
    private final Path arquivoDestino = Path.of(FOTOS_FRAGMENTADAS);
    private final int tamanhoFragmento;


    public FragmentadorDeArquivos(Path orgigem, int tamanhoFragmento) {
        Objects.requireNonNull(orgigem);

        if (tamanhoFragmento < 1) {
            throw new IllegalArgumentException("Tamanho do fragmento deve ser a partir de 1 byte");
        }

        this.origem = orgigem;
        this.tamanhoFragmento = tamanhoFragmento;
    }

    private static int lerFragmento(ByteChannel readerChannel, ByteBuffer conteudoFragmento) throws IOException {
        return readerChannel.read(conteudoFragmento);
    }

    private static void escreverFragmento(Path arquivoFragmento, ByteBuffer conteudoFragmento) throws IOException {
        try (var writerChannel = Files.newByteChannel(arquivoFragmento, WRITE, CREATE, TRUNCATE_EXISTING)) {
            conteudoFragmento.flip();
            writerChannel.write(conteudoFragmento);
            conteudoFragmento.clear();
        }
    }

    public void fragmentar() throws IOException {
        try (var readerChannel = Files.newByteChannel(origem, READ)) {
            var conteudoFragmento = ByteBuffer.allocate(tamanhoFragmento);
            while (lerFragmento(readerChannel, conteudoFragmento) > 0) {
                var arquivoFragmento = criarArquivoFragmento();
                escreverFragmento(arquivoFragmento, conteudoFragmento);
            }
        }
    }

    private Path criarArquivoFragmento() throws IOException {
        return Path.of(FOTOS_FRAGMENTADAS, origem.getFileName().toString() + "." + arquivoId());
    }

    private int arquivoId() throws IOException {
        var files = Objects.requireNonNull(Files.list(arquivoDestino));
        return files.map(Path::getFileName)
                       .map(Path::toString)
                       .map(nome -> nome.substring(nome.lastIndexOf('.') + 1))
                       .mapToInt(Integer::parseInt)
                       .max().orElse(0) + 1;
    }
}
