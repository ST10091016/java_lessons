class MenuPrinter{
	public static int print(){
       
       //declare and initialise variable
       int intOption = 0; 
        
        //do while loop that prompts the user at least once before checking the condition
        do{
           
           //displaying and prompting the user
       	   String option = Prompter.prompt("\n\nSelect an option from the menu to proceed: \n1 - Add a user \n2 - Delete a user \n3 - Update a user \n4 - List/Display users \n5 - Exit menu\n\n");
            
            //try and catch where the try tests if the user has entered what has been asked for such as an int
       	    try{

       	    	intOption = Integer.parseInt(option);

       	    }catch(Exception error){
                
                //prompts the user again
	       	   	continue;
       	    }
        
        //checks if the option from the user is valid. menu validator returns false
        }while(!MenuValidator.isValid(intOption));
        
        //returning an int value
        return intOption;
	}
}