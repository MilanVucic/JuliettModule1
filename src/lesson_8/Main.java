package lesson_8;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {1, 5, 3, 3, 5, 44, 33, 8};
        double[] arr3 = {1, 5, 3.5, 1.44};

        // [1, 2, 3, 4, 5, 6, 7]
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
    }

    private static void printArray(int[] array) {
        if (array.length == 0) {
            return;
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print("; ");
            }
        }
        System.out.print("]");
    }

    private static void printArray(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print("; ");
            }
        }
        System.out.print("]");
    }
}
