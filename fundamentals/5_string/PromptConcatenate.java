import java.util.Scanner;

public class PromptConcatenate{

	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

System.out.print("Enter you name: ");
String name = sc.nextLine();

System.out.print("Enter in your age: ");
int age = Integer.parseInt(sc.nextLine());

String masterLine = "\nYour name is " + name + "\nand you are " + age;
System.out.print(masterLine);

	}
}