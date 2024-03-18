public class Menu{

	public static boolean menu(){
        
        //declare and initialise the variables.
        boolean isValidFlag = true;
        String prompt = null;
        
        //goes through the loop before checking the condition.
        do{
            
            //tests the block of code for any errors placed in the menu.
            try{

             //prompting the user through the menu.
             prompt = Prompter.prompt("\n\nWelcome to the calculator! \nSelect an option below to start: " 
            + "\n\n1 - Addition \n2 - Subtraction \n3 - Multiplication \n4 - Division \n5 - Modulus \n6 - To Exit\n\n");
               
            //converting the string prompt into an int, so that it could be used in the validate method.
            int input = Integer.parseInt(prompt);
            MenuValidator_Alternative.validate(input);
            
            //if statement that checks if the input is greater than 6 or less and equal to 0.
            if(input > 6 || input <= 0){
            
               System.out.print("Error! Please enter a number from the menu.");

               //sets the boolean to a false, so that the menu can be displayed/prompted again.
               isValidFlag = false;
            }
            
            //errors caught in the catch block from the wrong selection of the menu.
            }catch(Exception error){
               
               //printing out the error to the user.
               System.out.print("Error! Please enter a number.\n");
            }

        }while(prompt.isEmpty() || true);

		return true;
	}
}