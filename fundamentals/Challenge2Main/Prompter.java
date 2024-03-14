import java.util.Scanner;
class Prompter{

    //method that gets users input
	public static String prompt(String prompt){
    
    //instantiating the Scanner class
    Scanner input = new Scanner(System.in);
    System.out.print(prompt);
    return input.nextLine();

	}
}