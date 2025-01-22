import java.math.BigInteger;

public class Factorial {

    /**
     * Вычисляет факториал числа с использованием BigInteger для больших значений
     *
     * @param number  целое неотрицательное число
     * @return факториал числа n
     */
    public static BigInteger calculateFactorial(int number) {

        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
