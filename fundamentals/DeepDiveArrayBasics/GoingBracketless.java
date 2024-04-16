public class GoingBracketless{
	public static void main(String[] args){
      
      //declare and initialise an empty array of 11
      int[] array = new int[11];

      //calling the methods
      populateArray(array);
      print(array);
	}
    
    //method that populates the array from 0 - 10
	public static void populateArray(int[] array){

		//for loop that gives each index a value
		for(int i = 0; i < array.length; i++)
      	    array[i] =  i;
	}
    
    //method that prints the value from the indexes that have a a condition that is true
	public static void print(int[] array){
		
      for(int i = 0; i < array.length; i++)

      	//if else statements that check if the values are greater AND smaller, then a print is displayed 
      	if(array[i] > 1 && array[i] < 3)
      		System.out.println(array[i] + " is greater than 1");
      	else if(array[i] > 2 && array[i] < 4)
      		System.out.println(array[i] + " is greater than 2");
      	else if(array[i] > 3 && array[i] < 5)
      		System.out.println(array[i] + " is greater than 3");
      	else if(array[i] > 4 && array[i] < 6)
      		System.out.println(array[i] + " is greater than 4");
      	else if(array[i] > 5 && array[i] < 7)
      		System.out.println(array[i] + " is greater than 5");
      	else if(array[i] > 6 && array[i] < 8)
      		System.out.println(array[i] + " is greater than 6");
      	else if(array[i] > 7 && array[i] < 9)
      		System.out.println(array[i] + " is greater than 7");
      	else if(array[i] > 8 && array[i] < 10)
      		System.out.println(array[i] + " is greater than 8");
      	else if(array[i] > 9 && array[i] < 11)
      		System.out.println(array[i] + " is greater than 9");
	}
}