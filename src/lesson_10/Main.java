package lesson_10;

import java.util.StringTokenizer;

public class Main {

    /*
        Additional HW:
        1. Find and return the most common letter in a given string.
        2. Check if 2 strings are anagrams of each other (below - elbow, end - ned, apple - ppale)
        3. Compress a string using the following rule: aaabccc = a3bc3
     */
    public static void main(String[] args) {
        // DECIMAL - base 10 -> {0-9}
        // 856 -> 8 * 100 + 5 * 10 + 6 * 1
        // 3210
        // 7856 = 7 * 10^3 + 8 * 10^2 + 5 * 10^1 + 6 * 10^0

        // BINARY - base 2 -> {0,1}
        // 210
        // 101 = 1 * 2^2 + 0 * 2^1 + 1 * 2^0 = 5
        // 43210
        // 11001 = 16 + 8 + 1 = 25

        // HEXADECIMAL - base 16 {0-9ABCDEF}
        // 210
        // 17A -> 1 * 16^2 + 7 * 16^1 + 10 * 16^0 = 256 + 7 * 16 + 10
        // = 256 + 122 = 378
        // 76 -> 1001100
        // 12
        // 4
        // 1100 -> C
        // 0010 -> 2
        // 0100 -> 4
        // 17A = 0001 0111 1010

        String name = "John";
        String lastName = "Smith";
        int age = 30;
        double height = 186.344;
        System.out.println(
                String.format("Hello %s %s, you are %d years old. Height: %.2f", name, lastName, age, height));
    }

    private static void sbExample() {
        StringBuilder sb = new StringBuilder("some string");
        sb.append("add this")
                .append(" ")
                .reverse()
                .delete(5, 10);
        String modified = sb.toString();
    }

    public static void tokenizerExample() {
        System.out.println(0 + 'č');
        System.out.println(0 + 'a');

        StringTokenizer tokenizer = new StringTokenizer("a couple of words", " ");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
