public class MenuValidator{
     
     //method that validates the menu selection from the user.
	 public static boolean validate(int input){
        
        //switch that checks which input matches.
        switch(input){
            
           case 1:	
            //callling the method.
            numberPrompt(input);
            break;
           case 2: 
           numberPrompt(input); 
            break;
           case 3:
            numberPrompt(input);
            break;
           case 4:
            numberPrompt(input);
            break;
           case 5:
            numberPrompt(input);
           	break;
          case 6:
            //exiting the menu.
            System.out.print("Thank you for using the calculator!");
            System.exit(0);
            break;
       }

       return true;
	 }
   
   //method that handles the prompts and reprompts with the number, operator and second number.
   public static void numberPrompt(int input){
       
       //declare and initialise variabales
      String num1 = null, num2 = null, operator = null;
      boolean isValid = false, isOp1 = false, isValidNum2 = false;
      
      //while it is true, the first number gets prompted to the user until it is false.
      while(!isValid){

         num1 = Prompter.prompt("\nPlease enter the first number: ");

         //checks if the number is valid by it being true.
         isValid = NumberValidator.isValid1(num1);
      } 
  
      while(!isOp1){
       
       //prompting the user for the operator.
       operator = Prompter.prompt("Please enter the operator ( + - * / % ): ");
        
         //checks if the operator and the input are both true
         if(operator.equals("+") && input == 1){

                  while (!isValidNum2) {
                  
                  //prompts the user for the second number each time the loop is true until it exits until its false
                  num2 = Prompter.prompt("Please enter the second number: ");
                  isValidNum2 = NumberValidator.isValid2(num2);
                  
                  //if the second number is false then the user gets an error message and will get prompted again
                  if (!isValidNum2) {
                      System.out.println("\nError! Please enter a valid second number.");
                  }
              }
            
            //priting out the results back to the user.
            System.out.print("\nTotal: " + num1 + operator + num2 + " = " + Addition.add(Double.parseDouble(num1), Double.parseDouble(num2)));
            
            //allows for the menu to be displayed again after displaying the results.
            isOp1 = true;
         }
         else if(operator.equals("-") && input == 2){

               while (!isValidNum2) {

               num2 = Prompter.prompt("Please enter the second number: ");
               isValidNum2 = NumberValidator.isValid2(num2);

               if (!isValidNum2) {
                   System.out.println("\nError! Please enter a valid second number.");
               }
           }
            System.out.print("\nTotal: " + num2 + operator + num1 + " = " + Subtraction.subtract(Double.parseDouble(num1), Double.parseDouble(num2)));
            isOp1 = true;
         }
         else if(operator.equals("*") && input == 3){

               while (!isValidNum2) {

               num2 = Prompter.prompt("Please enter the second number: ");
               isValidNum2 = NumberValidator.isValid2(num2);

               if (!isValidNum2) {
                   System.out.println("\nError! Please enter a valid second number.");
               }
           }

            System.out.print("\nTotal: " + num1 + operator + num2 + " = " + Multiplication.multiply(Double.parseDouble(num1), Double.parseDouble(num2)));
            isOp1 = true;
         }
         else if(operator.equals("/") && input == 4){    
            
            while (!isValidNum2) {

                  num2 = Prompter.prompt("Please enter the second number: ");
                  isValidNum2 = NumberValidator.isValid2(num2);

                  if (!isValidNum2) {
                     
                      System.out.println("\nError! Please enter a valid second number.");
                  
                  }else{

                  System.out.print("\nTotal: " + num1 + operator + num2 + " = " + Division.divide(Double.parseDouble(num1), Double.parseDouble(num2)));
                  isOp1 = true;
              }
            } 
         }
         else if(operator.equals("%") && input == 5){
                  while (!isValidNum2) {

                  num2 = Prompter.prompt("Please enter the second number: ");
                  isValidNum2 = NumberValidator.isValid2(num2);

                  if (!isValidNum2) {
                      System.out.println("\nError! Please enter a valid second number.");
                  }
              }
            System.out.print("\nTotal: " + num1 + operator + num2 + " = " + Modulus.modulus(Double.parseDouble(num1), Double.parseDouble(num2)));
            isOp1 = true;
         }else{
            //if the operators dont match, then an error message gets printed to the user.
            System.out.print("\nError! Please select a valid operator.\n");
         }
      }    
   }
}