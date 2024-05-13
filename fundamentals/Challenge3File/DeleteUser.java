class DeleteUser{

	//method that handles the deleting of the users
	public static void delete(){
        
        //declare and initialise variables
		String email = null, option = null;
        
        //do while loop that executes the body once before checking the condition
	    do{
            
            //prompting the user 
	    	email = Prompter.prompt("Enter email: ");
            
            //if else statement that checks if the email is empty, if its not the user gets prompted
		    if(email.isEmpty()){

		    	//printing an error message to the user
				System.out.print("\nInvalid! Email cannot be empty.\n");
				continue;

			}else{
                
               //getting the details of that user according to the email.
			   UserDAO.getUserByEmail(email);
               
               //prompting the user
               option = Prompter.prompt("Are you sure that you want to delete this user? (Y/N)\n");
			   
			   //if and else if statement that checks if the input is equal
			   if(option.equals("Y") | option.equals("y")){
                    
                    //notifying the user
			   	    System.out.print("\nUser has been deleted!");

			   	    //callig the method to delete the method
                    UserDAO.delete(email);

			   }else if(option.equals("N") | option.equals("n")){
                    
                    //calling the method
                    MenuPrinter.print();

			   }else{

			   	   //prints out if the user has selected anything other than a y or n
			   	   System.out.print("\nInvalid! Please choose only one of the 2 options.");
			   	   continue;
			   }
			}

	    }while(!EmailValidator.isValid(email));
    }
}