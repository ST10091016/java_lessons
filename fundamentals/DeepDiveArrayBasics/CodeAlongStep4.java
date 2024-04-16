public class CodeAlongStep4{
	public static void main(String[] args){

	  //calling the method to execute and passing 15 as the parameter
       count(15);
	}
    
    //method that counts 1 through 10
	public static void count(int max){
        
        //declare and initialise variable
        int i = 1; 

        //while loop that only prints the body if the condition is true
		while(i <= max){

			//print out the values 
			System.out.print(i + " ");	

			//increment variable after printing out the body each time
            i++;
		}	
	}
}