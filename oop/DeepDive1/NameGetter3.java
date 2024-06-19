import java.util.Scanner;

public class NameGetter3{
	private String name;

	public String getName(){
	   Scanner input = new Scanner(System.in);
	   System.out.print("Enter your name ");
       name = input.nextLine();
   	   return name;
	}
}