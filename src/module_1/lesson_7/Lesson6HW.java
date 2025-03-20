package module_1.lesson_7;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson6HW {
    public static void main(String[] args) {
        // Write a program to find the index of an array element. (-1 if not found)
//        int[] array = {5, 88, -7, 9, 0, 12};
//        int index = -1;
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//
//        for (int i = 0; i < array.length; i++) {
//            if (number == array[i]) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index);
        // Write a program to find the number of even and odd integers in a given array of integers.
//        int numberOfEven = 0;
//        int numberOfOdd = 0;
//
//        int[] array = new int[]{1, 2, 3, 4, 5, 6};
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//            if ((array[i] % 2) == 0) {
//                numberOfEven = numberOfEven + 1;
//            } else {
//                numberOfOdd = numberOfOdd + 1;
//            }
//        }
//        System.out.println("The number of even integers is " + numberOfEven);
//        System.out.println("The number of odd integers is " + numberOfOdd);

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i+1;
        }

        Scanner userKeyboard = new Scanner(System.in);
        int userNumber = userKeyboard.nextInt();

        Arrays.sort(array);
        if (userNumber >= array[1] || userNumber <= array[10]){
            System.out.println("The index is " + Arrays.binarySearch(array, userNumber));
        } else {
            System.out.println("-1");
        }
    }
}
