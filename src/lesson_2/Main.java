package lesson_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String firstName = "Milan", lastName = "Vucic";
//        String fullName = firstName + " " + lastName;
//        int age = 30;
//        String a = "asd" + 5.5;
//        System.out.println(a);
//        String message = fullName + " is " + age + " years old.";
//        System.out.println(message);
//        String numericalString = "123";
//        int number = Integer.parseInt(numericalString) + 10;
//        System.out.println(number);
//        System.out.println("Hello" + 10 + 20);
//        System.out.println(10 + 20 + "Hello");
//        System.out.println("Hello" + 10 * 20);
//        double abc = 30.55;
//        String aMessage = "Hi there" + abc;
//        System.out.println(aMessage);
//        String likeThis = String.valueOf(abc);
//        String name = "Luca";
//        String name2 = "Alexandra";
//        int nameLength = name.length();
//        System.out.println(nameLength);
//        name = name.toUpperCase();
//        System.out.println(name);
//        System.out.println(name2.length());
//        System.out.println(String.format("The name is %d characters long", nameLength));
//        boolean isValid = false;
//         50 Mbit -> 7.5 MB
//         8 bit = 1 B
//         0 <-> 1
//         Binary numerical system
//         bi = 2 -> 0.1.
//         decimal -> 10 digits -> 0.1.2.3.4.5.6.7.8.9
//         octal -> 8 -> 0-7
//         hexadecimal -> 0-15
//         00, 01, 10, 11 + 1 more -> 8 possibilites
//         000, 001, 010,.... 111
//         2 * 2 * 2 ... * 2 = 2^8
//        byte b = -128;
//        int c = 2100000000;
//        char character = '_';
//        long aLong = 5992382838218823L;
//        float f = 5.4f;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = keyboard.nextLine();
        System.out.println("Hello " + name);
        int age = keyboard.nextInt();
        System.out.println("You are " + age + " years old.");
        double height = keyboard.nextDouble();
        System.out.println("You are " + height + " cm tall.");
    }
}
