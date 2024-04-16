public class ArrayManipulation8 {
    public static void main(String[]args){

        //declare and initialise arrays by pre-populating them
        int[] arrayA = {3,4,2,6,4,7,9,1,0};
        int[] arrayB = {13,14,12,16,14,17,19,11,10};
        
        //calling the methods and passing in the parameters
        printArray("arrayA before merging ",arrayA);
        printArray("arrayB before merging ",arrayB);

        //assigning the variable to the method
        arrayB = merge(arrayA, arrayB);
        printArray("array after merging ",arrayB);
    }

    public static int [] merge(int[] arrayA,int[] arrayB){

        //declare and initialise a new array that is the size of the two arrays combined
        int[] arrayC = new int[arrayA.length + arrayB.length];

        //using a for loop to go through the elements of array A
        for(int i = 0; i < arrayA.length; i++){
            
            //storing the values from array a into array c
            arrayC[i] = arrayA[i];
        }
         
        //using a for loop to go through the elements of array b
        for(int i = 0; i < arrayB.length; i++){
            
            //adding the values from array b to the array a and storing it into array c
            arrayC[i + arrayA.length] = arrayB[i];
        }

        //returning the values inside array c
        return arrayC;
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
