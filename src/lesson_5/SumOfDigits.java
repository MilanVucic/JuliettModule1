package lesson_5;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Write a program to find the sum of the digits of a given number.
        // E.g. 5873 => 5 + 8 + 7 + 3 = 23
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        // 5873 % 10 = 3
        // 5873 / 10 = 587
        // 587 % 10 = 7
        // 58
        // 5
        // 0
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println(sum);
    }
}
