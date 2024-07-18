import java.time.LocalDate;
import java.time.Period;

public class LocalDateTest {
    public static void main(String[] args) { 
        LocalDate currentDate = LocalDate.now();
         LocalDate birthday = LocalDate.of(1960, 01, 1);
		 Period p = Period.between(birthday, currentDate);
         int year = p.getYears();
       
        System.out.println("You are " + p.minusYears(5) + " years, " + p.getMonths() +
     " months, and " + p.getDays() + " days old."); 
    }
}
