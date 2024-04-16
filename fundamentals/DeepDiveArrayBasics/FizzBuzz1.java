public class FizzBuzz1{
	public static void main(String[] args){
        
        System.out.println("Elements before FizzBuzz: ");
        
        //using a for loop to print out the values of i from 1 - 100
		for(int i = 1; i <= 100; i++){
			System.out.print(i + " ");
		}

		System.out.println("\n\nElements after FizzBuzz: ");
        
        //using a for loop to to print out the values that match the if statement
		for(int i = 1; i <= 100; i++){
			
			//if the variable is a multiple of 5 and 3 then fizz buzz gets printed instead of that number
			if((i%3 == 0) && (i % 5 == 0))
				System.out.print("FizzBuzz ");
			//if the variable is a multiple 3 then fizz gets printed instead of that number
			else if(i% 3 == 0)
                System.out.print("Fizz ");
            //if the variable is a multiple of 5 buzz gets printed instead of that number
			else if(i% 5 == 0)
				System.out.print("Buzz ");
			//else the rest of the numbers get printed
			else
				System.out.print(i + " ");
		}
	}
}