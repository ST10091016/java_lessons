import java.util.Random;

public class ArrayChallenge362{
    public static void main(String[] args){
     
     int[] odd = new int[100];
     int[] even = new int[100];
     int[] prime = new int[100];

     int[][] array = new int[3][100];
     
     System.out.print("\nOdd numbers: \n");
     oddNumbers(odd, array);

     System.out.print("\nEven numbers: \n");
     evenNumbers(even, array);

     // System.out.print("\nPrime numbers: \n");
     // primeNumbers(prime);

    }

    public static void oddNumbers(int[] oddArray, int[][] array){

      Random random = new Random();
      for(int i = 0; i < oddArray.length; i++){
         
        oddArray[i] = random.nextInt(100);

        array[0][i] = oddArray[i];
        array[1][i] = oddArray[i];
        array[2][i] = oddArray[i];

        if(oddArray[i]%2 != 0){
         System.out.print(oddArray[i] + " ");
        }
      }
    }

   public static void evenNumbers(int[] evenArray, int[][] array){

      Random random = new Random();
      for(int i = 0; i < evenArray.length; i++){

            evenArray[i] = random.nextInt(100);

             array[0][i] = evenArray[i];
             array[1][i] = evenArray[i];
             array[2][i] = evenArray[i];

            if(evenArray[i]%2 == 0){
              System.out.print(evenArray[i] + " ");
            }
       }
   }

   // public static void primeNumbers(int[][] array){

   //    Random random = new Random();
   //    int count = 0;

   //    for(int i = 0; i < array.length; i++){

   //      array[i] = random.nextInt(100);

   //      for(int j = 0; j < array[i]; j++){
            
   //          if(i%j == 0){
   //            count++;
   //          }
   //      }

   //      if(count == 2){
   //         System.out.print(array[i] + " ");
   //         count = 0;
   //      }
   //    }
   // }
}