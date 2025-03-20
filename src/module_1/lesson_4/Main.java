package module_1.lesson_4;

public class Main {
    public static void main(String[] args) {
//        int number = 1;
//        // Write a program which prints all powers of 2 from 1 to 1000
//        while (number < 1000) {
//            System.out.println(number);
//            number *= 2;
//        }

        // Print all numbers divisible by 3 from 50-200
//        for (int number = 50; number <= 200; number++) {
//            if (number % 5 == 0) {
//                System.out.println(number);
//            }
//        }
//        int number = 100;
//        do {
//            System.out.println(number);
//            number++;
//        } while (number < 10);
//        System.out.println("_______________");
//        int number2 = 100;
//        while (number2 < 10) {
//            System.out.println(number2);
//            number2++;
//        }
//
//        boolean shouldRun = true;
//        do {
//            System.out.println("Welcome. Enter 1 for this, 2 for that, 0 for exit");
//            Scanner scanner = new Scanner(System.in);
//            int userInput = scanner.nextInt();
//            if (userInput == 0) {
//                shouldRun = false;
//            }
//        } while (shouldRun);
//
//        for (int i = 1; i < 100; i++) {
//            System.out.println(i);
//            if (i % 7 == 0) {
//                break;
//            }
//        }
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Enter your age:");
//            int age = scanner.nextInt();
//            if (age < 0) {
//                System.out.println("Age cannot be negative");
//            } else {
//                System.out.println("Your age: " + age);
//                break;
//            }
//        }
//        for (int i = 0; i < 10; i++) {
//            if (i % 3 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }
//        int number = 1;
//        while (number <= 3) {
//            for (int i = 1; i < 5; i++) {
//                System.out.println(i);
//            }
//            number++;
//        }
//         Write a program to calculate the sum of first N numbers
//         4 -> 1+2+3+4 = 10
//        Scanner scanner = new Scanner(System.in);
//        int number;
//        do {
//            System.out.println("Enter a number");
//            number = scanner.nextInt();
//            if (number <= 0) {
//                System.out.println("Positive numbers only please.");
//            }
//        } while (number <= 0);
//        int sum = 0;
//        for (int currentNumber = 1; currentNumber <= number; currentNumber++) {
//            sum += currentNumber;
//        }
//        System.out.println(sum);
//
//        int number = 5;
//        // Write a program which calculates the factorial of a given number
//        // Factorial of N = N * (N-1) * (N-2) * ... * 1
//        // Factorial of 5 = 5 * 4 * 3 * 2 * 1 = 120
//        int factorial = 1;
//        for (int i = 2; i <= number; i++) {
//            factorial *= i;
//        }
//        System.out.println(factorial);

        // Write a program to calculate the sum of all even numbers from 1-100
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
        /*
        Write a program to print Fibonacci series of n terms where n is input by user. Fibonacci numbers: 1,1,2,3,5,8,13,21,34,55...

        Write a program that generates a random number and asks the user to guess what the number is.

        Write a program to check whether a number is prime or not.

        Write a program to find the last prime number that occurs before the entered number.

        Write a program to find the sum of the digits of a given number.

        Write a program to find greatest common divisor (GCD) of given two numbers.

        Write a program to check whether a number is perfect or not. Perfect = equal to the sum of all of its divisors.
         */
    }
}
