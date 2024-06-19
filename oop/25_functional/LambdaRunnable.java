public class LambdaRunnable{
	public static void main(String[] args){

		Runnable running = (s) -> {
			
			for(int i = 1; i < 11; i++)
			System.out.println(s);
		};

		running.name("Tumi");

	}
}