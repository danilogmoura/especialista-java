package com.github.danilogmoura.Intermediario;

import com.github.danilogmoura.PathsFiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main6 {
    public static void main(String[] args) throws IOException {

        Path path = Path.of(PathsFiles.DEFAULT, "docs\\poema.txt");

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            reader.lines()
                    .forEach(System.out::println);

        }

//        ByteBuffer buffer = ByteBuffer.allocate(16);
//        try (var inputStream = new FileInputStream(path.toFile());
//             var channel = inputStream.getChannel()) {
//            while (channel.read(buffer) > 0) {
//                buffer.flip();
//                var charBuffer = StandardCharsets.UTF_8.decode(buffer);
//                System.out.print(charBuffer);
//                buffer.clear();
//            }
//        }
    }
}
