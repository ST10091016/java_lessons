public class Test2{
    public static void main(String[] args){
      
      //declare and initialise arrays
      int[][] array = new int[3][100];
      int[] odd = new int[100];
      int[] even = new int[100];
      int[] prime = new int[100];
      
      //calling
      System.out.print("\n2D Array: \n");
    
      populate2DArray(even, odd, prime, array);
      print2DArray(array);
      
      System.out.print("\nEven populated: \n");
      populateEven(even);

      System.out.print("\n\nOdd populated: \n");
      populateOdd(odd);

      System.out.print("\n\nPrime populated: \n");
      populatePrime(prime);
      for(int i = 0; i < prime.length; i++)
            System.out.println(prime[i]);
    
    }

    public static void populate2DArray(int[] even, int[] odd, int[] prime, int[][] array){

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                switch(j){
                case 0:
                    for(int k = 0; k < even.length; k++)
                        array[0][j] = even[k];
                    break;
                case 1:
                    for(int l = 0; l < odd.length; l++)
                        array[1][j] = odd[l];
                    break;
                case 2:
                    for(int m = 0; m < prime.length; m++)
                      array[2][j] = prime[m];
                    break;
                }     
            } 
        }
    }

    public static void populateEven(int[] even){

        int fillValues = 2;

        for(int i = 0; i < even.length; i++){
            if(fillValues%2 == 0){
                even[i] = fillValues++;
                fillValues++;
               System.out.print(even[i] + " "); 
            }
        }
    }

    public static void populateOdd(int[] odd){
        
        int fillValues = 1;
        
        for(int i = 0; i < odd.length; i++){
            if(fillValues%2 != 0){
                odd[i] = fillValues++;
                fillValues++;
               System.out.print(odd[i] + " "); 
            }
        }
    }

    public static int populatePrime(int[] prime){

        int index = 0;
        int number = 2; // Start with the first prime number
        
        while (index < prime.length) {
            if (isPrime(number)) {
                prime[index++] = number;
                
            }
            number++;
        }
        return index;
    }

      public static boolean isPrime(int number){
        
        //checks if the number is less than or equal to one. if its true then it gets excluded.
        if(number <= 1){
            return false;
        }

        for(int i = 2; i < Math.sqrt(number); i++){
            if((number%i) == 0){
                return false;
            }
        }

        return true;
    }

    public static void print2DArray(int[][] array){
        for(int i = 0; i < array.length; i++){
        for(int j = 0; j < array[i].length; j++){
            System.out.print(array[i][j] + " ");
        }
      }
    }
}