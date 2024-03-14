import java.util.Scanner;

public class Prompter{
    
    //method that deals with the prompting the user 
	public static String prompt(String input){
         
         //instantiating an object from the scanner class
         Scanner sc = new Scanner(System.in);
         System.out.print(input);

         //returning the value of the string 
         return sc.nextLine();
	}
}