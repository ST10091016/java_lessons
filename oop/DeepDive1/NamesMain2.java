public class NamesMain2{
	    public static void main(String[] args){

	    NameGetter2 ng = new NameGetter2();
		AgeGetter2 ag = new AgeGetter2();
        SurnameGetter2 sg = new SurnameGetter2();

		String name = ng.getName();
		int age = ag.getAge();
		String surname = sg.getSurname();

		System.out.print("Hello " + name + " " + surname + " you are " + age);
	}	
}

