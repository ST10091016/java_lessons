import org.junit.*;
import static org.junit.Assert.*;

public class DividerTest{

    Divider divide = new Divider();
    String failMessage = "Don't do that";
    
    @Test
    public void testDivideByZero(){ 
       assertEquals(failMessage, 0.0, divide.divideByZero(9.0), 0.0);
    }
    
    @Test
    public void testDivideByNegative(){ 
        assertEquals(failMessage, -2.0, divide.divideByNegative(-4.0, -2.0), 0.0);
    }
    
    @Test
    public void testDivideByPositive(){ 
        assertEquals(failMessage, 2.0, divide.divideByPositive(10.0, 5.0), 0.0);
    }
}
