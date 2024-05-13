import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmailValidator{
    
    //method that checks if the email is valid
	public static boolean isValid(String email){
        
        //declare and initialise variable that cannot be altered, this is for strict validation
        final String EMAIL_FORMAT_PATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        
        //creating objects
        //the pattern complies an expression so that it can be used and searched for
        Pattern pattern = Pattern.compile(EMAIL_FORMAT_PATTERN);
        //searches for the pattern based on the pattern
        Matcher match = pattern.matcher(email); 
        
        //declare and initialise variable to true
        boolean validEmail = match.matches();
        
        //if statement that checks if the boolean is false. if it is then the user gets an error message
        if(validEmail == false){
            System.out.print("\nInvalid! Email address must follow the format example@mail.com\n");
            
            //returning with false
            return false;
        }
        
        //returning the boolean
        return validEmail;
	}
}