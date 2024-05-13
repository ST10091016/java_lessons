class CreateUser{
    
    //declaring a global variable that has a default value and does not have to be 
	public static int id;
    
    //method that adds a new user
	public static void add(){
        
        //declare and initialise variables
		String name = null, surname = null, email = null, dob = null;
		boolean isLoop = true;
        
        //do while loop that prompts the user first before checking the condition
	    do{
            
            //prompting the user 
	        name = Prompter.prompt("Enter name: ");
			
			//if statement that checks if the name is empty
			if (name.isEmpty()){
				System.out.print("\nInvalid! Name cannot be empty.\n");
		   	    
		   	    //if its empty, the user gets prompted again
		   	    continue;

			}else{
                 
                //setting it to false so that it breaks out of the loop
				isLoop = false;
			}

	    }while(isLoop);
         
        //do while loop that prompts the user first before checking the condition
	    do{
            
            //prompting the user 
	    	surname = Prompter.prompt("Enter surname: ");
            
            //if statement that checks if the surnname is empty
			if(surname.isEmpty()){
				System.out.print("\nInvalid! Surname cannot be empty.\n");
		   	    
		   	    //if its empty, the user gets prompted again
		   	    continue;
			}

	    }while(surname.isEmpty());
        
        //do while loop that prompts the user first before checking the condition
	    do{
            
            //prompting the user 
			email = Prompter.prompt("Enter email: ");

		}while(!EmailValidator.isValid(email));

        //do while loop that prompts the user first before checking the condition
		do{
		    
		    //prompting the user 
		    dob = Prompter.prompt("Enter date of birth: ");

	   }while(!DateValidator.isValid(dob));
        
        //if statement that checks if all the fields are not empty. if they aren't empty then it gets saved 
		if(!name.isEmpty() & !surname.isEmpty() & !email.isEmpty() & !dob.isEmpty()){
            
            //incrementing the id, starts at 1
			id++;
            
            //printing to the user
			System.out.print("\nHello " + name + " " + surname + " you are " + AgeCalculator.calculate(dob) + " years-old and your details have been saved into the database.");
		    
            //using the method create and passing in the parameters
		    UserDAO.create(name, surname, email, dob, Integer.toString(id));
	    }
	}
}