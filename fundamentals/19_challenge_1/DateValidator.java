import java.util.Date;
import java.time.*;
import java.text.SimpleDateFormat;

public class DateValidator{
    
    //method that checks if the date format is valid
    public static boolean isValid(String dob){

      //creating an object for the date format class
      SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
      
      //initialising the variable to null as its not specified yet
      Date dateOfBirth = null;

      //specfies if the date format should be strict or not, in this case since it is false it will be strict and will not allow invalid values
      dateFormat.setLenient(false);

      //if statement that checks if the dob is empty
      if(dob.isEmpty()){

        System.out.println("\nYour date of birth cannot be empty. \nPlease re-enter your birth date in the format.\n");
        return false;
      }
  
      //allows the dob to be tested during execution, if an error occurs then it goes to the catch
      try{

         dateOfBirth = dateFormat.parse(dob);
         return true;

      } catch(Exception e){
         
        System.out.println("\nInvalid date input. \nPlease use the correct (DD/MM/YYYY) format.\n");
        return false;
      } 
 
    }   
      
}
