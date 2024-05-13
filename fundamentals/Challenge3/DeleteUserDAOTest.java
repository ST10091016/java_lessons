import org.junit.*;
import static org.junit.Assert.*;

public class DeleteUserDAOTest{

	@Test
	public void testDelete(){
        
        //calling the method
		UserDAO.delete("rubyrose@gmail.com");
		//using the assert equals to check the length after user has been deleted
		assertEquals("Removing email ", 1, UserDAO.database.length);
	}
}