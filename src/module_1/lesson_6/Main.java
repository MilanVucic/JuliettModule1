package module_1.lesson_6;

public class Main {
    public static void main(String[] args) {
        String[] a = new String[5]; // 0-9
        int[] b = new int[3]; // 0-2
        a[0] = "Milan";
        a[3] = "Richard";
        b[1] = 3;
        b[2] = 5 * b[0] + b[1]; // 3
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        for (int index = 0; index < a.length; index++) {
            System.out.println(a[index]);
        }

        String[] names = {"Milan", "Lucy", "Bijay", "Richard"};
        int[] numbers = {1, 2, 3, 4, 98, 6, 7, 8, 9};
        System.out.println(names.length);
    }
}
