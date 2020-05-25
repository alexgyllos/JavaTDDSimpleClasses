import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    public void canMultiply(){
        assertEquals(3, calculator.multiply(1, 3));
    }

    @Test
    public void canDivide(){
        assertEquals(3, calculator.divide(9.0, 3.0), 0.01);
    }
}
