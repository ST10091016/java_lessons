import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class AdavancedSet{

	public static void main(String[] args){

		Set<String> set = new HashSet<String>();
		set.add("225");
		set.add("100");
		set.add("220");
		set.add("50");

		Iterator elements = set.iterator();
       
        System.out.print("Before sorting the set: ");
		while(elements.hasNext()){
			System.out.print(elements.next() + " ");
		}

		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);

		System.out.print("\nAfter sorting the set: ");

		for(String items: list){
			System.out.print(items + " ");
		}

		Set<String> set2 = Collections.synchronizedSet(set);

		System.out.print("\nSynchronized set: " + set2);
	}
}