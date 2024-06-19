public class MyException extends Exception{


	public static void main(String[] args) {
		System.out.println("Start");
		int a = 1;
		int sum = 0;
		try{
             
            sum = 1/0;
		
		}
		catch(Exception e){
			System.out.println("ArithmeticException occurred");
		}
		System.out.println("Finished");
	}

}