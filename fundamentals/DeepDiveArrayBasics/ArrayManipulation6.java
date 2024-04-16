import java.util.Arrays;

public class ArrayManipulation6 {
    public static void main(String[]args){

        //declare and initialise the array by pre-populating it
        int[] array = {3,4,2,6,4,7,9,1};

        printArray("array before first add ",array);

        //assigning the variable to the method so that it returns the value       
        array = add(array,12);

        printArray("array after first add ",array);

        //assigning the variable to the method so that it returns the value        
        array = add(array,13);

        //calling the method
        printArray("array after second add ", array);

    }
    
    //method that adds a new element to the array
    public static int [] add(int[] arrayToAddTo, int itemToAdd){
        
        //declare and initialise the variable
        int initialSize = arrayToAddTo.length;
        
        //for lopp that checks if the array contains a value of 0
        for(int i = 0; i < arrayToAddTo.length;i++){
            if(arrayToAddTo[i]== 0){

                //if it has a zero then that index with a zero gets populated with that value
                arrayToAddTo[i] = itemToAdd;
                return arrayToAddTo;
            }
        }

        //the array is full and we need to extend it by 10
        int newSize = arrayToAddTo.length+10;
        int nextPosition = initialSize;

        //an array that is equal to newSize
        int[] newArray = new int[newSize];

        //copying elements over
        for(int i =0; i < arrayToAddTo.length; i++){
            newArray[i] = arrayToAddTo[i];
        }

        //adding the value to the last index
        newArray[nextPosition]=itemToAdd;

        //returning the values of the array
        return newArray;
    
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
