public class NumberValidator{
  
  //method that checks if the first number is a double.
	public static boolean isValid1(String num1){
      
       //testing whether the first number is a double, if not then an error is thrown.
      try{
          
          //parsing the string number into a double
          double op1 = Double.parseDouble(num1);
          return true;

      }catch(Exception error){
          
          System.out.print("\nError! Enter a valid first number.");
          return false;
      }
	 }
  
   //method that checks if the second number is a double.
   public static boolean isValid2(String num2){
     
     //testing whether the second number is a double, if not then an error is thrown.
     try{

          double op2 = Double.parseDouble(num2);
          return true;

      }catch(Exception error){
          
         // System.out.print("\nError! Enter a valid second number.\n");
          return false;
      }
   }
}