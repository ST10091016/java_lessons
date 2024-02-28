import java.time.LocalDate;

public class AgeCalculator{

    //method that calculates the age of the user
    public static int calculate(String dob){
       
      //splits the string into substrings 
      dob = dob.split("/")[2];
       
      int currentYear = LocalDate.now().getYear();
      int currentAge = currentYear - Integer.parseInt(dob);

      //return statement which returns the current age of the user
      return currentAge;
      
    }
}