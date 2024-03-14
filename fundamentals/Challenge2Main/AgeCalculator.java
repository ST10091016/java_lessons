import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class AgeCalculator{

  //method that calculates the age of the use according to their date of birth.
	public static int calculate(String birthDate){
     
     //declaring and initialising variable
     int currentAge = 0; 

     //assigning birth date to a value
     birthDate = birthDate.split("/")[2];

     //if statement that checks if the birthdate is not empty
     if(!birthDate.isEmpty()){

        int currentYear = LocalDate.now().getYear();
        currentAge = currentYear - Integer.parseInt(birthDate);

     }

     return currentAge;

	}
}