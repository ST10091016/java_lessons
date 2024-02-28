import java.util.*;

public class Printer{

     //printing method that shows the user an output of their name, surname, age and the distance in miles.
	 public static void print(String name, String surname, String age, String miles){
     
     //displaying or output to the user
	System.out.println("\n\t\t--------------------------\n");
	System.out.print("Hello " + name + " " + surname + "\nYou are " + age + " years old.");
	System.out.print("\n\nThe distance of your favourite store in miles is " + miles + " miles.");

	//declaring and initialising variables
     int ageInSeconds = Integer.parseInt(age);
     int seconds = ageInSeconds *365*24*60*60;
     int ageInMilli = seconds * 1000;

     String hexaAge = Integer.toHexString(ageInSeconds);
     String binaryAge = Integer.toBinaryString(ageInSeconds);
     double meters = (Double.parseDouble(miles) * 1609.34);

     System.out.print("\nThe distance to the store in meters is " + meters + " m.");
     System.out.print("\n\nYour age in seconds is " + seconds + " s.");
     System.out.print("\nYour age in milliseconds is " + ageInMilli + " ms.");
     System.out.print("\nYour age in hexadecimals is " + hexaAge);
     System.out.print("\nYour age in binary is " + binaryAge);
	System.out.print("\n\n\t\t--------------------------\n");

 }
}