import java.lang.System;
public class String2{
	public static void main(String[] args){
		
		//declaring and initialising the variable
		String line = "1,4,3,2,3,7,5,6,9\n"+
                      "8,6,3,7,3,7,5,6,9\n"; 
       
        //declaring and initialising the variables
        String[] array = line.split("\n");
        int values = array[0].split(",").length;
        int[][] intArray = new int[array.length][values];

        //calling the methods and assigning the variable to the methods
        intArray = populateArray(intArray, array);
        printArray("Unsorted array: \n", intArray);
	    intArray = ascendingOrder(intArray);
	    printArray("\nArray in ascending order: \n", intArray);
	    intArray = descendingOrder(intArray);
	    printArray("\nArray in descending order: \n", intArray);

	}
    
    //method that populates the a new array
	public static int[][] populateArray(int[][] intArray, String[] array){
        
        //looping through the row of the array
		for(int i = 0; i < array.length; i++){
			//intitalising the values array to the split method
		    String[] values = array[i].split(",");

		    //looping through the values so that the elements get added to the row and column of the new array
			for(int j = 0; j < values.length; j++){
                intArray[i][j] = Integer.parseInt(values[j]);
			}
		}
        
        //returning the object of the array
		return intArray;
	}
    
    //method that prints out the elements that are in the array
	public static void printArray(String display, int[][] array){
		
		//printing the string first
		System.out.print(display);

		//iterating through the array/row
		for(int i = 0; i < array.length; i++){
			//iterating through the elements of the array
			for(int j = 0; j < array[i].length; j++){

				//printing out each element/value 
				System.out.print(array[i][j] + " ");
			}
            
            //making the printing look better
			System.out.println();
		}
	}
    
    //method that returns the object and takes the elements in the array and puts it into ascending order
	public static int[][] ascendingOrder(int[][] array){

		//looping through the row of the array
		for(int i = 0; i < array.length; i++){
			//looping through the columns of the array
			for(int j = 0; j < array[i].length - 1; j++){
				//loop for the swapping of the elements in the row
				for(int k = 0; k < array[i].length - j - 1; k++){
                   
                   //if statement that checks if the adjacent element is smaller then it gets moved up
                   if(array[i][k] > array[i][k+1]){
	                   int temp = array[i][k];
	                   array[i][k] = array[i][k + 1];
	                   array[i][k + 1] = temp;
                   }
				}
			}
		}
        
        //returning the object
		return array;
	}
    
    //method that returns the object and takes the elements in the array and puts it into descending order
	public static int[][] descendingOrder(int[][] array){
		//looping through the row of the array
		for(int i = 0; i < array.length; i++){
			//looping through the columns of the array
			for(int j = 0; j < array[i].length - 1; j++){
				//loop for the swapping of the elements in the row
				for(int k = 0; k < array[i].length - j - 1; k++){
                   
                   //if statement that checks if the adjacent element is greater then it gets moved up
                   if(array[i][k] < array[i][k+1]){
	                   int temp = array[i][k];
	                   array[i][k] = array[i][k + 1];
	                   array[i][k + 1] = temp;
                   }
				}
			}
		}
        
        //returning the object
		return array;
	}
}