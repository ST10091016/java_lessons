public class CodeAlongWhile{

	public static void main(String[] args){

	  //calling the method to execute
       count();
	}
    
    //method that counts 1 through 10
	public static void count(){
        
        //declare and initialise variable
        int i = 1; 

        //while loop that only prints the body if the condition is true
		while(i < 11){

			//print out the values 
			System.out.print(i + " ");	

			//increment variable after printing out the body each time
            i++;
		}	
	}
}