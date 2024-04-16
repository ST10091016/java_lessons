import java.util.Random;

public class Question12{
    
    //global empty 2D array that is accessible in the class
    static int[][] num = new int[100][30];

    public static void main(String[] args){

       //calling the methods and printing to the cmd.
       populate();
       //printing to the cmd
       System.out.print("The 2D array after it has been populated: ");
       print();
       System.out.print("\n\nThe 2D array with odd and numbers divisable by 8: ");
       oddAndEight();
    }

    //method that randomly populates the 2D array with 3000 numbers.
    public static void populate(){
        
        //instantiating an object for the random class
        Random random = new Random();

        //declare and intialise variable
        int row = 0;

        //nested while loop that checks if the outer and inner are less than the length of the array
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

      //declare and initialise variable
      int row = 0;
      while(row < num.length){
         int col = 0;
          while( col < num[row].length){
             System.out.print(num[row][col] + "\t ");
             col++;
          }

          //added to make the print out look like a matrix
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
             
             //switch case that checks if the boolean of the int is true, since it is true it returns 0
             switch(oddNum){

               //since the oddNum is the same as the case it goes into the next switch
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