package lesson_5;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        //  XXXX* -> i = 0, 4 Xs
        //  XXX** -> i = 1, 3 Xs
        //  XX***
        //  X****
        //  *****

        // *xxxx
        // x*xxx
        // xx*xx
        // xxx*x
        // xxxx*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int numOfStars = scanner.nextInt();
        for (int i = 0; i < numOfStars; i++) {
            for (int j = 0; j < numOfStars; j++) {
                if (j < numOfStars - i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("___________________");

        for (int i = 0; i < numOfStars; i++) {
            for (int j = 0; j < numOfStars; j++) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /*
        Additional HW:
        number of stars = 7
        draw this diamond
                    *
                   ***
                  *****
                 *******
                  *****
                   ***
                    *
         */
    }
}
