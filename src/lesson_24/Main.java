package lesson_24;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    // arr1: 1 2 3 - M
    // arr2: 9 10 12 13 5 7 1 2 3 - N
    // N + N + ... + N
    // O(N logN)
    // O(N^2) - bubble, insertion

    // log2 100 = 6.6
    // log2 200 = 7.6
    // log2 400 = 8.6 -> x25
    // log2 10000 = 13.2
    // log2 10000000 = 23.~

    public static void main(String[] args) {
        try (DirectoryStream<Path> files = Files.newDirectoryStream(Path.of("C:\\Users\\vucic\\IdeaProjects\\Enums"))) {
            for (Path path : files) {
                if (Files.isDirectory(path)) {
                    System.out.print("FOLDER:");
                } else {
                    System.out.print("FILE:");
                }
                System.out.println(path);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readFromFileNio() {
        Path path = Path.of("test.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            System.out.println(lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
