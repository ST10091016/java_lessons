import org.junit.*;
import static org.junit.Assert.*;

public class GetUserByEmailDAOTest{

	@Test
	public void testGetUserByEmail(){
 
		assertEquals("User Email ", UserDAO.getUserByEmail("rubyrose@gmail.com")[2]);
	}
}