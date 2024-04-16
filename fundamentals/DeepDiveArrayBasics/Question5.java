import java.util.Random;

public class Question5{
    
    //global empty array that is accessible in the class
	static int[] num = new int[50];

	public static void main(String[] args){
        
        //calling the methods
        populate();
        System.out.print("\nArray after randomly populating: ");
        print();
        //printing to the cmd
        System.out.print("\n\nEven numbers and numbers divisable by 11: ");
        evenAndEvelen();
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
          //each index for array are given random integers 0-50
       	  num[i] = random.nextInt(50);
       }
	}

    //method that prints out the even numbers and numbers divisable by 11 in the array.
    public static void evenAndEvelen(){

        for(int i = 0; i < num.length; i++){
          //if statement that checks if the element of that index is divisable by 2 AND by 11
          if(num[i]%2 == 0 && num[i]%11 == 0){
            System.out.print(num[i] + " ");
          }
       }
    }
}