public class ExceptionTest{

	public void division(int a, int b) throws TumiException{
       
        if(b == 0){

        	throw new TumiException("Error! Number cannot be divisable by zero");
        }
        
        System.out.println("a = " + a + " b = " + b);
	}
}