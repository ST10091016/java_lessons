import java.util.Arrays;
import java.util.Scanner;

public class CodeAlong3Menu{

	//declaring and initialising the 2d array with 10 arrays and 10 elements
  private static int[][] array = {{1,2,3,4,5,6,7,8,9,10}, {11,12,13,14,15,16,17,18,19,20},{21, 22,23,24,25,26,27,28,29,30}, {31,32,33,34,35,36,37,38,39,40}, {41,42,43,44,45,46,47,48,49,50},
                          {51,52,53,54,55,56,57,58,59,60}, {61,62,63,64,65,67,68,69,70}, {71,72,73,74,75,76,77,78,79,80}, {81,82,83,84,85,8,87,88,89,90}, {91,92,93,94,95,96,97,98,99,100}};
  
  public static void main(String[] args){
      
      //calling the menu
      printMenu();
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

            //helps in not allowing the column to be printed so many times
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

  /*STEP 4*/
  //method that prints the menu to the user
  public static void printMenu(){

    //declaring and initialising variables
    String option = null;
    int intOption = 0;
    
    //creating an object
    Scanner input = new Scanner(System.in);
    
    //while loop that continues to prompt the user until they have selected a correct option
    while(true){
      
      //printing to the user
    	System.out.print("\nSelect an option from the menu: \n1 - Print Row \n2 - Print Column \n3 - Print Cell \n4 - Exit Program \n");
      option = input.nextLine();
      
      //if the option is empty then the user gets an error message and get prompted again
      if(option.isEmpty()){
    		System.out.print("Invalid! Menu selection cannot be empty. \n");
    		continue;
    	}
      
      //try and catch, which tests the input of the user, if theres an error them it goes to the catch
    	try{
        
        //parsing the option to an int
        intOption = Integer.parseInt(option);
        
        //switch case that checks the option selected from the user
        switch(intOption){
          
          //the intOption matches the cases, if the option matches one of the cases then the methods get called.
          case 1:
          	 promptRow();
          	break;
          case 2:
          	 promptColumn();
          	break;
          case 3:
             promptCell();
          	break;
          case 4:
          	System.out.print("Exiting Program. \n");
          	System.exit(0);
           break;

           //used for if the user selects any other number that is not on the menu
          default:
          	System.out.print("Error! Invalid menu option. \n");

          	//goes back to the beginning of the loop
          	continue;
        }
      
      //catch that prints out the error message if the selects anything other than a number
    	}catch(NumberFormatException error){
    		System.out.print("Error! Invalid menu option must be a number.\n");
    		continue;
      }
    }
  }
  
  //method that prompts the user to enter a number for the row
  public static void promptRow(){
    
    //decalring and initialising number to null
    String number = null;

    Scanner input = new Scanner(System.in);
    
    //while loop that will stop once the input is valid
    while(true){
    
    //prompting the user for the row number
    System.out.print("\nEnter a number to get the row: ");
    number = input.nextLine();
      
      //checking if the input by the user is empty
      if(number.isEmpty()){
    		System.out.print("Invalid! Row cannot be empty. \n");
    		continue;
    	}
      
      //try and catch that tests the input for the row from the user, if there is an error, it goes into the catch
	    try{
        
        //parsing the number string to an integer
	    	int intRow = Integer.parseInt(number);
        
        //checking if one of the options entered by the user is false, if its false then an error message gets printed out
	    	if(intRow >= array.length || intRow < 0){

	    		System.out.print("Error! Row " + intRow + " out of bounds.\n");
    		  //allows the loop to go to the beginning
          continue;

	    	}else{

          //calling the method
	    		getRow(intRow);
	    	}
	     
	    }catch(NumberFormatException error){

	        System.out.print("Error! Row value must be a number.\n");
	    		continue;
	    }
      
      //helps to break out of the loop to not continuosly ask the user to enter a number
	    break;
    }   
  }

  public static void promptColumn(){
    
    //declaring and initialising the number to null
    String number = null;
    
    //creating an object
    Scanner input = new Scanner(System.in);
    
    //while loop that iterates for the prompts of the user
    while(true){
    
    //prompting the user
    System.out.print("\nEnter a number to get the column: ");
    number = input.nextLine();

      if(number.isEmpty()){
    		System.out.print("Invalid! Column cannot be empty. \n");
    		continue;
    	}
      
     //try and catch that tests the input for the column from the user, if there is an error, it goes into the catch
	    try{

	    	int intCol = Integer.parseInt(number);

	    	if(intCol >= array.length || intCol < 0){

	    		System.out.print("Error! Column " + intCol + " out of bounds.\n");
    		  continue;

	    	}else{
          
          //calling the column
	    		getColumn(intCol);
	    	}
	     
	    }catch(NumberFormatException error){

	        System.out.print("Error! Column value must be a number.\n");
	    		continue;
	    }
      
      //helps to break out of the loop to not continuosly ask the user to enter a number
	    break;
    }   
  	
  }
  
  //method that prompts the user for a cell
  public static void promptCell(){
  	
    //declare and initialise the variables
    String row = null, column = null;

    //creating an object
    Scanner input = new Scanner(System.in);
    
    //while loop that will stop once the input is valid
    while(true){
    
    //prompting the user for the row number
    System.out.print("\nEnter a number to get the row: ");
    row = input.nextLine();
    
    //prompting the user for the column number
    System.out.print("\nEnter a number to get the column: ");
    column = input.nextLine();
      
      //checking if the row or column is empty
      if(row.isEmpty() || column.isEmpty()){
    		System.out.print("Invalid! Cell cannot be empty. \n");
    		continue;
    	}

      //try and catch that tests the input made by the user, if there is an input other than a number, it goes into the error
	    try{
        
        //parsing the row and column to an int
	    	int intRow = Integer.parseInt(row);
        int intCol = Integer.parseInt(column);
        
        //if statements that checks if both of the cells are out of bounds
	    	if((intRow >= array.length || intRow < 0) && (intCol >= array.length || intCol < 0)){

	    		System.out.print("Error! Cell " + intRow + "," + intCol + " out of bounds.\n");
    		  continue;
        
        //if statement that checks if the row is out of bounds
	    	}else if(intRow >= array.length || intRow < 0){

          System.out.print("Error! Row " + intRow + " out of bounds.\n");
    		  continue;
	    	
        //if statement that checks if the column is out of bounds
	    	}else if(intCol >= array.length || intCol < 0){
	    		
	    		System.out.print("Error! Column " + intCol + " out of bounds.\n");
    		  continue;

	    	}else{
	    		
          //calling the method
	    		getCell(intRow, intCol);
	    	}
	     
	    }catch(NumberFormatException error){
          
          //printing an error message
	        System.out.print("Error! Cell value must be a number.\n");
	    		continue;
	    }

      //helps to break out of the loop to not continuosly ask the user to enter a number
	    break;
    } 
  }
}