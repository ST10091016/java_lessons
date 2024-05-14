public class LocalVars {
	public static void main(String[] args) {
		int localint = 0;
		new ValueHolder2().setValue(10);
		
		System.out.println(localint);
		System.out.println(new ValueHolder2().getValue());
	}
}

