import java.util.Random;

public class Question6{
    
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
       int i = 0;
       while(i < num.length){
          System.out.print(num[i] + " ");
          i++;
       }
    }
    
    //method that randomly populates the array with numbers up to 50.
    public static void populate(){
       
       //instantiating an object for the random class, to access the methods
       Random random = new Random();
       
       //declare and initialise variable
       int i = 0;

       //uses the initialised variable to check if it is smaller than the length of the array
       while(i < num.length){

          //populates the each index with a random int from 0 - 50
          num[i] = random.nextInt(50);
          i++;
       }
    }

     //method that prints out the even numbers and numbers divisable by 11 in the array.
    public static void evenAndEvelen(){
        
        //declare and initialise variable 
        int i = 0;

        //while loop that uses the variable and checks if it is less than the length of the array
        while(i < num.length){

          //switch case that checks if the element of that index is divisable by 2
          switch(num[i]%2){

            //if there is no remainder then it goes intonthe next switch case 
            case 0:
            switch(num[i]%11){
              case 0:
                System.out.print(num[i] + " ");
              break;
            }
            break;
          }
          //increments after the body
          i++;
       }
    }
}