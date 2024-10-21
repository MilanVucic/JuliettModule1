package lesson_5;

import java.util.Random;
import java.util.Scanner;

public class Lesson3HW {
    public static void main(String[] args) {
//        int a = 100; // 100
//        int b = 101; // 102
//        boolean c = ++a >= b; // true
//        int d = 102; // 101
//        //     F
//        if (d-- <= b || ++b > --a) {
//            System.out.println("1");
//        }
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
        /*
        a = 100
        b = 102
        c = true
        d = 101
         */

        //        Write a program to print Fibonacci series of n terms where n is input by user. Fibonacci numbers: 1,1,2,3,5,8,13,21,34,55...
//        int n = new Scanner(System.in).nextInt();
//        int old = 0;
//        int fib = 1;
//
//        while (n > 1) {
//
//            int lastFib = old;
//            old = fib;
//            fib = lastFib + old;
//            n--;
//        }
//        System.out.println(fib);
//        Write a program that generates a random number and asks the user to guess what the number is.
//        Scanner scan = new Scanner(System.in);
//        double x = Math.random();
//        int randomNumber = (int) (x * 10) +1;
//
//        System.out.println("What's the wanted number 1-10");
//        while (true) {
//            int number = scan.nextInt();
//            if (number == randomNumber) {
//                System.out.println("Hurray you got it");
//                break;
//            } else {
//                System.out.println("Try it again");
//            }
//        }

//        Scanner key = new Scanner(System.in);
//        int secretnumber = 4;
//        System.out.println("Write your number : ");
//
//        while (key.hasNextInt()) {
//            int userNumber = key.nextInt();
//
//            if (userNumber == secretnumber) {
//                System.out.println("You are right");
//                break;
//            } else {
//                System.out.println("Wrong answer. Try again :");
//            }
//        }
        Scanner key = new Scanner(System.in);
        int n1 = 1;
        int n2 = 1;
        int n3;
        for (int i = 1; i < 7; i++) {
            n3 = n1 +n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }

        /*
        Write a program that generates a random number 1-100 and then guesses the number in the least
        amount of tries by itself, knowing whether it guessed too high or too low each time
         */
    }
}
