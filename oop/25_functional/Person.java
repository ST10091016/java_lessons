import java.util.Date;
import java.time.LocalDate;
import java.time.Period; 
import java.lang.Iterable;

public class Person{

	private LocalDate dateOfBirth;
	private int age;
	private String name;
	private String surname;
	private int dayToNextBirthday;

	public void setDayToNextBirthday(int dayToNextBirthday){
        
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(this.dateOfBirth, currentDate);

        LambdaSortMain.persons.forEach(nextBirthday -> {
             
        this.dayToNextBirthday = period.getDays();

        });
        
        this.dayToNextBirthday = dayToNextBirthday;
	}

	public int getDayToNextBirthday(){
         
        return dayToNextBirthday;
	}

	public void setDateOfBirth(LocalDate dateOfBirth){

		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getDateOfBirth(){

		return this.dateOfBirth;
	}

	public void setAge(int age){

		this.age = age;
	}

	public int getAge(){

		return this.age;
	}

	public void setName(String name){

		this.name = name;
	}

	public String getName(){

		return this.name;
	}

	public void setSurname(String surname){

		this.surname = surname;
	}

	public String getSurname(){

		return this.surname;
	}

	public Person(LocalDate dateOfBirth, String name, String surname){
      
        this.name = name;
        this.surname = surname;
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, currentDate);
        this.age = period.getYears();
        this.dateOfBirth = dateOfBirth;
	}

	@Override
	public int hashCode(){

		String stringAge = Integer.toString(age);
		int hash = stringAge.hashCode();
		return hash;
	}
}