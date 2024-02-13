import java.util.Scanner;

public class IntegerConversion{
	
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter a value: ");
    String num = parseInteger(sc.nextLine());

    System.out.print("Your entered number is: " + num);

	}
}