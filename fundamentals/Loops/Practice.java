import java.util.Scanner;

public class Practice {
	public static void main(String[] args){
        
        //Write a program to calculate the sum of first 10 natural number.
        int sum = 0;
		for(int i = 1; i < 11; i++){
            
            sum += i;
		}
		  System.out.println("Sum: " + sum + " \n");

        /*Write a program that prompts the user to input a positive integer. 
		It should then print the multiplication table of that number. */

		Scanner input = new Scanner(System.in);
          
        do{

        System.out.print("Enter a number: ");
        String num = input.nextLine();

        int number = Integer.parseInt(num);

         if(number < 0){
             
            System.out.print("Invalid! Enter a number: ");

         }else{
            
            for(int i = 0; i <=10; i++){
            
            sum = (i * number);
            System.out.println(i + "x" + number + " = " + sum);
		    
		    }

            break;
         }

        }while(true); 
		
	}
}