import java.lang.System;

public class ArrayManipulation3 {
    public static void main(String[]args){
        
        //declare and populate arrays
        int[] array = {3,4,2,6,4,7,9,1};
        int[] newArray = new int[array.length];
        
        //printing out how the array looks before swapping it 
        printArray("array before swapping ",array);

        //sorting the above array in ascending order in-place by using the same array
        int temp = 0;
            for (int i = 0;i < array.length;i++ ) {
                for (int j =i+1;j< array.length; j++) {
                    if(array[j] < array[i]){
                         temp = array[i];
                         array[i] = array[j];
                         array[j] = temp;
                    }
                }
            }
        
        printArray("array after swapping in place in ascending order ",array);
        
        //coping the src into the destination array
        System.arraycopy(array, 0, newArray, 0, array.length);

        //printing out the new arrays elements that have been sorted into descending order
        printArray("new sorted array not in place in descending order ", descendingArray(newArray));
    }
    
    //method that returns the descending values in the array
    public static int[] descendingArray(int[] array){
    
       //nested for loops that bubble sorts the array in descending order
       for(int i = 0; i < array.length-1; i++){
           for(int j =0; j< array.length-1-i; j++){
                
                if(array[j] < array[j+1]){

                     int temp = array[j];
                     array[j] = array[j+1];
                     array[j+1] = temp;

                }
            } 
        }
        
        //returns the value of the array
        return array; 
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
