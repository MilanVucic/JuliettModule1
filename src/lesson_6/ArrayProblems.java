package lesson_6;

public class ArrayProblems {
    // Extra HW:
    // Write a program to find the index of an array element. (-1 if not found)
    // Write a program to find the number of even and odd integers in a given array of integers.
    public static void main(String[] args) {
        // Write a program to test if an array has any repeating elements.

        int[] numbers = {1, 2, 3, 88, 3, 6, 5, 4, 8, 9, 99};

        boolean hasRepetitions = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    hasRepetitions = true;
                    break;
                }
            }
            if (hasRepetitions) {
                break;
            }
        }

        System.out.println(hasRepetitions);
//        int[] temperatures = {-5, -4, -9, -3, -2, -95};
//
////        Write a program to find the maximum and minimum value of an array.
//        if (temperatures.length > 0) {
//            int max = temperatures[0]; // int max = Integer.MAX_INT; both work
//            for (int i = 0; i < temperatures.length; i++) {
//                if (max < temperatures[i]) {
//                    max = temperatures[i];
//                }
//            }
//            System.out.println(max);
//        } else {
//            System.out.println("No data.");
//        }


        // Write a program to test if an array contains a specific value.
//        Scanner scanner = new Scanner(System.in);
//        int value = scanner.nextInt();
//
//        boolean found = false;
//        for (int i = 0; i < temperatures.length; i++) {
//            if (temperatures[i] == value) {
//                found = true;
//                break;
//            }
//        }
//
//        String message = found ? "Yay found": "Nopeeeee";
//        System.out.println(message);

        // Write a program to calculate the average value of array elements.
//        int sum = 0;
//        for (int i = 0; i < temperatures.length; i++) {
//            sum += temperatures[i];
//        }
//        System.out.println(sum / 1.0 / temperatures.length );
    }
}
