package module_1.lesson_7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array2D = new int[5][10];
        array2D[2][4] = 5;
        array2D[1][7] = 9;
        array2D[2] = new int[7];
        array2D[3] = new int[3];
        array2D[4] = new int[5];
        int[] arr = new int[5];
        Arrays.fill(arr, 9);
        array2D[0] = arr;


        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array2D));

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        int[][] multi1 = {arr1, arr2};
        int[][] multi2 = {arr2, arr1};
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(multi1, multi2));
        System.out.println(Arrays.deepEquals(multi1, multi2));
    }
}
