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
        System.out.print("\n\nArray after adding 1: ");
        print();
	}

	//method that prints out the elements from the array
	public static void print(){	   
       for(int i = 0; i < num.length; i++){
       	  System.out.print(num[i] + " ");
       }
	}
    
    //method that randomly populates the array with numbers up to 50.
	public static void populate(){
       
       //instantiating an object for the random class, to access the methods
	   Random random = new Random();

       for(int i = 0; i < num.length; i++){
       	  num[i] = random.nextInt(50);
       }
	}
    
    //method that adds one to each element in the array
	public static void addOne(){
		 for(int i = 0; i < num.length; i++){
       	  num[i] = num[i] + 1;
       }
	}
}