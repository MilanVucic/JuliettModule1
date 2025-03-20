package module_1.lesson_5;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // Write a program to check whether a number is prime or not.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean isPrime = true;
        for (int divider = 2; divider <= Math.sqrt(number); divider++) {
            if (number % divider == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
