public class Sorting3{
	public static void main(String[] args){
        
        //declare and populate an array with 50 values
	    int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
	    
	    //calling the method to print the array before any changes made to the array
	    printArray("Array before adding any elements: ", array);

	    //assigning the variable to the method 
	    array = addingElements(array);
         
        //calling the method to print the array after the changes made to the array
	    printArray("\nArray after adding elements: ", array);
        
        //calling method
	    ascendingOrder(array);
	    printArray("\nArray in ascending order: ", array);
	}
    
    //method that prints out the arryays values at each index
	public static void printArray(String display, int[] array){
		
		//printing out the string value
		System.out.println(display);

		//for loop that prints out the values in the array from each index
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
    
    //method that adds elements to the array and returns the object
	public static int[] addingElements(int[] array){
	     
	    //declare and initialise array with a size of 70
		int[] newArray = new int[array.length + 20];
        
        //for loop that takes the vales from the array and stores it into the new array
		for(int i = 0; i< array.length; i++){
			newArray[i] = array[i];
		}
        
      //adding a number to the positions value on top of that value at that position
		newArray[newArray.length - 50] = 60 + newArray[newArray.length - 50];
		newArray[newArray.length - 9] = 61 + newArray[newArray.length - 9];
        
        //returning the object, the values
		return newArray;
	}
    
    //method that takes the elements from the array and puts them into ascending order
	public static void ascendingOrder(int[] array){
        
        //nested for loop that akes use of a bubble sort algorithm to place the values from smallest to biggest
        for(int i = 0; i < array.length - 1; i++){
         	for(int j = 0; j < array.length - 1 - i; j++){
                
                //if statement that checks if the adjacent value is smaller, if it is it gets swapped
                if(array[j] > array[j+ 1]){
                   int temp = array[j];
                   array[j] = array[1+j];
                   array[j+1] = temp;
                }
         	}
        }
	}
}