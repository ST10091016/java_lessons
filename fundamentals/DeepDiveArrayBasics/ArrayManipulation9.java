public class ArrayManipulation9 {
    public static void main(String[]args){

        //declare and initialise arrays by pre-populating them
        int[] arrayA = {3,4,2,6,4,7,9,1,0};
        int[] arrayB = {3,14,12,6,14,7,19,11,0};
        
        //calling the methods and passing in the parameters
        printArray("arrayA before subtracting ",arrayA);       
        printArray("arrayB before subtracting ",arrayB);
        
        //assigning the variable to the method so that it returns the value
        arrayA = sub(arrayA, arrayB);
        printArray("array after subtracting ",arrayA);       
    }
    
    //method that subracts the arrays by dealing with duplicates
    public static int [] sub(int[] arrayA,int[] arrayB){
        
        //declare and initialise variable
        int duplicateCount = 0;
        
        //nested for loop that checks for the amount of duplicates that the arrays have
        for(int i = 0; i < arrayA.length; i++){
            for(int j = 0; j < arrayB.length; j++){
                
                //if the value from that index in array a is equal to the value of that index in array b then increment the count
                if(arrayA[i] == arrayB[j]){
                    duplicateCount++; // 4 duplicates in total
                    arrayA[i] = -1; //initialising the duplicates to -1
                }
            }
        }
        
        //declare and initialise variables
        int newSize = arrayA.length - duplicateCount;

        //declaring and initialising the array to a new size 
        int[] newArrayC = new int[newSize];
        
        //declaring and initialising the counter variable
        int k = 0;

        for(int i = 0; i < arrayA.length; i++){
            
            //if the elements from the array don't equal to negative 1 then populate the new array
            if(arrayA[i] != -1){
                newArrayC[k++] = arrayA[i];
            }
        }
        
        //returning the values of the new array
        return newArrayC;
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
