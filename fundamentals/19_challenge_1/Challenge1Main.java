import java.time.*;
import java.util.Scanner;

public class Challenge1Main{

public static void main(String[] args){

        //declaring and initilaising the variables
        System.out.println("\n\t\tUser Details\n");
	    String name = Prompter.prompt("What is your name? ");
	    String surname = Prompter.prompt("What is your surname? ");
        String date_of_birth = null;
        String distance_from_store = null;
        boolean validDate = false;
        boolean validNumber = false;
  
            //while loop that continuously prompts the use of the date is false
            while(!validDate){
               
               date_of_birth = Prompter.prompt("Enter your date of birth (DD/MM/YY): ");
               validDate = DateValidator.isValid(date_of_birth);

            }

             while(!validNumber){
               
                distance_from_store = Prompter.prompt("How far is your favourite store from your home in km? ");
                validNumber = NumberValidator.isValid(distance_from_store);
            }
        
        
            //if else statement that checks both the number and date are true
            if(validDate == true && validNumber == true){

                int age = AgeCalculator.calculate(date_of_birth);
                double miles = MilesCalculator.calculate(distance_from_store);  

                 //calling the printer class and method which as 5 arguements
                Printer.print(name,surname,String.valueOf(age),Double.toString(miles));
        }
   
    }
        
}
