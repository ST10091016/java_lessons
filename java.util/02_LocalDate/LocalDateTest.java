import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateTest {
    public static void main(String[] args) {

         ZoneId timeZone = ZoneId.systemDefault();
   		 LocalDate date =LocalDate.now();   		 
   		 System.out.println("Today's date is : " + date) ;
         System.out.println("My time zone is: " + timeZone);
   		
    }
}
