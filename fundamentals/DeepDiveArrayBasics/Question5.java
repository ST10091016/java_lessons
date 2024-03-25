import java.util.Random;

public class Question5{
    
    //global empty array that is accessible in the class
	static int[] num = new int[50];

	public static void main(String[] args){
        
        //calling the methods
        populate();

        System.out.print("\nArray after randomly populating: ");
        print();
        System.out.print("\n\nEven numbers and numbers divisable by 11: ");
        evenAndEvelen();
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

     //method that prints out the even numbers and numbers divisable by 11 in the array.
    public static void evenAndEvelen(){
        for(int i = 0; i < num.length; i++){
          if(num[i]%2 == 0 && num[i]%11 == 0){
            System.out.print(num[i] + " ");
          }
       }
    }
}