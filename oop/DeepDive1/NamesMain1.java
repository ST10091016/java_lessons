public class NamesMain1{
	    public static void main(String[] args){
		
		String name = Namegetter1.getName();
		int age = AgeGetter1.getAge();
		String surname = SurnameGetter1.getSurname();

		System.out.print("Hello " + name + " " + surname + " you are " + age);
	}	
}

