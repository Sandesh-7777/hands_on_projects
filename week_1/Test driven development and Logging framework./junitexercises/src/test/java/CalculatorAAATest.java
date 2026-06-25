import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorAAATest {

    private Calculator calculator;

    @Before
    public void setUp() {

        System.out.println("Setup executed");

        calculator = new Calculator();
    }

    @After
    public void tearDown() {

        System.out.println("Teardown executed");

        calculator = null;
    }

    @Test
    public void testMultiply() {

        // ARRANGE
        int a = 5;
        int b = 4;

        // ACT
        int result = calculator.multiply(a, b);

        // ASSERT
        assertEquals(20, result);
    }
}