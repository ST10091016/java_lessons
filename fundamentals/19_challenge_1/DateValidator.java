import java.util.Date;
import java.time.*;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class DateValidator{

	public static bool isValid(String dob){

    DateFormat format = DateFormat.ofPattern("dd/MM/yyyy");
    Date dateOfBirth = null;
    format.setLenient(false);

    //allows the code to be tested for any errors on the date while its being executed.
    try{
 
    	dateOfBirth = format.parse(dob);
    	return true;

    }catch(Exception e){

       return false;

    }

	}
}