class TestEqualsIgnoreCase{

	public static void main(String[] args){
  
	    String s = "I have a book in my hand.";
	    String s2 = "I have a book in my HAND.";
	    System.out.println(s.equalsIgnoreCase(s2));
    }
}