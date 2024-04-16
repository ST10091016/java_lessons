import java.lang.Math;

public class ArrayChallenge361{
    public static void main(String[] args){

      //declare an empty 2D array of 10 arrays with 10 elements
      int[][][] threeDimensional = new int[10][10][3];

      //printing and calling the methods
      System.out.print("**** Three Dimensional ****\n\n");
      populate3D(threeDimensional);
      print3D(threeDimensional);
      
      //declare an empty 2D array of 10 arrays with 10 elements
      int[][] twoDimensional = new int[10][10];

      //printing and calling the methods
      System.out.print("\n\n**** Two Dimensional ****\n\n");
      populate2D(twoDimensional);
      print2D(twoDimensional);

    }
    
    //method that populates the 3d array and has a parameter
    public static void populate3D(int[][][] array){

        //for lopp that goes through the 3D array
        for(int i = 0; i < array.length; i++){
            //for loop that goes through the 2D array
            for(int j = 0; j < array[i].length; j++){
                //for loop that populates the 2D array with elements
                for(int k = 0; k < array[i][j].length; k++){
                    //giving each index a random element using the random method. 0 is the minimum and 10 is the range
                    array[i][j][k] = (int)(Math.random() *10) + 0;
                }
            }
        }
    }
    
    //method that prints the elemets in the 3D array
    public static void print3D(int[][][] array){

        //for loop that goes through the 3D array
        for(int i = 0; i < array.length; i++){
            //for loop that goes through the 2D array
            for(int j = 0; j < array[i].length; j++){
                //for loop that populates the 2D array with elements
                for(int k = 0; k < array[i][j].length; k++){
                   //printing out the elements from each index 
                   System.out.print(array[i][j][k] + " ");
                }

                //using the print to make the array look cleaner
                System.out.println();
            }

            System.out.println();
        }
    }
    
    //method that populates the 2D array, has a parameter
    public static void populate2D(int[][] array){

         //for loop that goes through the 2D array
         for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                 //each index gets a random element/value
                 array[i][j] = (int)(Math.random() *10) + 0;
            }
        }
    }
    
    //method that prints the 2D array, has a parameter
    public static void print2D(int[][] array){

        //for loop that goes through the 2D array
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                 //printing out the elements from each index 
                 System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

    