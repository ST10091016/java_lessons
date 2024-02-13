import java.util.Scanner;

public class FloatConversion{
	
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter a value: ");
    String num = sc.nextLine();
    float num2 = Float.parseFloat(num);

    System.out.print("Your entered number is: " + num2);

	}
}