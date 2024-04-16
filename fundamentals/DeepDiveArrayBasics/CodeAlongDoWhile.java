public class CodeAlongDoWhile{
	public static void main(String[] args){

	  //calling the method to execute
       count();
	}
    
    //method that counts 1 through 10
	public static void count(){
        
        //declare and initialise variable
        int i = 1; 

        //do while loop that prints at least once before checking the condition
		do{

		    //print out the values 
			System.out.print(i + " ");	
            i++;

		}while(i < 11);		
	}
}