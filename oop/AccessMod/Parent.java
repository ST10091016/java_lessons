package package1;

public class Parent{

	public Parent(String output, String output2) throws NumberFormatException{
		System.out.println("I am a parent constructor");
	}

	public Parent(){}

	protected static void family(){
		System.out.println("I am a parent");
	}

	public static void myMethod1(){
		System.out.println("I belong here");
	}
}