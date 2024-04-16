public class Question8{
    
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
      System.out.print("\n\n2D array that has even numbers and numbers divisable by 11: ");
      evenAndEvelen();
     
    }
    
    //method that prints the array using a nested for loop
    public static void print(){
        
        /*
        for loop that goes through the rows and if the condition is
         true then go through the columns
        */
        for(int row = 0; row < num.length; row++){
           for(int col = 0; col < num[row].length; col++){
             System.out.print(num[row][col] + " ");
           }
        }
    }

   //method that uses the nested for loops to check if the elements are even AND are divisable by 11.
   public static void evenAndEvelen(){

       /*the for loops iterate trhough the outer and inner elements/values through their indexes
      to check if they are even AND can be divded by 11.
      */
      for(int row = 0; row < num.length; row++){
           for(int col = 0; col < num[row].length; col++){
                if((num[row][col]%2 == 0) && (num[row][col]%11 == 0)){
                    System.out.print(num[row][col] + " ");
                }
           }
       }
   }
}