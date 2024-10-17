package lesson_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        boolean isOk = Boolean.parseBoolean("TRUE");
//        int age = 30;
//        int anotherAge = age++;
//        System.out.println(anotherAge);
//        System.out.println(age);
//        boolean isUnderage = (age < 18);
//        boolean is18 = age == 18;
//        boolean isNot18 = age != 18;
//        boolean valid = true;
//        boolean notValid = !valid;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter you age:");
//        int age = scanner.nextInt();
//        // 0 - 18 - 65
//        if (age < 0) {
//            System.out.println("You entered wrong age. Must be > 0");
//        } else if (age < 18) {
//            System.out.println("You are too young to work.");
//        } else if (age <= 65) {
//            System.out.println("You can work.");
//        } else {
//            System.out.println("You should retire.");
//        }
//         X AND Y
//
//         T and T -> T
//         T and F -> F
//         F and T -> F
//         F and F -> F
//
//         X OR Y
//
//         T or T -> T
//         T or F -> T
//         F or T -> T
//         F or F -> F
//
//        int age = 99;
//        if (age >= 18 && age <= 65) {
//            System.out.println("You can work.");
//        }
//
//        boolean isAbleToWork = false;
//        boolean hasPapers = true;
//        if (age < 18 || age > 65 || (!isAbleToWork && hasPapers)) {
//            System.out.println("You should not work.");
//        }
//        String message;
//        int age = 30;
//
//        if (age > 18) {
//            message = "You can work";
//        } else {
//            message = "You cannot work";
//        }
//        System.out.println(message);
//        String message2 = age > 18 ? "You can work" : "You cannot work";
//        String a = "abc"; // 1000
//        String b = "abc"; // 1000
//        String c = "ABC".toLowerCase();
//        String d = "ab";
//        d += "c";
//
//        System.out.println(a == b);
//        System.out.println(a == c);
//        System.out.println(a == d);
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(c));
//        System.out.println(a.equals(d));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What's the capital of France?");
//        String answer = scanner.next();
//        if (answer.equalsIgnoreCase("Paris")) {
//            System.out.println("Correct. +5 points");
//        } else {
//            System.out.println("Nope...");
//        }


//        2. Given the Strings below:

//        String a1 = "abcd";
//        String a2 = "ABCD";
//        String a3 = "AB";
//        String a4 = "cd";
//
////        What are the following expressions going to evaluate to (true/false)?
//
//        System.out.println(a1 == "abcd");
//        String b = "ab";
//        b += "cd";
//        System.out.println(a1 == b);
//        System.out.println(a1.toUpperCase() == a2); // false
//        System.out.println(a1.equals(a2)); // false
//        System.out.println(a1.equalsIgnoreCase(a2)); // true
//        System.out.println(a1 == a3.toLowerCase() + a4); // false
//        System.out.println(a1 == (a3 + a4).toLowerCase()); // false
//        System.out.println(a2 == a3.toUpperCase() + a4.toUpperCase()); // false
//        System.out.println(a2.equals(a3 + a4)); // false
//        System.out.println(a1.equalsIgnoreCase(a3 + a4)); // true
//        System.out.println(a1.equals((a3+a4).toLowerCase())); // true
//        System.out.println(a2.equals(a3.toUpperCase() + a4.toUpperCase())); // true

        // Lazy evaluation
        int number = 0;
        int a = 50;
        if (a > 49 || number++ > 50) {
            System.out.println("Yay");
        }
        if (false && ++a > 40) {

        }
        System.out.println(a);
        System.out.println(number);
        /*
        1. When this code is executed, what are the values of a, b, c, d at the end?
        Does it print "1" to the console or not?

        int a = 100;
        int b = 101;
        boolean c = ++a >= b;
        int d = 102;
        if (d-- <= b || ++b > --a) {
            System.out.println("1");
        }

        a = ?
        b = ?
        c = ?
        d = ?
         */
    }
}
