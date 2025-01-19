package lesson7;

public class Main {

    public static void main(String[] args) {
        String[][] arrCorrect = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "1", "2", "3"},
                {"5", "6", "7", "4"},
        };
        String[][] arrIncorrectSize = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "1", "2", "3"},
                {"5"}
        };
        String[][] arrIncorrectValue = {
                {"1", "2", "3", "4"},
                {"5", "a", "7", "8"},
                {"9", "1", "2", "0"},
                {"5"}
        };

        try {
            System.out.println("Сумма всех элементов массива равна " + ArraySum.methodSum(arrCorrect) + ".\n");
        } catch (MyOwnEception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Сумма всех элементов массива равна " + ArraySum.methodSum(arrIncorrectSize) + ".\n");
        } catch (MyOwnEception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Сумма всех элементов массива равна " + ArraySum.methodSum(arrIncorrectValue) + ".\n");
        } catch (MyOwnEception e) {
            System.out.println(e.getMessage());
        }
    }
}
