package lesson_7;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {

        //define variables
        Scanner input = new Scanner(System.in);
        int arraySize;
        int elementPosition;
        int elementValue;
        int[] arguments;

        /*
            Input blocks to take and validate input. User will be asked to
            reenter until valid entry has been made.
        */

        //array size block
        while (true) {
            System.out.print("Number of elements required: ");

            if (input.hasNextInt()) {
                arraySize = input.nextInt();

                if (arraySize > 0) {
                    break;
                } else {
                    System.out.println("Enter a positive number!");
                }

            } else {
                System.out.println("A number must be entered");
                input.next();
            }
        }

        arguments = new int[]{1, 2, 3, 4, 5};

        //element position block
        while (true) {
            System.out.print("Enter position you want to insert element: ");

            if (input.hasNextInt()) {
                elementPosition = input.nextInt();

                if (elementPosition > 0 && elementPosition < arguments.length) {
                    break;
                } else {
                    System.out.println("Enter a valid postion between 0 and " + arguments.length);
                }

            } else {
                System.out.println("A number must be entered");
                input.next();
            }
        }

        //value to be inserted block
        while (true) {
            System.out.print("Enter the number you wish to insert: ");

            if (input.hasNextInt()) {
                elementValue = input.nextInt();
                break;
            } else {
                System.out.println("A number must be entered");
                input.next();
            }
        }

        /*
            I haven't created a function, but this does the same as insertElements function
            There is no need to loop through the array as you know the index position

         */
        int[] userArrays = new int[arguments.length + 1];
        // elementPosition = 2
        // 1 2 3 4 5
        // 1 2 9 3 4 5
        for (int i = 0; i < arguments.length; i++) {
            if (elementPosition > i) {
                userArrays[i] = arguments[i];
            } else {
                userArrays[i+1] = arguments[i];
            }
        }

        userArrays[elementPosition] = elementValue;
        System.out.println("Sucessfully inserted the element into given position: " + Arrays.toString(userArrays));
    }
}