import java.util.Random;

public class Question11{
    
    //global empty 2D array that is accessible in the class
    static int[][] num = new int[100][30];

    public static void main(String[] args){

       //calling the methods and printing to the cmd.
       populate();
       System.out.print("The 2D array after it has been populated: ");
       print();
       System.out.print("\n\nThe 2D array with odd and numbers divisable by 8: ");
       oddAndEight();
    }

    //method that randomly populates the 2D array with 3000 numbers.
    public static void populate(){
        
        //instantiating an object for the random class
        Random random = new Random();
        
        //each for loop goes through the index for the outer and inner
        for(int row = 0; row < num.length; row++){
          for(int col = 0; col < num[row].length; col++){

             //each index for the row and col are given random integers 0-3000
             num[row][col] = random.nextInt(3000);
          }
        }
    }

    //method that prints the populated 2D array
    public static void print(){

      //each for loop goes through the index for the outer and inner and prints
      for(int row = 0; row < num.length; row++){
          for(int col = 0; col < num[row].length; col++){
             System.out.print(num[row][col] + "\t ");
          }

          //used just to make the printing of the elements in a matrix
          System.out.println();
        }
    }
    
    //method that checks if the elements are odd and can be divided by 8
    public static void oddAndEight(){

      /*the for loops iterate trhough the outer and inner elements/values through their indexes
      to check if they are odd AND can be divded by 8.
      */
      for(int row = 0; row < num.length; row++){
          for(int col = 0; col < num[row].length; col++){
             if(num[row][col] % 2 !=0 && num[row][col] %8 == 0){
                System.out.print(num[row][col] + "\t");
             }
          }
        }
    }
}