public class MenuValidator{

	 public static boolean validate(int input){
        
        switch(input){
            
           case 1:
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
            System.out.print("Thank you for using the calculator!");
            System.exit(0);
            break;
       }

       return true;
	 }

   public static void numberPrompt(int input){

      String num1 = null, num2 = null, operator = null;
      boolean isValid = false, isOp1 = false, isValidNum2 = false;

      while(!isValid){

         num1 = Prompter.prompt("\nPlease enter the first number: ");
         isValid = NumberValidator.isValid1(num1);
      } 
  
      while(!isOp1){
              
       operator = Prompter.prompt("Please enter the operator ( + - * / % ): ");
        
         if(operator.equals("+") && input == 1){

                  while (!isValidNum2) {

                  num2 = Prompter.prompt("Please enter the second number: ");
                  isValidNum2 = NumberValidator.isValid2(num2);

                  if (!isValidNum2) {
                      System.out.println("\nError! Please enter a valid second number.");
                  }
              }

            System.out.print("\nTotal: " + num1 + operator + num2 + " = " + Addition.add(Double.parseDouble(num1), Double.parseDouble(num2)));
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
            System.out.print("\nTotal: " + num1 + operator + num2 + " = " + Subtraction.subtract(Double.parseDouble(num1), Double.parseDouble(num2)));
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

                      if(Double.parseDouble(num2) == 0){
                        
                           System.out.println("\nError! Number cannot be divided by 0.");
                      }
                  
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
            System.out.print("\nError! Please select a valid operator.\n");
         }
      }    
   }
}