import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class AgeCalculator{

	public static int calculate(String birthDate){
     
     int currentAge = 0; 
     birthDate = birthDate.split("/")[2];

      if(!birthDate.isEmpty()){
 
          int currentYear = LocalDate.now().getYear();
          currentAge = currentYear - Integer.parseInt(birthDate);
     }
     return currentAge;
	}
}