import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;

public class AdvancedSet2{

	public static void main(String[] args){

	    LinkedList<Long> set = new LinkedList<Long>();
		set.add(225L);
		set.add(100L);
		set.add(220L);
		set.add(50L);

		Iterator elements = set.iterator();
       
        System.out.print("Before sorting the set: ");
		while(elements.hasNext()){
			System.out.print(elements.next() + " ");
		}

		List<Long> list = new ArrayList<Long>(set);
		Collections.sort(list);

		System.out.print("\nAfter sorting the set: ");

		for(Long items: list){
			System.out.print(items + " ");
		}
	}
}