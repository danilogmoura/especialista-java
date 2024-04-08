package com.github.danilogmoura.Intermediario;

import com.github.danilogmoura.PathsFiles;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main4 {
    public static void main(String[] args) throws IOException {

        Path path = Path.of(PathsFiles.DEFAULT, "docs\\poema.txt");

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        try (ByteChannel channel = Files.newByteChannel(path, StandardOpenOption.READ)) {
            channel.read(buffer);

            buffer.flip();
            CharBuffer charBuffer = StandardCharsets.UTF_8.decode(buffer);
            System.out.println(charBuffer);
        }
    }
}
