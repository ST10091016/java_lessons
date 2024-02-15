//importing the java classes with their respective packages
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Challenge1{

	public static void main(String[] args){
        
       Prompter();
       
	}

	public static string Prompter {

		//instantiation of Scanner class
        Scanner sc = new Scanner(System.in);

        //prompting the user
		System.out.print("What is your name: ");
		String name = sc.nextLine();
		System.out.print("What is your surname: ");
		String surname = sc.nextLine();

		//https://www.javatpoint.com/java-string-to-date
		// DateFormat format = new SimpleDateFormat("dd/MM/YYYY");
		System.out.print("Enter your date of birth (DD/MM/YYYY): ");
        String dob = sc.nextLine();
        // SimpleDateFormat date = new SimpleDateFormat("dd/MM/YYYY");
        // Date date_of_birth = format.parse(dob);

        //stored as a string since the user might add km
        System.out.print("How far is your favourite store from your home? ");
        String distance_from_store = sc.nextLine();

        return "Your full name is "+ name + " " + surname + " and you were born in " + dob + "\nYour favourite store is " + distance_from_store + " away from your house.";
	}
}