import com.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator =new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2,3));
    }
    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(4,3));
    }
    @Test
    public void testMultiply() {
        assertEquals(12, calculator.multiply(4,3));
    }
    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6,3));
    }
    @Test void testDivideByZero() {
        Exception e = assertThrows(ArithmeticException.class, () -> calculator.divide(6,0));
        assertEquals("Division by zero is not allowed", e.getMessage());
    }

}
