public class Question7{
    
    //global populated 2D array that is accessible in the class
    static int[][] num = {{1, 2, 3 ,4 ,5 ,6 ,7, 8, 9, 10},
                          {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                          {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                          {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
                          {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
                          {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
                          {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
                          {71, 72, 73, 74, 75, 76, 77, 78, 79, 80}};

    public static void main(String[] args){
      
      //calling the methods and printing
      System.out.print("2D array before adding 1: ");
      print();
      //printing out to the cmd
      System.out.print("\n\n2D array after adding 1: ");
      addingOne();
      print();
    }
    
    //method that prints the array using a nested for loop
    public static void print(){
        
        /* for loop that goes through the rows and if the condition is true then 
        go through the columns */
        for(int row = 0; row < num.length; row++){
           for(int col = 0; col < num[row].length; col++){
             System.out.print(num[row][col] + " ");
           }
        }
    }
    
    //method that adds 1 to each element in the array
    public static void addingOne(){

        //each for loop goes through the index for the outer and inner and prints each one added with 1
        for(int row = 0; row < num.length; row++){
           for(int col = 0; col < num[row].length; col++){
             num[row][col] = num[row][col] + 1;
           }
        }
    }
}