package module_2.lesson_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        RecursiveLinkedList<Integer> list = new RecursiveLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printList();
        System.out.println(list.size());
    }

    private static int fibonacci(int number) {
        if (number <= 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    private static int count(int[] array, int value) {
        return countHelper(array, value, 0);
    }

    private static int countHelper(int[] array, int value, int index) {
        if (index == array.length) {
            return 0;
        }
        if (array[index] == value) {
            return 1 + countHelper(array, value, index + 1);
        }
        return countHelper(array, value, index + 1);
    }

    private static void listAllFiles(String root) {
        listAllFiles(Path.of(root));
    }

    private static void listAllFiles(Path root) {
        try {
            Files.list(root).forEach(path -> {
                if (Files.isDirectory(path)) {
                    listAllFiles(path);
                }
                System.out.println(path);
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean contains(int[] array, int value) {
        return containsHelper(array, value, 0);
    }

    private static boolean containsHelper(int[] array, int value, int index) {
        if (index == array.length) {
            return false;
        }
        if (array[index] == value) {
            return true;
        }
        return containsHelper(array, value, index + 1);
    }

    private static int factorial(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException(String.valueOf(number));
        }
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    private static int calculateSum(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException(String.valueOf(number));
        }
        if (number == 1) {
            return 1;
        }
        return number + calculateSum(number - 1);
    }

    private static void countDown(int number) {
        if (number <= 0) {
            System.out.println("Done!");
            return;
        }
        System.out.println(number);
        countDown(number - 1);
    }
}
