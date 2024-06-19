public class Garbage{
	String name;

	public Garbage(String paramName){
		paramName = name;
	}
    
    @Override
	protected void finalize(){
		System.out.println("Finalizing just before garbage collection");
	}
}