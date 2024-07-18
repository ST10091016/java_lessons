import java.util.LinkedList;
import java.util.Collections;

class VectorSort{

	public static void main(String[] args){

		LinkedList<Long> list = new LinkedList<Long>();

		list.add(12L);
		list.add(90L);
		list.add(233L);
		list.add(2L);

		System.out.println("Before sorting the linked list:" + list);
		Collections.sort(list);
		System.out.println("After sorting the linked list:" + list);
	}
}