package com.github.danilogmoura.desafio.io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.nio.file.StandardOpenOption.*;
import static java.util.stream.Collectors.toCollection;

public class UnificadorDeArquivos {

    private final Path pastaArquivosFragmentados;
    private final Path arquivoUnificado;
    private final String prefixoArquivosFragmentados;

    public UnificadorDeArquivos(Path pastaArquivosFragmentados, Path arquivoUnificado,
                                String prefixoArquivosFragmentados) {
        Objects.requireNonNull(pastaArquivosFragmentados);
        Objects.requireNonNull(arquivoUnificado);
        Objects.requireNonNull(prefixoArquivosFragmentados);
        this.pastaArquivosFragmentados = pastaArquivosFragmentados;
        this.arquivoUnificado = arquivoUnificado;
        this.prefixoArquivosFragmentados = prefixoArquivosFragmentados;
    }

    public void unificar() throws IOException {
        List<Path> arquivosFragmentados = listarArquivosFragmentados();
        ordenarArquivosFragmentados(arquivosFragmentados);
        escreverArquivoUnificado(arquivoUnificado, arquivosFragmentados);
    }

    private List<Path> listarArquivosFragmentados() throws IOException {

        try (var stream = Files.find(pastaArquivosFragmentados,
                Integer.MAX_VALUE,
                (path, attrs) -> path.getFileName().toString().startsWith(prefixoArquivosFragmentados + "."))) {

            List<Path> arquivos = stream.collect(toCollection(ArrayList::new));

            if (arquivos.isEmpty()) {
                throw new IOException("Não existem fragmentos com prefixo "
                                      + prefixoArquivosFragmentados + " na pasta " + pastaArquivosFragmentados.toAbsolutePath());
            }

            return arquivos;
        }
    }

    private void ordenarArquivosFragmentados(List<Path> arquivos) {
        Pattern padraoNumeroArquivoFragmentado = Pattern.compile("\\.(\\d+)");

        arquivos.sort(Comparator.comparing(arquivo -> {
            Matcher matcher = padraoNumeroArquivoFragmentado.matcher(arquivo.getFileName().toString());
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(1));
            }
            throw new RuntimeException("Erro ordenando arquivos fragmentados");
        }));
    }

    private void escreverArquivoUnificado(Path arquivoUnificado, List<Path> arquivosFragmentados) throws IOException {
        try (var writerChannel = Files.newByteChannel(arquivoUnificado, WRITE, CREATE, TRUNCATE_EXISTING)) {
            for (Path arquivoFragmentado : arquivosFragmentados) {
                escreverFragmento(writerChannel, arquivoFragmentado);
            }
        }
    }

    private void escreverFragmento(ByteChannel outputStream, Path arquivoFragmentado) throws IOException {
        try (var writerChannel = Files.newByteChannel(arquivoFragmentado, READ)) {
            var buffer = ByteBuffer.allocate(1024);

            while (writerChannel.read(buffer) > 0) {
                buffer.flip();
                outputStream.write(buffer);
                buffer.clear();
            }
        }
    }
}
