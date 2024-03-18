public class MenuValidator_Alternative{
     
     //method that validates the input from the menu entered by the user.
	 public static boolean validate(int input){
        
        //switch case for the input.
        switch(input){
           
           //cases for the input and has no breaks because they lead to the same result.
           case 1:	
            operandsAndOperator(input);
           case 2: 
            operandsAndOperator(input);  
           case 3:
            operandsAndOperator(input);
           case 4:
            operandsAndOperator(input);
           case 5:

            //calling the method
            operandsAndOperator(input);
           	break;

          case 6:
            //exiting out of the program once the number 6 is selected from the menu.
            System.out.print("Thank you for using the calculator!");
            System.exit(0);
            break;
       }

       return true;
	 }


   //method the focuses on the prompting and reprompts from the user as well as displaying to the user.
   public static void operandsAndOperator(int input){
    
      //declare and initialise variables
      String num1 = null, num2 = null, operator = null;
      boolean isValidNum1 = false, isOp1 = false,  isValidNum2 = false;
       
       //while loop that prompts the user to enter their number, if its not valid, they get prompted again.
       while(!isValidNum1){
          
          num1 = Prompter.prompt("\nPlease enter the first number: ");
          isValidNum1 = NumberValidator.isValid1(num1);
            
       }
      

       //while loop thats set to true and prompts the user, if the operator is false then an error message is displayed.
       while(true){

        operator = Prompter.prompt("Please enter the operator ( + - * / % ): ");
        isOp1 = OperatorValidator.validate(operator);

            if(!isOp1){
             System.out.print("\nError! Invalid operator selection for this operation.\n");

           }else{
            

            //breaks our of the loop if the user inputs the correct operator.
            break;
           }
       }
        
        //while loop that prompts the user to enter their number, if its not valid, they get prompted again.
        while(!isValidNum2){
        
            num2 = Prompter.prompt("Please enter the second number: ");
            isValidNum2 = NumberValidator.isValid2(num2);

        } 

        //if else staements that check if the operator and the input from the menu are equal and then will print out the total.
        if(input == 1 && operator.equals("+"))
            //displaying the total to the user as well as the numbers and operators they selected.
            System.out.println("\nTotal: " + num1 + operator + num2 + " = " + Addition.add(Double.parseDouble(num1), Double.parseDouble(num2)));
        else if(input == 2 && operator.equals("-"))
              System.out.println("\nTotal: " + num2 + operator + num1 + " = " + Subtraction.subtract(Double.parseDouble(num1), Double.parseDouble(num2)));
        else if(input == 3 && operator.equals("*"))
              System.out.println("\nTotal: " + num1 + operator + num2 + " = " +  Multiplication.multiply(Double.parseDouble(num1), Double.parseDouble(num2)));
        
        else if(input == 4 && operator.equals("/")){

            if(Double.parseDouble(num2) == 0){
                System.out.println("\nError! Number cannot be divided by 0.");
        
                num2 = Prompter.prompt("Please enter the second number: ");
                isValidNum2 = NumberValidator.isValid2(num2);

                if(NumberValidator.isValid2(num2) == true){
                    System.out.println("\nTotal: " + num1 + operator + num2 + " = " +  Division.divide(Double.parseDouble(num1), Double.parseDouble(num2)));
                }

            }else{
                System.out.println("\nTotal: " + num1 + operator + num2 + " = " +  Division.divide(Double.parseDouble(num1), Double.parseDouble(num2)));
            }
        }

        else if(input == 5 && operator.equals("%"))
            System.out.println("\nTotal: " + num1 + operator + num2 + " = " +  Modulus.modulus(Double.parseDouble(num1), Double.parseDouble(num2)));
        else{
            System.out.print("Error! Your operator does not match your selection from the menu.");
            
        }
    }
}