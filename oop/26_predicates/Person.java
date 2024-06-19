public class Person{

	private String name;
	private String surname;
	private int age;
	private Gender gender;
	private City city;
	
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

    public void setAge(int age){
    	this.age = age;
    }

    public int getAge(){
    	return age;
    }

    public void setGender(Gender gender){
    	this.gender = gender;
    }

    public Gender getGender(){
    	return this.gender;
    }

    public void setCity(City city){
         this.city = city;
    }

    public City getCity(){
    	return this.city;
    }

	public Person(String name, String surname, int age, Gender gender, City city){
         
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.city = city;
	}

	public enum Gender{
		MALE, FEMALE;
	}

	public enum City{
		JOHANNESBURG, PORTELIZABETH, ALICE, BLOEMFONTEIN;
	}
}