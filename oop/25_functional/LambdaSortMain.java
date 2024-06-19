import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.lang.Iterable;

public class LambdaSortMain{

	static List<Person> persons = new ArrayList<Person>();
	
	public static void main(String[] args){

		persons.add(new Person (LocalDate.of(2005, 1, 1), "Freddy", "Sprouse"));
		persons.add(new Person (LocalDate.of(2000,12,4), "Megan", "Smith"));
		persons.add(new Person (LocalDate.of(2003,03,28), "Malcom", "Alexander"));
		persons.add(new Person (LocalDate.of(1998,05,14), "Jacob", "Vorster"));
		persons.add(new Person (LocalDate.of(2004,12,3), "Jennifer", "Heathens"));
		persons.add(new Person (LocalDate.of(2000,10,3), "Xolani", "Black"));
        
       // persons.sort(( p1,  p2) -> p1.getName().compareTo(p2.getName()));
        persons.forEach((s) -> System.out.println(s.getDateOfBirth() + " " + s.getName() + " " +  s.getSurname() + " " + s.getDayToNextBirthday()));
	}
}