  public class InitErrorTest {	
	static int state;
	
	static{
		state = 42/0;
		System.out.println(state);
	}
	
	public static void main(String[] args) {	
		new InitErrorTest();

	}
}

