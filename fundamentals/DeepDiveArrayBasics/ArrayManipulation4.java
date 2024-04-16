import java.lang.System;
import java.util.Arrays;

public class ArrayManipulation4 {
    public static void main(String[]args){

        //declare and initialise array with values
        int[] array = {3,4,2,6,4,7,9,1};
        
        //printing out the array before removing values
        printArray("array before overwriting ",array);
        
        //setting the last two indices to -1 to show that they have been removed
        array[array.length - 1] = -1;
        array[array.length - 2] = -1;
      
        printArray("array with deleted values ",array);
        
        //declare and initialise new array with the same length as the original
        int[] newArray = new int[array.length];
        
        //for loop that checks if there are any elements that are not equal to -1, if not then it gets populated
        for(int i = 0; i < array.length; i++){
            if(array[i] != -1){    
              newArray[i] = array[i];
            }
        }
        
        //declare and initialise counter variable
        int countingZeros = 0;
        
        //for loop that checks if any element in the new array contains a zero, if there is then the counter variable increments
        for(int i = 0; i < newArray.length; i++){
            if(newArray[i] == 0){
                countingZeros++;
            }
        }
        
        //declaring and initialising variables
        int newSize = newArray.length - countingZeros;
        int[] newArray2 = new int[newSize];
        
        //printing out the new array's elements
        for(int i = 0; i < newArray2.length; i++){
            newArray2[i] = newArray[i];
        }
        
        //printing out the smaller array
        printArray("array after overwriting ",newArray2);

    }
    
    //printing out the arrays with pretty print
    public static void printArray(String prefix,int[] arrayToPrint){
        
        //printing out the string of characters
        System.out.print(prefix);
        System.out.print("[");
        
        //for loop that continues printing until the condition is false
        for (int i =0;i < arrayToPrint.length;i++) {
            
            //prints the values from each index each time it gets incremented
            System.out.print(arrayToPrint[i]);

            //prints out the commas until 9
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }
        }

        //pretty prints the values from the array
        System.out.print("]\n");
    }
}

