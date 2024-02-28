import java.util.Scanner;

public class Prompter{
 
  //method that prompts the user for an input
  public static String prompt(String prompt){
    
   System.out.print(prompt);
    
   //creating an object for the scanner class and assigning it to a variable
   Scanner input = new Scanner(System.in);

   //returning the String value 
   return input.nextLine();

  }
		
}