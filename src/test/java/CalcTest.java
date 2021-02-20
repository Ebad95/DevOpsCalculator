import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();
    @Before
    public void setUp() {

    }

    @Test
    public void testFactorial() {
        int a = 5;
        long expectedResult = 120;
        long result = calculator.factorial(a);
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testSqrt() {
        double a = 25;
        double expectedResult = 5;
        double result = calculator.sqrt(a);
        Assert.assertEquals(expectedResult, result,DELTA);
    }
}
