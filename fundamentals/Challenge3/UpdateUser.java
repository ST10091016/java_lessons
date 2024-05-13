import java.util.Random;

class UpdateUser{
    
    //method that prompts the user for their email
    public static void promptForEmail(){
        
        //declare and initialise variable
    	String email = null;
        
        //do while loop that executes at least once before checking the condition
    	do{
            
            //prompt the user 
			email = Prompter.prompt("\nEnter email: ");
                
                //if the email is empty then print an error message 
				if(email.isEmpty()){
					System.out.print("\nInvalid! Email cannot be empty.\n");
				   	
				   	//loop again from the start, by asking the user to enter their email
				   	continue;

			    }else{

			    	//retrieves the users details according to the email
			    	UserDAO.getUserByEmail(email);
			    	//calls the method
                    updateAllProperties();
			    }

		}while(!EmailValidator.isValid(email));

    }
    
    //method that prompts the users to update the details
	public static void updateAllProperties(){
        
        //declare and initialise variables
		String name = null, surname = null, email = null, dob = null;
        
        //do while loop that executes at least once before checking the condition
	    do{
            //prompting the user 
	        name = Prompter.prompt("Enter name: ");
			
			//if statement which checks if the name is empty from the user
			if (name.isEmpty()){
				System.out.print("\nInvalid! Name cannot be empty.\n");
		   	    
		   	    //allows the loop go to from the beginning again
		   	    continue;
			}

	    }while(name.isEmpty());
        
        //do while loop that executes at least once before checking the condition
	    do{
            
            //prompting the user 
	    	surname = Prompter.prompt("Enter surname: ");

			if(surname.isEmpty()){
				System.out.print("\nInvalid! Surname cannot be empty.\n");

		   	    //allows the loop go to from the beginning again
		   	    continue;
			}

	    }while(surname.isEmpty());
        
        //do while loop that executes at least once before checking the condition
	    do{
  
			email = Prompter.prompt("Enter email: ");

				if(email.isEmpty()){
					System.out.print("\nInvalid! Email cannot be empty.\n");
				   	
				   	//allows the loop go to from the beginning again
				   	continue;
			    }

		}while(!EmailValidator.isValid(email));

        //do while loop that executes at least once before checking the condition
		do{
		    
		    //prompting the user
		    dob = Prompter.prompt("Enter date of birth: ");

	   }while(!DateValidator.isValid(dob));
        
        //if statement that checks if all of the fields are not empty
		if(!name.isEmpty() & !surname.isEmpty() & !email.isEmpty() & !dob.isEmpty()){
			
			//call the method and pass in the parameters
			UserDAO.update(name, surname, email, dob, Integer.toString(CreateUser.id));
	   }
}   }