import java.util.Scanner;

public class ByteConversion{
	
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter a value: ");
    String num = sc.nextLine();
    byte num2 = Byte.parseByte(num);

    System.out.print("Your entered number is: " + num2);

	}
}