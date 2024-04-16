public class Test{
    public static void main(String[] args){
      
      //declare and initialise empty arrays
      int[][] array = new int[3][100];

      //arrays that have a size of 100
      int[] odd = new int[100];
      int[] even = new int[100];
      int[] prime = new int[100];
      
      //calling the methods to print and display
      System.out.print("\nOdd: \n");
      populateOdd(odd);
      printOdd(odd);
      
      System.out.print("\n\nEven: \n");
      populateEven(even);
      printEven(even);
      
      System.out.print("\n\nPrime: \n");
      populatePrime(prime);
      printPrime(prime);

      System.out.print("\n\n2D Array: \n");
      populate2DArray(even, odd, prime, array);
      print2DArray(array);  
    
    }
    
    //method that populates the 2d array using the 1d arrays
    public static void populate2DArray(int[] even, int[] odd, int[] prime, int[][] array){
        
        //for lopp that gows through the rows/arrays of the 2d array
        for(int i = 0; i < array.length; i++){
            
            //if statement that checks if the variable is equal to the condition, then will populate that array with values.
            if(i == 0)
                array[i] = even;
            else if(i == 1)
                array[i] = odd;
            else if(i == 2)
                array[i] = prime;  
        }
    }

     //printing the 2d array
     public static void print2DArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
        System.out.println("\n");
      }
    }

    //populating the even array with values
    public static void populateEven(int[] even){
        
        //initialised the variable to 2 because that is where the even numbers start
        int fillValues = 2;

        for(int i = 0; i < even.length; i++){

            //checks if the values have no remainders when divided by 2
            if(fillValues%2 == 0){
                even[i] = fillValues++;
                fillValues++;
            }
        }
    }

    //printing the even values in the array
    public static void printEven(int[] even){
        for(int i = 0; i < even.length; i++){
            System.out.print(even[i] + " ");
        }
    }
    
    //method that populates the odd array with odd values/elements 
    public static void populateOdd(int[] odd){
        
        //declared and initialised variable to 1 because the odd numbers start from there
        int fillValues = 1;
        
        //for loop that keeps printing all the values from the array until the condition is false
        for(int i = 0; i < odd.length; i++){

            //checks if the values have remainders when divided by 2
            if(fillValues%2 != 0){
                odd[i] = fillValues++;

                //incrementing the variable so that it keeps filling the array untila size of 100
                fillValues++;
            }
        }
    }
    
    //method that prints out the odd values from the array
    public static void printOdd(int[] odd){
        for(int i = 0; i < odd.length; i++){
            System.out.print(odd[i] + " ");
        }
    }
    
    //method that populates the array with prime numbers
    public static void populatePrime(int[] prime){
        
        //declared and initialised variable to 2 because the prime numbers start from there
        int fillValues = 2;

        //for loop that populates the array with values with only primes
        for(int i = 0; i < prime.length; i++){
            if(isPrime(fillValues)){
              prime[i] = fillValues;
            }else{

                //decremented the indexes that were filled with zeros
                i--;
            }

            fillValues++;
        }
    }
      
      //method that returns a boolean and takes a parameter of a number to see if it is a prime number
      public static boolean isPrime(int number){
        
        //checks if the number is less than or equal to one. if its true then it gets excluded.
        if(number <= 1){
            return false;
        } 

        //for loop that starts at 2 because a prime number starts at 2
        for(int i = 2; i < number; i++){
            if((number%i) == 0){
                return false;
            }
        }

        return true;
    }

    //method that prints out the prime numbers from the array
    public static void printPrime(int[] prime){
        for(int i = 0; i < prime.length; i++){
            System.out.print(prime[i] + " ");
        }
    }
}