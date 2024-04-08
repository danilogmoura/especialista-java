package com.github.danilogmoura.Intermediario;

import com.github.danilogmoura.PathsFiles;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.*;

public class Main5 {
    public static void main(String[] args) throws IOException {

        Path path = Path.of(PathsFiles.DEFAULT, "docs\\arquivo.txt");

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put((byte) 79);
        buffer.put((byte) 108);
        buffer.put((byte) -61);
        buffer.put((byte) -95);

//        System.out.println(Arrays.toString(buffer.array()));

        try (ByteChannel channel = Files.newByteChannel(path, WRITE, CREATE, TRUNCATE_EXISTING)) {
            buffer.flip();
            channel.write(buffer);
        }


    }
}
