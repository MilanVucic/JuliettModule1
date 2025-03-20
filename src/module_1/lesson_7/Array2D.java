package module_1.lesson_7;

public class Array2D {
    public static void main(String[] args) {
//        int[][] grades = {
//                {3, 3, 4, 5},
//                {1, 3, 2, 2, 2, 4},
//                {1, 1, 4, 3, 5, 5},
//                {1, 2, 2, 4, 3}
//        };
//        String[] names = {"Milan", "Marco", "Sarah", "Jen"};
//
//        // Write a program to print the Name of the student with the highest average
//        // And that average
//
//        double max = 0;
//        int maxIndex = -1;
//        for (int i = 0; i < grades.length; i++) {
//            double rowSum = 0;
//            for (int j = 0; j < grades[i].length; j++) {
//                rowSum += grades[i][j];
//            }
//            double currentAvg = rowSum / grades[i].length;
//            if (currentAvg > max) {
//                max = currentAvg;
//                maxIndex = i;
//            }
//        }
//        if (maxIndex != -1) {
//            System.out.println("The student with the highest average is " + names[maxIndex]);
//            System.out.println("Their average is " + max + " out of " + grades[maxIndex].length);
//        } else {
//            System.out.println("There are no students with grades.");
//        }

        int[][] matrix = {
                //   0  1  2  3  4   5
                {3, 3, 4, 5, 9, 10}, // 0 , 0 5
                {1, 3, 2, 2, 2, 4}, // 1 , 1 4
                {1, 1, 4, 3, 5, 5}, // 2 , 2 3
                {8, -4, 2, 3, 5, 6},// 3
                {3, 44, 4, 3, -5, 5}, // 4
                {1, 22, 4, 43, 5, 5}, // 5
        };
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            leftDiagonalSum += matrix[i][i];
            rightDiagonalSum += matrix[i][matrix[i].length - 1 - i];
        }
        System.out.println(leftDiagonalSum);
        System.out.println(rightDiagonalSum);

        int sumBelowLeftDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                sumBelowLeftDiagonal += matrix[i][j];
            }
        }
        System.out.println(sumBelowLeftDiagonal);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Additiona HW:
        // 1. Calculate the sum below (above) right diagonal
        // 2. Calculate the sum below both diagnoals
    }
}
