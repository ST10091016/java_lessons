import java.util.Date;
import java.time.*;
import java.text.SimpleDateFormat;

class DateValidator{
  
  //method that checks if the date of birth is valid according to the format
	public static boolean isValid(String dateOfBirth){
      
      //creating an object
      SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
      
      //is a method that checks if the format is lenient or not, in this case it is
      formatDate.setLenient(false);
      
      //if-else statements -> if statement that checks if the date of birth is empty
      if(dateOfBirth.isEmpty()){
        System.out.print("\nInvalid date! Date of birth cannot be empty.\n");
         
         //returning false so that it loops again where its being used
         return false;

      }else{
         
         //try and catch which tests if it is an actual date with its format
         try{

          Date date = formatDate.parse(dateOfBirth);
         
         //if not its goes into the catch where an error message will be printed out.
         }catch(Exception error){
            
            System.out.print("\nInvalid! Incorrect date format has been used.\n");
            return false;
         }   
      }

      return true;
	}
}