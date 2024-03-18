import java.util.*;

public class MenuValidator{
    
    //method that validates the option selected by the user.
	public static boolean validate(int option){
        
        //switch that checks if the options match through the cases
        switch(option){
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        	return true;
        case 6:
        	//exits the calculator
        	System.out.print("Thank you for using the calculator.");
            System.exit(0);
            break;
        default:
        	return false;
        }

		return true;
	}
}