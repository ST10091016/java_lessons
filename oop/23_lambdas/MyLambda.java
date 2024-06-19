public class MyLambda implements MyInterface2{
    
    public void testingLambda(){
    	System.out.print("Implementation complete.");
    }

	public static void main(String[] args){
        
        MyLambda ml = new MyLambda();
        ml.testingLambda();
	}
}