public class ArrayChallenge362_Alt{
    public static void main(String[] args){
      
      int[][] mainArray = new int[3][100];
      int[] odd = new int[100];
      int[] even = new int[100];
      int[] prime = new int[100];

      populateArray(odd, mainArray, 0);
     
      System.out.println("Odd numbers: ");
      printOdd(odd);

      populateArray(even, mainArray, 1);

      System.out.println("\n\nEven numbers: ");
      printEven(even);

      populateArray(prime, mainArray, 2);

      System.out.println("\n\nPrime numbers: ");
      printPrime(prime);
      
    }

    public static void populateArray(int[] array1D, int[][] array2D, int index){
            for(int i = 0; i < array1D.length; i++){
            array1D[i] = i;
            array2D[index][i] = array1D[i];
        }
    }

    public static void printOdd(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i]%2 != 0){
               System.out.print(array[i] + " ");
            }
        }
    }

    public static void printEven(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i]%2 == 0){
               System.out.print(array[i] + " ");
            }
        }
    }

    public static void printPrime(int[] array){
        for(int i = 0; i < array.length; i++){
            if(isPrime(i)){
               System.out.print(array[i] + " ");
            }
        }
    }

    public static boolean isPrime(int number){
        
        //checks if the number is less than or equal to one. if its true then it gets excluded.
        if(number <= 1){
            return false;
        }

        for(int i = 2; i < number; i++){
            if((number%i) == 0){
                return false;
            }
        }

        return true;
    }
}