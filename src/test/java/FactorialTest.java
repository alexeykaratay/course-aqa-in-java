import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {

    @Test
    void testFactorialOfZero() {
        assertEquals(BigInteger.ONE, Factorial.calculateFactorial(0));
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(BigInteger.ONE, Factorial.calculateFactorial(1));
    }

    @Test
    void testFactorialOfFive() {
        assertEquals(BigInteger.valueOf(120), Factorial.calculateFactorial(5));
    }

    @Test
    void testFactorialOfTen() {
        assertEquals(BigInteger.valueOf(3628800), Factorial.calculateFactorial(10));
    }

    @Test
    void testNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> Factorial.calculateFactorial(-5));

        assertEquals("Факториал не может быть отрицательным числом", exception.getMessage());
    }

    @Test
    void testLargeFactorial() {
        BigInteger expected = new BigInteger("2432902008176640000"); // 20!
        assertEquals(expected, Factorial.calculateFactorial(20));
    }
}

