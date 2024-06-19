public class NamesMain3{
	    public static void main(String[] args){

	    NameGetter3 ng = new NameGetter3();
		AgeGetter3 ag = new AgeGetter3();
        SurnameGetter3 sg = new SurnameGetter3();

		String name = ng.getName();
		int age = ag.getAge();
		String surname = sg.getSurname();

		System.out.print("Hello " + name + " " + surname + " you are " + age);
	}	
}

