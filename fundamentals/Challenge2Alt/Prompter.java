import java.util.Scanner;

public class Prompter{
    
    //method that deals with the prompting of the user and returns the value from the user as a string.
	public static String prompt(String prompt){
      
      //instantiation of Scanner class
      Scanner input = new Scanner(System.in);
      System.out.print(prompt);
      return input.nextLine();
	}
}