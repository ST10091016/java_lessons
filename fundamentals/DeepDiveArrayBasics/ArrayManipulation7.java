public class ArrayManipulation7 {
    public static void main(String[]args){

        //declare and initialise array
        int[] array = {3,4,2,6,4,7,9,1,0};
        printArray("array before trim ",array);
        
        //assigning the variable to the method
        array = trim(array);
        printArray("array after trim ",array);

    }
    
    //method that trims the array, takes the empty spaces out of the array
    public static int [] trim(int[] arrayToAddTo){
        
        //declare and initialise the initial size to 9 
        int initialSize = arrayToAddTo.length;
       
        int newSizeLess = 0;

        //for loop that counts all the zeros and adds 1 to newSizeLess for each zero
         for(int i = 0; i < arrayToAddTo.length;i++){
            if(arrayToAddTo[i] == 0){
                newSizeLess++;
            }
        }
        
        //variable that has 9 - 1 which becomes a size of 8
        int newSize = initialSize - newSizeLess;
        int[] newArray = new int[newSize];
        
        //for loop that adds the elements from the old array to the new array after it haas been trimmed
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = arrayToAddTo[i];
        }
        
        //returning the values from the new array
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
