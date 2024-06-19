import java.util.ArrayList;
import java.util.function.Predicate;

public class PersonMain{
	public static void main(String[] args){
       
       ArrayList<Person> person = new ArrayList<Person>();
       person.add(new Person("Scarlett", "Greendale", 22, Person.Gender.FEMALE, Person.City.JOHANNESBURG));
       person.add(new Person("Alix", "Featherington", 90, Person.Gender.FEMALE, Person.City.ALICE));
       person.add(new Person("Jacob", "Newman", 50, Person.Gender.MALE, Person.City.PORTELIZABETH));
       person.add(new Person("Danny", "Greendale", 12, Person.Gender.MALE, Person.City.PORTELIZABETH));
       
       Predicate<Person> age1 =  age -> age.getAge() >= 50;
       Predicate<Person> gender2 = gender -> gender.getGender() == Person.Gender.FEMALE;

       Person person1 = new Person("Scarlett", "Greendale", 12, Person.Gender.MALE, Person.City.JOHANNESBURG);
       System.out.println(age1.or(gender2).test(person1));
	}
}