public class MorphMain2{
	public static void main(String[] args){
		EnglishBook inst1 = new EnglishBook();
		Object target = null;
		target = inst1;
		inst1 = (EnglishBook) target;
	}
}