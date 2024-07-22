public class EquivalanceTest4 {
	public static void main(String[] args) {
		
		String a = new String("a");
		String b = new String("a");
		String c = new String("whatever");
		
		boolean result = a.hashCode() == c.hashCode();
		
		System.out.println("Result1 = "+result);
		
		a.concat("heelo");
		
		result = a.equals(b);
		
		System.out.println("Result1 after concat = "+result);
		
	}
}

