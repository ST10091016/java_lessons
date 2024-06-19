package package2;
import package1.*;

public class Child extends Parent{

	protected static void child(){
		Parent.myMethod1();
		System.out.println("I am a child");
	}

	public static void child1(){
		Parent.family();
		System.out.println("We are family");
	}

	public Child(){}

	public Child(String name, String surname){
       
	}

	public Child(String name, String surname, int age){
        //this(name, surname);
        super(name, surname);
	}
}