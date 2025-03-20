package module_1.lesson_8;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int indexOfSomething = indexOf(arr1, 5);
        System.out.println(indexOfSomething);
        System.out.println(indexOf(arr1, 45));
        System.out.println(indexOf(arr1, 4));
    }

    private static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    private static void referenceExample() {
        int a = 50;
        changeValue(a);
        System.out.println(a);
        int[] arr = {1, 2, 3, 4, 5}; // 8005
        changeArray(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 10);
        System.out.println(Arrays.toString(arr));
        // Is Java pass-by-reference or pass-by-value?
    }

    private static void changeArray(int[] arr) {
//        arr = new int[]{9, 9, 9, 9, 9}; // 100523
        arr[0] = 500;
    }

    private static void changeValue(int a) {
        a = 500;
    }

    private static void callHelloMethod() {
        printHello("Milan", 3);
        printHello("Richie", 2);
    }

    public static void printHello(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello " + name);
        }
    }
}

