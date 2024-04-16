import java.util.Random;

public class ArrayManipulation1 {
    public static void main(String[]args){
        
        //declaring an empty array of 10
        int[] array = new int[10];
        
        //creating an object
        Random random = new Random();
       
        //populating the array with random numbers
        for(int i = 0; i < array.length; i++){

            //takes values from 0 - 9
            array[i] = random.nextInt(10);
        }
        
        //prints out the random the numbers
        printArray("array with random numbers ",array);

        //for loop that sets all the values to 0.
        for(int i = 0; i < array.length; i++){
             array[i] = 0;
        }
        
        //printing out the array with zeros
        printArray("array with zeros ",array);
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
