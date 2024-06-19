import java.util.Scanner;

public class SurnameGetter3{
	public String surname;

	public String getSurname(){
	   Scanner input = new Scanner(System.in);
	   System.out.print("Enter your surname ");
       surname = input.nextLine();
   	   return surname;
	}
}