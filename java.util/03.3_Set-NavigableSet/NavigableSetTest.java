import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest{

	public static void main(String[] args){

		NavigableSet<Long> ns = new TreeSet<Long>();

		ns.add(234L);
		ns.add(22L);
		ns.add(16L);
		ns.add(1234567L);

		System.out.println("Getting the first element: " + ns.pollFirst());
		System.out.println("Getting the next element: " + ns.higher(3L));
	}
}