import java.lang.System;

public class ArrayManipulation5 {
    public static void main(String[]args){
        
        //create and populate array
        int[] array = {3,4,2,6,4,7,9,1};
        
        //calling the method to print out the array before adding in another element
        printArray("array before adding ",array);
        
        //assigning the array to the method because of the return type and because it adds a new element to the last index
        array = add(array,11);
        
        //printing the array after the 11 has been added to the array
        printArray("array after adding ",array);

    }
    
    //method that adds an element to an index
    public static int [] add(int[] arrayToAddTo, int itemToAdd){
        
        //declaring and initialising the variables
        int initialSize = arrayToAddTo.length;
        int newSize = arrayToAddTo.length+1;
        
        //declaring a new array and giving it a new size
        int[] newArray = new int[newSize];
        
        //copying the elements from the array to add to to the new array
        for(int i = 0; i < arrayToAddTo.length; i++){
            newArray[i] = arrayToAddTo[i];
        }
        
        //adding a new value to the last index of the array
        newArray[newSize-1]=itemToAdd;  
        
        //returning the values of the new array
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
