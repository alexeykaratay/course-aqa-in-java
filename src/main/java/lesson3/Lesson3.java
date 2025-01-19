package lesson3;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {

        System.out.println(checkSumRange(10, 5));
        printNumberSign(-5);
        System.out.println(isNegative(-10));
        printStringMultipleTimes("Test", 3);
        System.out.println(isLeapYear(2025));
        flipArray();
        fillArray();
        multiplyIfLessThanSix();
        fillDiagonal();

        int[] array = createArray(5, 42);
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static boolean checkSumRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void flipArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void multiplyIfLessThanSix() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void fillDiagonal() {
        int n = 5;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
            matrix[i][n - i - 1] = 1;
        }
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
}
