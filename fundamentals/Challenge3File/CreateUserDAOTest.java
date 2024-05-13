import org.junit.*;
import static org.junit.Assert.*;

public class CreateUserDAOTest{
    
    //method that is used to test if the method creates a user
    @Test
	public void testCreate(){
        
        //calling the methods and passing in the parameters
		UserDAO.create("Tumi", "Maleka", "tumi@gmail.com","14/05/2002", "0");
		UserDAO.create("Ruby", "Rose", "rubyrose@gmail.com","12/01/1999", "1");
		
		//using the assert equals method to check the length of the database as it has populated
		assertEquals("Checking the size ", 2, UserDAO.database.length);
	}
}