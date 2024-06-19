public class CatchingEgMain {
	public static void main(String[] args) {
		CatchingEg myObject = new CatchingEg();

		try{

			myObject.doSomething();

		}catch(Exception e){
            
            System.out.println("Exception caught");
		}
		
		
		System.out.println("Finished");
	}
}
