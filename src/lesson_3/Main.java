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
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the capital of France?");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("Paris")) {
            System.out.println("Correct. +5 points");
        } else {
            System.out.println("Nope...");
        }

        /*
        2. Given the Strings below:

        String a1 = "abcd";
        String a2 = "ABCD";
        String a3 = "AB";
        String a4 = "cd";

        What are the following expressions going to evaluate to (true/false)?

        a1.toUpperCase() == a2
        a1.equals(a2)
        a1.equalsIgnoreCase(a2)
        a1 == a3.toLowerCase() + a4
        a1 == (a3 + a4).toLowerCase()
        a2 == a3.toUpperCase() + a4.toUpperCase()
        a2.equals(a3 + a4)
        a1.equalsIgnoreCase(a3 + a4)
        a1.equals((a3+a4).toLowerCase())
        a2.equals(a3.toUpperCase() + a4.toUpperCase())
         */
    }
}