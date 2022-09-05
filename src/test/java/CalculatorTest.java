import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void addTest() {
        assertEquals(3, calc.add(1,2));
    }

    @Test
    public void subtractTest() {
        assertEquals(1, calc.subtract(3,2));
    }

    @Test
    public void multiplyTest() {
        assertEquals(4, calc.multiply(2, 2));
    }

    @Test
    public void divideTest() {
        assertEquals(2.0, calc.divide(4.0, 2.0), 0.0);
    }
}
