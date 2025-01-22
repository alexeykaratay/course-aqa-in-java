
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class FactorialTest {

    @Test
    void testFactorialOfZero() {
        Assert.assertEquals(BigInteger.ONE, Factorial.calculateFactorial(0));
    }

    @Test
    void testFactorialOfOne() {
        Assert.assertEquals(BigInteger.ONE, Factorial.calculateFactorial(1));
    }

    @Test
    void testFactorialOfFive() {
        Assert.assertEquals(BigInteger.valueOf(120), Factorial.calculateFactorial(5));
    }

    @Test
    void testFactorialOfTen() {
        Assert.assertEquals(BigInteger.valueOf(3628800), Factorial.calculateFactorial(10));
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Факториал не может быть отрицательным")
    void testNegativeNumber() {
        Factorial.calculateFactorial(-5);
    }

    @Test
    void testLargeFactorial() {
        BigInteger expected = new BigInteger("2432902008176640000"); // 20!
        Assert.assertEquals(expected, Factorial.calculateFactorial(20));
    }
}