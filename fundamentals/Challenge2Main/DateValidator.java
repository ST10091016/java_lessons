import java.util.Date;
import java.time.*;
import java.text.SimpleDateFormat;

class DateValidator{
  
   //method that checks if the date of birth is valid in the right format
	public static boolean isValid(String dateOfBirth){
 
      //creating an object for the date format class
      SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
      formatDate.setLenient(false);
      
      //initialising the variable to null as its not specified yet
      Date date = null;
      
      /* if statement thet checks of the dob is empty, if not then it will try to 
       excute the parsing of the date, if it cant then it will catch it */
      if(dateOfBirth.isEmpty()){

         return false;

      }else{

       try{

        date = formatDate.parse(dateOfBirth);
        return true;

       }catch(Exception e){
    
          return false;
       }
        
      }

	}
}