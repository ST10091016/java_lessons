import java.util.Random;

public class Question4{
    
    //global empty array that is accessible in the class
	static int[] num = new int[50];

	public static void main(String[] args){
        
        //calling the methods
        populate();
        System.out.print("\nArray after randomly populating: ");
        print();
        addOne();
        //printing to the cmd
        System.out.print("\n\nArray after adding 1: ");
        print();
	}

	//method that prints out the elements from the array
	public static void print(){
	   //each for loop goes through the index and prints the elements/values of that index
       for(int i = 0; i < num.length; i++){
       	  System.out.print(num[i] + " ");
       }
	}
    
    //method that randomly populates the array with numbers up to 50.
	public static void populate(){
       
       //instantiating an object for the random class, to access the methods
	   Random random = new Random();

       for(int i = 0; i < num.length; i++){
       	  //each index array are given random integers 0-50
       	  num[i] = random.nextInt(50);
       }
	}
    
    //method that adds one to each element in the array
	public static void addOne(){

		 //for loop goes through the index of the array and prints each one added with 1
		 for(int i = 0; i < num.length; i++){
       	  num[i] = num[i] + 1;
       }
	}
}