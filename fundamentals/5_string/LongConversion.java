import java.util.Scanner;

public class LongConversion{
	
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter a value: ");
    String num = sc.nextLine();
    long num2 = Long.parseLong(num);

    System.out.print("Your entered number is: " + num2);

	}
}