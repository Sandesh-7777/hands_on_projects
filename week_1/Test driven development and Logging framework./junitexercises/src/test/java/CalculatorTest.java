import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {

        Calculator calc = new Calculator();

        assertEquals(30, calc.add(10,20));
    }

    @Test
    public void testMultiply() {

        Calculator calc = new Calculator();

        assertEquals(20, calc.multiply(5,4));
    }
}