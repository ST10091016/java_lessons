import java.util.Scanner;

public class BooleanConversion{
	
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter a value: ");
    String num = sc.nextLine();
    boolean num2 = Boolean.valueOf(num);

    System.out.print("Your entered number is: " + num2);

	}
}