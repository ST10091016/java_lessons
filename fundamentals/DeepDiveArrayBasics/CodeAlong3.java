import java.util.Arrays;

public class CodeAlong3{

	//declaring and initialising the 2d array with 10 arrays and 10 elements
	private static int[][] array = {{1,2,3,4,5,6,7,8,9,10}, {11,12,13,14,15,16,17,18,19,20},{21, 22,23,24,25,26,27,28,29,30}, {31,32,33,34,35,36,37,38,39,40}, {41,42,43,44,45,46,47,48,49,50},
                          {51,52,53,54,55,56,57,58,59,60}, {61,62,63,64,65,67,68,69,70}, {71,72,73,74,75,76,77,78,79,80}, {81,82,83,84,85,86,87,88,89,90}, {91,92,93,94,95,96,97,98,99,100}};
	
	public static void main(String[] args){
      
      //calling the methods
	  	getRow(3);
	  	getColumn(5);
	  	getCell(5,5);
	}

	/*STEP 1*/  
  //method that gets the row from the array and has a parameter of row
	public static int getRow(int row){

    //declare and initialise rowfound to false, this helps with the error message
    boolean rowFound = false;

    //for loop that helps with printing the row from the array
		for(int i = 0; i < array.length; i++){
        
        //if the value is equal to the row number then the row gets printed
        if(i == row){

            System.out.print("Values in row " +  row + " -> " + Arrays.toString(array[row]));
            
            //setting/assigning the value of the boolean to true if the row has been found
            rowFound = true;
        }
		}
    
    //if the row is false then the error message gets printed out
		if(!rowFound){
			throw new ArrayIndexOutOfBoundsException("Error! Row " + row + " out of bounds.");
		}

		return row;
	}

  /*STEP 2*/
  //method that gets the column from the array and has a parameter of column
  public static int getColumn(int column){
  
    //declare and initialise colFound to false, this helps with the error message
    boolean colFound = false;
    
    System.out.print("\nValues in column " +  column + " -> \n");
    System.out.print("[ ");

    //for loop that helps with printing the row from the array
		for(int i = 0; i < array.length; i++){		
			for(int j = 0; j < array[i].length; j++){

				//if the value is equal to the column number then the column gets printed
        if(j == column){
        	System.out.print(array[i][j]);

        	 if(i != array.length-1){
        	 	  System.out.print(", ");	
              colFound = true;	
        	  }
        }  
			}
		}
		System.out.print("] ");
   
    //if the column is false then the error message gets printed out
		if(!colFound){
			throw new ArrayIndexOutOfBoundsException("Error! column " + column + " out of bounds.");
		}

		return column;
	}

	/*STEP 3*/
  //method that gets the column from the array and has a parameter of column
  public static void getCell(int row, int column){
  
    //declare and initialise colFound to false, this helps with the error message
    boolean rowFound = false;
    boolean colFound = false;

    //for loop that helps with printing the row from the array
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){

				//if the value is equal to the column number then the column gets printed
        if(i == row || j == column){
            System.out.print("\nValues in the cell " +  row + "," +  column +  " -> " + array[row][column]);
            
            //setting/assigning the value of the boolean to true if the column has been found
            rowFound = true;
            colFound = true;

            //only prints once and then breaks out of the loop
            break;   	
        }
			}
			break; 
		}
    
    //if the column is false then the error message gets printed out
		if(!rowFound || !colFound){
			throw new ArrayIndexOutOfBoundsException("Error! Row " + row  + " or column " + column + " out of bounds");
		}
  } 
}