import java.util.Scanner;

public class Prompter{

	public static string prompt(){

		//instantiation of Scanner class
        Scanner sc = new Scanner(System.in);

        //prompting the user
		System.out.print("What is your name: ");
		String name = sc.nextLine();

		System.out.print("What is your surname: ");
		String surname = sc.nextLine();

		System.out.print("Enter your date of birth (DD/MM/YYYY): ");
        String date_of_birth = sc.nextLine();

        //instantiation of DateValidator class
        DateValidator dv = new DateValidator();

        if(dv.isValid(date_of_birth)){
            
            System.out.print("Valid date of birth");

        }else{

        	System.out.print("Invalid date of birth");
        }

        //stored as a string since the user might add km
        System.out.print("How far is your favourite store from your home? ");
        String distance_from_store = sc.nextLine();

        return name + " " + surname + " " + date_of_birth + " " + distance;
	}
		
}