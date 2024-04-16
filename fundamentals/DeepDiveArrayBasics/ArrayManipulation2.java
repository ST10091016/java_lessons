public class ArrayManipulation2 {
    public static void main(String[]args){
        
        //declaring and populating an array
        int[] array = {3,4,2,6,4,7,9,1};
        
        //printing out the array before any changes has been made
        printArray("array before swapping ",array);
        
        //nested for loops that bubble sorts the array in ascending order
        for(int i = 0; i < array.length-1; i++){
           for(int j =0; j< array.length-1-i; j++){
                
                //if the element is greater than the next element then those two elements swap places
                if(array[j] > array[j+1]){

                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                }
            } 
        } 
        
        //printing the array that has been swapped
        printArray("array after swapping ",array);
        
        //nested for loops that bubble sorts the array in descending order
        for(int i = 0; i < array.length-1; i++){
           for(int j =0; j< array.length-1-i; j++){
                
                //if the element is greater than the next element then those two elements swap places
                if(array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            } 
        }

        printArray("array in reverse ",array);
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
