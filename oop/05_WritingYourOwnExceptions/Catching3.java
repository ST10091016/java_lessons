 class CatchingEg3 {
	public void doSomething() throws MalekaException{
		int i = 42;
		
		if(i > 30){
			throw new MalekaException("An error occurred");
		}
		System.out.println("Doing something...");
	}
}
