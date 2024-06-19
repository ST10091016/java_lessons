import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PackTest1 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("What is your name:");
		String input = reader.readLine();
		System.out.println("Hello and welcome:"+input);
		
	}
}

