import org.junit.*;
import static org.junit.Assert.*;

public class DividerTest2{

    Divider divide = new Divider();
    String failMessage = "Number not dividable by zero";
    
    @Test
    public void testDivideByZero2(){ 
       assertEquals(failMessage, 0.0, divide.divideByZero(9.0), 0.0);
    }
}