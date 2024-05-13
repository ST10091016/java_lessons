import java.util.Scanner;

class Prompter{
    
    //method the deals with prompting the user
	public static String prompt(String prompt){
        
        //creating an object
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);

        //returning the objects values
        return input.nextLine();
	}
}