public class MenuPrinter{
    
    //method that just prompts and dislays output to the user.
	public static void printMenu(){
       
       //declaring and initialising the variables.
       boolean no1 = false, no2 = false, op1 = false, isValidFlag = true;;
       String num1 = null, num2 = null, operator = null, option = null;
       
       //do while loop that executes the prompts first before checking the condition.
       do{
          
          try{
            
            //prompting the user with the menu.
          	option = Prompter.prompt("\n\nWelcome to the calculator! \nSelect an option below to start: " 
          + "\n\n1 - Addition \n2 - Subtraction \n3 - Multiplication \n4 - Division \n5 - Modulus \n6 - To Exit\n\n");
            
            //using the validate method to check if the option is true.
            op1 = MenuValidator.validate(Integer.parseInt(option));
        
             //becomes false again and if it is false, an error gets printed to the user.
	         if(!op1){
	            System.out.print("Invalid menu option. Please select only from the menu.");
	            continue;
	         }

          }catch(Exception error){

               System.out.print("Error! Please enter a number.\n");

               //goes back to the menu until a valid input has been used.
               continue;
          }


         //keeps looping until the condition is false (will break out of it) as it is now set to true.
         do{
            
            //prompting the user for the first number.
            num1 = Prompter.prompt("\nEnter the first number: ");
            no1 = NumberValidator.operandOne(num1);

	          if(!no1){
	            System.out.print("\nInvalid first number.");
	          }

         }while(!no1);

                //keeps looping until the condition is false (will break out of it) as it is now set to true.
	           do{
                  operator = Prompter.prompt("Enter the operator according to the option selected: ");
                  
                  //if all conditions are false then an error message gets shown.
                  if(!operator.equals("+") && !operator.equals("-") && !operator.equals("/") && !operator.equals("*") && !operator.equals("%"))
			             System.out.print("\nInvalid operator selection.\n");

	           }while(!operator.equals("+") && !operator.equals("-") && !operator.equals("/") && !operator.equals("*") && !operator.equals("%"));

 
                do{
                    num2 = Prompter.prompt("Enter the second number: ");
                    no2 = NumberValidator.operandOne(num2);

                    if(!no2)
                       System.out.print("\nInvalid second number.\n");

                }while(!no2); 

			                 //declaring and storing the converted values into the variables.
                             int selection = Integer.parseInt(option);
                             double operand2 = Double.parseDouble(num2);
                            
                            //switch case that checks if the operator matches.
					        switch(operatomr){
					         case "+":

					         	//checks if the operator and the selection from the menu are both true. If they are then their values get shown.
					         	if(operator.equals("+") && selection == 1)
					         	   System.out.print("\nTotal sum: " + num1 + operator + num2 + " = " + Addition.add(Double.parseDouble(num1), Double.parseDouble(num2)));
					         	break;
					         case "-":
					         	if(operator.equals("-") && selection == 2)
					         	System.out.print("\nTotal difference: " + num2 + operator + num1 + " = " + Subtraction.subtract(Double.parseDouble(num1), Double.parseDouble(num2)));
					         	break;
					         case "*":
					         	if(operator.equals("*") && selection == 3)
					         	System.out.print("\nTotal: " + num2 + operator + num1 + " = " + Multiplication.multiply(Double.parseDouble(num1), Double.parseDouble(num2)));
					         break;
					         case "/":
					         	if(operator.equals("/") && selection == 4){

					         		//checks if the second number is equal to zero, if it does then they get prompted again.
					         		if(operand2 == 0){
					         			
					         			System.out.print("\nInvalid number. Not divisible by zero.");

					                do{		

				                    num2 = Prompter.prompt("\nEnter the second number: ");
				                    no2 = NumberValidator.operandOne(num2);

				                    if(!no2)
				                       System.out.print("\nInvalid second number.\n");
				                   else
				                   	System.out.print("\nTotal: " + num2 + operator + num1 + " = " + Division.divide(Double.parseDouble(num1), Double.parseDouble(num2)));

                                    }while(!no2);

					         		}else{
					         			System.out.print("\nTotal: " + num2 + operator + num1 + " = " + Division.divide(Double.parseDouble(num1), Double.parseDouble(num2)));
					         		}
					         		
					         	}
					         	break;
					         case "%":
					         	if(operator.equals("%") && selection == 5)
					         	System.out.print("\nTotal: " + num1 + operator + num2 + " = " + Modulus.modulus(Double.parseDouble(num1), Double.parseDouble(num2)));
					         	break;
					         default:
					         	System.out.print("\nInvalid operator selection from the menu.\n");
					         	break;
					        } 

          //goes through the loop if its true and if the user doesn't enter a value.      
          }while(true || option.isEmpty());
	}
}