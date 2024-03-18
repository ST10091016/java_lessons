public class NumberValidator{
    
    //method that deals with the users input on the first number.
	public static boolean operandOne(String num1){
       
       //tests if the number is a double, if not then an error is thrown.
       try{

       	 //converting the number string into a double.
         Double.parseDouble(num1);
         return true;

       }catch(Exception error){
       	return false;
       }
	}

    //method that deals with the users input on the second number.
	public static boolean operandTwo(String num2){
       
       //tests if the number is a double, if not then an error is thrown.
       try{

       	 //converting the number string into a double.
         Double.parseDouble(num2);
         return true;

       }catch(Exception error){
       	return false;
       }
	}
}