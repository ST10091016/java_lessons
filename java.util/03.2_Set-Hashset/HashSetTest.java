import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HashSetTest{

	static HashSet<String> hashset = new HashSet<String>();

	public static void main(String[] args){
      
      add();
      clear();
      cloning();
      contain();
      empty();
      iterate();
      size();

	}

	static void add(){
       
       hashset.add("Watermelon");
       hashset.add("Mangoes");
       hashset.add("Pineapple");
       hashset.add("Raspberries");
       hashset.add("Naartjies");

       System.out.println("Adding to the hashset: " + hashset.toString());
	}

	static void clear(){

	   hashset.add("Watermelon");
       hashset.add("Mangoes");
       hashset.add("Pineapple");
       hashset.add("Raspberries");
       hashset.add("Naartjies");

       hashset.clear();

       System.out.println("Clearing the hashset: " + hashset);
	}

	static void cloning(){

	   hashset.add("Watermelon");
       hashset.add("Mangoes");
       hashset.add("Pineapple");
       hashset.add("Raspberries");
       hashset.add("Naartjies");

       System.out.println("Before cloning the hashset: " + hashset);

       HashSet<String> hashset2 = new HashSet<String>();

       hashset2 = (HashSet)hashset.clone();

       System.out.println("After cloning the hashset: " + hashset2);
	}

	static void contain(){

	   hashset.add("Watermelon");
       hashset.add("Mangoes");
       hashset.add("Pineapple");
       hashset.add("Raspberries");
       hashset.add("Naartjies");

       System.out.println("Contains Berries?: " + hashset.contains("Berries"));
	}

	static void empty(){

	   hashset.add("Watermelon");
       hashset.add("Mangoes");
       hashset.add("Pineapple");
       hashset.add("Raspberries");
       hashset.add("Naartjies");

       System.out.println("Is the hashset empty? : " + hashset.isEmpty());
	}

	static void iterate(){

	   hashset.add("Watermelon");
       hashset.add("Mangoes");
       hashset.add("Pineapple");
       hashset.add("Raspberries");
       hashset.add("Naartjies");

       Iterator values = hashset.iterator();

       System.out.print("Iterated values : ");
       while(values.hasNext()){
          System.out.print(values.next() + " ");
       }
	}

	static void size(){
       

	   hashset.add("Watermelon");
       hashset.add("Mangoes");
       hashset.add("Pineapple");
       hashset.add("Raspberries");
       hashset.add("Naartjies");

       System.out.println("\nThe size of the hashset: " + hashset.size());

	}
}