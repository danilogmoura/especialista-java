package com.github.danilogmoura;

import java.nio.file.Path;

public class FilesPath {

    public static final Path DEFAULT = Path.of("C:\\Users\\demo\\.github\\Especialista-Java\\SerializacaoObjetos\\src\\main\\resources");
    public static final Path OBJETOS = DEFAULT.resolve("objetos");

    private FilesPath() {
    }
}
