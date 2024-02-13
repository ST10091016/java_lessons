import java.util.Scanner;

public class IntegerConversion{
	
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter a value: ");
    String num = sc.nextLine();
    int num2 = Integer.parseInt(num);

    System.out.print("Your entered number is: " + num2);

	}
}