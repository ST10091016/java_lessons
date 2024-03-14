public class OperatorValidator{
    
    //method that validates the operators entered by the user.
	public static boolean validate(String operator){
      
      //switch case for the operator.
      switch(operator){
            
            //cases for the operators and has no breaks because they lead to the same result.
            case "+":      
            case "-":
            case "*":
            case "/": 
            case "%":
                return true;
            default:
            	return false;
        }
	}
}