import java.util.Random;

public class Question6{
    
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
       
       int i = 0;
       while(i < num.length){
          num[i] = random.nextInt(50);
          i++;
       }
    }

     //method that prints out the even numbers and numbers divisable by 11 in the array.
    public static void evenAndEvelen(){
        
        int i = 0;
        while(i < num.length){
          switch(num[i]%2){
            case 0:
            switch(num[i]%11){
              case 0:
                System.out.print(num[i] + " ");
              break;
            }
            break;
          }

          i++;
       }
    }
}