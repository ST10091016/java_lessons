import java.util.Comparator;

public class BooksComparator implements Comparator<Books>{

	public int compare(Books b1, Books b2){
       return Integer.compare(b1.getPrice(), b2.getPrice());
	}
}