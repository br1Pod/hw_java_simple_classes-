import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void canSubtract(){
        assertEquals(3, calculator.subtract(10, 7));
    }

    @Test
    public void canMultiply(){
        assertEquals(42, calculator.multiply(6, 7));
    }

    @Test
    public void canDivide(){
        assertEquals(3.5, calculator.divide(7.0, 2.0), 0.01);
    }

}
