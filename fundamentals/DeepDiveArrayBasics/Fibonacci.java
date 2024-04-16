public class Fibonacci{
	public static void main(String[] args){
        
        //declare and initialize variables 
		int firstNumber = 0, secondNumber = 1, nextNumber = 0;
        
        //for loop that iterates for the series until the condition is false
		for(int i = 0; i <= 50; i++){

			//prints out the number 0 first
			System.out.print(firstNumber + " ");

			//adding the first and second number and storing it in the next number
            nextNumber = firstNumber + secondNumber;
            //assigning the first number to second number
            firstNumber = secondNumber;
            secondNumber = nextNumber;
		}
	}
}