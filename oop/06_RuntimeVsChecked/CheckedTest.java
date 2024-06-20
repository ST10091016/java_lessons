public class CheckedTest {
	public static void main(String[] args){
		try{

			throw new TumiException("An error occured.");

		}catch(Exception e){
			
			System.out.print(e);
		}
	}
}
