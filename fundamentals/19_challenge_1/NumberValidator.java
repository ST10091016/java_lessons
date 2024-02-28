
public class NumberValidator{
	
	 //method that validates the number of the distance, to check if its a number or fraction
	 public static boolean isValid(String distance){

        //the date is empty then it will print out that it is empty
		if(distance.isEmpty()){

            System.out.println("\nThe distance cannot be empty. \nPlease re-enter the distance.\n");
		    return false;
		}
        
        //tries and executes the distance, if theres an error with it then the error is caught and a message is displayed to the user
		try{

            double distanceNum = Double.parseDouble(distance);
            return true;

		}catch(NumberFormatException error){
       
             System.out.println("\nInvalid distance. \nPlease enter the distance as a number.\n");
			 return false;
		}

    }
}