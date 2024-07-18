import java.util.ArrayList;
import java.util.Collections;

class ArrayListSort{

	public static void main(String[] args){

		ArrayList<Long> list = new ArrayList<Long>();

		list.add(12L);
		list.add(90L);
		list.add(233L);
		list.add(2L);

		System.out.println("Before sorting the array list:" + list);
		Collections.sort(list);
		System.out.println("After sorting the array list:" + list);
	}
}