class MenuValidator{
    
    //method that checks if the menu is valid from the users input
	public static boolean isValid(int option){
        
        //making use of a switch case, which checks if the option matches the case
        switch(option){
        case 1:
            //calling the method
        	CreateUser.add();
        	break;
        case 2:
            //calling the method
            DeleteUser.delete();
        	break;
        case 3:
            //calling the method
            UpdateUser.promptForEmail();
        	break;
        case 4:
            //calling the method
            UserDAO.findAll();
        	break;
        case 5:
            System.out.print("Menu exited.");
            //using the exit method to stop running the program
            System.exit(0);
            break;
        default:
            //printing a message to the user if they select a higher or lower number
        	System.out.print("Invalid option! Please select an option that is on the menu.");
        	//allows there to be looping again
            return false;
        }
        
        //returning false for the method
        return false;
	}
}