import java.util.Scanner;

public class ShortConversion{
	
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter a value: ");
    String num = sc.nextLine();
    short num2 = Short.parseShort(num);

    System.out.print("Your entered number is: " + num2);

	}
}