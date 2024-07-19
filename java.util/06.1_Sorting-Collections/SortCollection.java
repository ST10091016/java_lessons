import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class SortCollection{

	public static void main(String[] args){

		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(8);
		array.add(6);
		array.add(2);
		array.add(5);
		System.out.println("Before sorting the list:" + array);
		Collections.sort(array);
		System.out.println("After sorting the list:" + array);
	}
}