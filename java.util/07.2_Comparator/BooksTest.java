import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class BooksTest{

	public static void main(String[] args){
       
       List<Books> books = new ArrayList<Books>();

       books.add(new Books("Vampire Girl", 80));
       books.add(new Books("Love adn Alex", 100));
       books.add(new Books("The Fault in out stars", 300));
       books.add(new Books("The last of us", 250));

       BooksComparator bc = new BooksComparator();

       System.out.println("Before sorting: " + books.toString());
       Collections.sort(books, bc);
       System.out.println("After sorting: " + books.toString());
	}
}