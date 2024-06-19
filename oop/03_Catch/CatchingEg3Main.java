public class CatchingEg3Main {
	public static void main(String[] args) {
		try{
			CatchingEg myObject = new CatchingEg();
			myObject.doSomething();

		}catch(Exception e){
             e.printStackTrace();
		}
		finally{
			System.out.println("Finished");	
		}
	}
}
