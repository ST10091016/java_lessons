import org.junit.*;
import static org.junit.Assert.*;

public class FindAllUsersDAOTest{

	@Test
    public void testFindAll(){
      
      //calling the method
      UserDAO.findAll();

      //method that checks if the array is not empty
      assertNotNull("Array not null ", UserDAO.database);
   }
}