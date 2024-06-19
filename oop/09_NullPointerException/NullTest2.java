public class NullTest2 {

	static NullObject nullObject = new NullObject();
	
	public static void main(String[] args) {
		System.out.println("Start");
		try{
			nullObject.test();
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException occurred");
		}
		System.out.println("Finished");
	}

}
