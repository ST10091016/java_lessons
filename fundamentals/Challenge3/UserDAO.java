import java.util.Arrays;

public class UserDAO{
    
    //declare and initialise the main database 
	public static String[][] database = new String[0][0];
    
    //method create that handles the the creation of users
	public static void create(String name, String surname, String email, String dob, String id){
       
       //declare and initialise variables
       int row = database.length + 1;
       int column = database.length > 0 ? database[0].length : 5;
       
       //declare and initialise new array that is larger than the main database
       String[][] newDatabase = new String[row][column];
       
       //nested for loop that populates the new array with the values from the main database
       for(int i = 0; i < database.length; i++){
	       	for(int j = 0; j < database[i].length; j++){
	       		newDatabase[i][j] = database[i][j];
	       	}
       }
       
       //assigning the certain rows and columns with values 
       newDatabase[row - 1][0] = name;
       newDatabase[row - 1][1] = surname;
       newDatabase[row - 1][2] = email;
       newDatabase[row - 1][3] = dob;
       newDatabase[row - 1][4] = id;
       
       //reassigning the database to the database so that we make use of the new array to populate 
       database = newDatabase;
	}
        
        //method that deletes the users according to the email
		public static void delete(String email){

			//declare and initialise array that has a smaller rize in its rows as users are being removed
		    String[][] newDatabase = new String[database.length - 1][database[0].length];
		    
		    //declare and initialise variables
		    boolean isFound = false;
		    int newIndex = 0; 
            
            //nested for loop that checks the 
		    for(int i = 0; i < database.length; i++){

		    	//if statement that checks if the email does not equal to the value
		        if(!database[i][2].equals(email)){
		            
		            //if it doesnt then we loop through the column and populate the new array with the values from the database
		            for(int j = 0; j < database[i].length; j++){
		                newDatabase[newIndex][j] = database[i][j];
		            }
                    
                    //incrementing the index after the inner loop
		            newIndex++; 

		        } else {

		        	//if the email is equal to the value then the boolean gets set to true.
		            isFound = true;
		        }
		    }
            
            //if statement that checks if the email is false, if it is then an error message gets printed
		    if (!isFound) {
		        System.out.println("User with email " + email + " not found.");
		    }
            
            //reassigning the database to the database so that we make use of the new array to populate 
		    database = newDatabase;
	   }

        //method that updates the users details, without changing their email
		public static void update(String name, String surname, String email, String dob, String id){
	    
	    //declare and intialise variables
	    String[][] newDatabase = new String[database.length][database[0].length];
	    boolean isFound = false;
        
        //nested for loop that checks are email matches to the user that was created and saved
	    for(int i = 0; i < database.length; i++){
	        for(int j = 0; j < database[i].length; j++){
	            
	            //if statement that checks if the element is equal to the email
	            if(database[i][2].equals(email)){
	                
	                //the elements get assigned to the fields
	                newDatabase[i][0] = name;
	                newDatabase[i][1] = surname;
	                newDatabase[i][2] = email;
	                newDatabase[i][3] = dob;
	                newDatabase[i][4] = id;
	                
	                //setting the boolean to true
	                isFound = true;
	                
	                //once the email has been found and the values have been set, then it will break out of the loop and only populate once
	                break;
	            } else {
	                
	                //if it doesn't equal to the email then the values get stored into the new array
	                newDatabase[i][j] = database[i][j];
	            }
	        }
	    }
        
        //if else statements which checks if it is false
	    if (!isFound) {

	    	//prints to the user if its not found
	        System.out.println("User with email " + email + " not found.");
	    } else {
	        System.out.println("User with email " + email + " updated successfully.");
	         
	    }
        
        //reassigning the database to the new database
	    database = newDatabase;
	}
    
    //method that gets the users details according to their email
	public static String[] getUserByEmail(String email){
    
	    //declare and initialise 1d array with the size of 0
	    String[] getEmail = new String[database.length * database[0].length]; 
	    
	    //declare and initialse isFound to false
	    boolean isFound = false;
	    
	    //printing the user 
	    System.out.print("\nUser: ");

        //for loop that iterates through the row of the array
	    for (int i = 0; i < database.length; i++) {
	        
            //if statement that checks if the value and the email are equal
	        if (database[i][2].equals(email)) { 
	            
	            //reassigning/setting the new array to the row from the database
	            getEmail = database[i];
	            isFound = true;
                
                //printing the users details 
	            System.out.println(Arrays.toString(database[i]) + "\t");
	            break; 
	        }
	    }
        
        //if statement taht if the email is false then the error message gets displayed
	    if (!isFound) {
	        System.out.println("User with email " + email + " not found.");
	    }
        
        //returning the objects values
    	return getEmail;
	}
    
    //method that prints all of the users that have been added to the array
	public static String[] findAll(){
       
       //declare and intialise variables
	   int row = database.length;
       int column = database.length > 0 ? database[0].length : 5;
       
       //declare and intialise 1D array that has a size of 0
       String[] users = new String[row*column];
        
        //nested for loops that populates the 1d array with values from the 2d array
        for(int i = 0; i < database.length; i++){
	       	for(int j = 0; j < database[i].length; j++){

	       		//populating the 1d array with values from the 2d array
	       		users[j + (i * column)] = database[i][j];

	       		//printing the values
	       		System.out.print(users[j + (i * column)] + "\t");
	       	}

	       	System.out.println();
       }
       
       //returning the objects values
       return users;
    }
}