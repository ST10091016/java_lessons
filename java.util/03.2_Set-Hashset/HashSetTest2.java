import java.util.HashSet;
import java.util.Set;

public class HashSetTest2{

	public static void main(String[] args){

		Set<String> hashSet = new HashSet<String>();

		hashSet.add("Juice");
		hashSet.add("Water");
		hashSet.add("Tea");
		hashSet.add("Coffee");

	   for(String values: hashSet){

	   	  if(values.equals("Coffee"))
	   	  	System.out.println(values);
	   }
	}
}