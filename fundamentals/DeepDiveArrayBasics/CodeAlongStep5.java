public class CodeAlongStep5{

	public static void main(String[] args){
      
      //int array that has been pre-populates with the size of 25
	  int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};

	  //calling the method to execute and passing 15 as the parameter
       count(array);
	}
    
    //method that counts 1 through 25
	public static void count(int[] max){
        
        //declare and initialise variable
        int i = 0; 

        //while loop that only prints the body if the condition is true
		while(i < max.length){

			//print out the values 
			System.out.print(max[i] + " ");	

			//increment variable after printing out the body each time
            i++;
		}	
	}
}