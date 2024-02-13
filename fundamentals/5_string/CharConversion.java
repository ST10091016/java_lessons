import java.util.Scanner;

public class CharConversion{
	
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter a value: ");
    String num = sc.nextLine();
    char num2 = num.charAt(0);

    System.out.print("Your entered number is: " + num2);

	}
}