package module_1.lesson_20;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Make autocorrect
    // thanl -> thank, ....
    // jat -> sat, pat, lat
    // thankn -> thank
    // than -> than, thin, thank
    // thn -> thin, than, then

    // AutoCorrector -> add data (proper words)
    // call a method which takes a word and gives back a configurable amount of suggestions

    public static void main(String[] args) {
        Triangle triangle = new Triangle(5,10, 15);
        System.out.println(triangle);
    }

    private static void something() {
        try {
            circles();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void circles() throws IOException {
        try {
            Circle circle = new Circle(50);
            Circle circle2 = new Circle(50);
            Circle circle3 = new Circle(-50);
            Circle circle4 = new Circle(50);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Finally!");
        }
    }

    private static void exceptionExample1() {
        try {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter some index");
            int number = scanner.nextInt();
            if (number < 0) {
                throw new IllegalArgumentException("Number cannot be negative");
            }
            System.out.println("Number at position: " + number + " = " + numbers[number]);
        } catch (InputMismatchException | IndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("You must enter a valid integer.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        System.out.println("Finished gracefully.");
    }
}
