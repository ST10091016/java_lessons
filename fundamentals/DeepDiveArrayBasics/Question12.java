import java.util.Random;

public class Question12{
    
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
        
        int row = 0;
        while(row < num.length){
         int col = 0;
          while(col < num[row].length){
             num[row][col] = random.nextInt(3000);
             col++;
          }
          row++;
        }
    }

    //method that prints the populated 2D array
    public static void print(){
      int row = 0;
      while(row < num.length){
         int col = 0;
          while( col < num[row].length){
             System.out.print(num[row][col] + "\t ");
             col++;
          }
          System.out.println();
          row++;
        }
    }
    
    //method that checks if the elements are odd and can be divided by 8
    public static void oddAndEight(){
      int row = 0;

      while(row < num.length){
         int col = 0;
          while(col < num[row].length){

             //declare and initialse variables.
             boolean isValidNum = num[row][col] % 2 != 0;
             int oddNum = isValidNum ? 0: 1;

             switch(oddNum){
             case 0:
               switch(num[row][col] % 8){
               case 0:
                   System.out.print(num[row][col] + "\t ");
                  break;
               }
               break;
             }
             col++;
          }
          row++;
        }
    }
}