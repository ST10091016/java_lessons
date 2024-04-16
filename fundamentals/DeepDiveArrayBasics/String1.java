public class String1{
	public static void main(String[] args){
        
        //declare and intitialise variable
		String line = "1,4,3,2,3,7,5,6,9"; 
        
        //declare and initialise array by taking the delimiter in the split method and splitting it into substrings
		String[] strArray = line.split(",");
		int[] array = new int[strArray.length];
        
        //calling the methods and assigning the variables to those methods
		array = populateArray(array, strArray);
        printArray("Unsorted array: ", array);
	    array = ascendingOrder(array);
	    printArray("\nArray in ascending order: ", array);
	    array = descendingOrder(array);
	    printArray("\nArray in descending order: ", array);
		
	}
    
    //method that populates the array with the values from the string array
	public static int[] populateArray(int[] array, String[] strArray){
		
		//for loop that keeps iterating until the condition is false where the values from the string array are being stored in the int array
		for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(strArray[i]);
		}
        
        //returning the object
		return array;
	}
    
    //method that prints out the elements in the array that are in each index
	public static void printArray(String display, int[] array){
		
		//printing out the display before the elements
		System.out.print(display);

		//for loop that prints the elements from each index until the condition is false
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
    
    //method that uses the bubble sort algorithm where the values in the array are printed out from smallest to biggest
	public static int[] ascendingOrder(int[] array){

		//nested for loop that loops until the conditions are false
		for(int i = 0; i < array.length - 1; i++){
			for(int j = 0; j < array.length - 1 - i; j++){
                
                //if statement that checks if the values/elements in the array that are adjacent are smaller
                if(array[j] > array[j+1]){
                   
                   //storing the element in the array in temp
                   int temp = array[j];
                   //resassing the value to the adjacent element
                   array[j] = array[j + 1];
                   array[j + 1] = temp;
                }
			}
		}

		return array;
	}
    
    //method that uses the bubble sort algorithm where the values in the array are printed out from biggest to smallest
	public static int[] descendingOrder(int[] array){
        
        //nested for loop that loops until the conditions are false
        for(int i = 0; i < array.length - 1; i++){
			for(int j = 0; j < array.length - 1 - i; j++){
                
                //if statement that checks if the values/elements in the array that are adjacent are bigger
                if(array[j] < array[j+1]){
                   
                   //storing the element in the array in temp
                   int temp = array[j];
                   //resassing the value to the adjacent element
                   array[j] = array[j + 1];
                   array[j + 1] = temp;
                }
			}
		}
        
        //returning the object
		return array;
	}
}