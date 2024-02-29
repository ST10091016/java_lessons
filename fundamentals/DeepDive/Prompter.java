import java.util.Scanner;

public class Prompter{
 
  public static String prompt(String prompt){
   
   //instatiating an object for Scanner class
   Scanner input = new Scanner(System.in);
   System.out.print(prompt);
   
   //returning a value a string 
   return input.nextLine();

  }
}