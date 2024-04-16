public class Question9{
    
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
        int row = 0;
        while(row < num.length){
            int col = 0;
            while(col < num[row].length){
             System.out.print(num[row][col] + " ");
             col++;
           }
           row++;
        }
    }

   //method that uses the nested for loops to check if the elements are even AND are divisable by 11.
   public static void evenAndEvelen(){

      //declare and initialise variable row
      int row = 0;

      //nested while loops that go through each outer and inner index
      while(row < num.length){
           int col = 0;
           while(col < num[row].length){

                //checks if the row and col index is divisable by 2, if it has no remainder then it goes to the next switch
                switch(num[row][col]%2){
                case 0:

                    //checks if the switch statements are true, if they are, then it prints out that value from the index
                    switch(num[row][col]%11){
                     case 0:
                      System.out.print(num[row][col] + " ");
                     break;

                    }
                    break;
                }
                col++;
           }

           //increment after the inner while loop is done
           row++;
       }
   }
}