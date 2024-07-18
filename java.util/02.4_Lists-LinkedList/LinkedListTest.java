import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;

public class LinkedListTest{

	static LinkedList<String> list = new LinkedList<>();

	public static void main(String[] args){
        
        // size();
        // clear();
		// pushPop();
		// contains();
		// get();
		//addAll();
		//containsAll();
		//iterator();
		toArray();
	}

	static void pushPop(){
        
        list.push("Berry");
        list.push("Mango");
        list.push("Pineapple");

        String s = list.pop();
        System.out.println("Popped: " + s);
	}

	static void clear(){
        
        list.add("Berry");
        list.add("Mango");
        list.add("Pineapple");

        System.out.println("Before clearing: " + list);
        list.clear();
        System.out.println("After clearing " + list);

	}

	static void size(){
        
        list.add("Berry");
        list.add("Mango");
        list.add("Pineapple");

        System.out.println("Size: " + list.size());
	}

	static void contains(){
        
        list.add("Berry");
        list.add("Mango");
        list.add("Pineapple");

        System.out.println("Contains: " + list.contains("Mango"));
	}

	static void get(){
        
        list.add("Berry");
        list.add("Mango");
        list.add("Pineapple");

        System.out.println("Getting an item: " + list.get(2));
	}

	static void addAll(){
        
        list.add("Berry");
        list.add("Mango");
        list.add("Pineapple");

        Collection<String> collect = new ArrayList<String>();

        collect.add("Dragon fruit");
        collect.add("Yoghurt");
        collect.add("Mango");

        list.addAll(collect);

        System.out.println("Adding all: " +list);
	}

	static void containsAll(){
        
        list.add("Berry");
        list.add("Mango");
        list.add("Pineapple");

        Collection<String> collect = new ArrayList<String>();

        collect.add("Dragon fruit");
        collect.add("Yoghurt");
        collect.add("Mango");

        System.out.println("Contains all: " + list.containsAll(collect));
	}

	static void iterator(){

		list.add("Berry");
        list.add("Mango");
        list.add("Pineapple");

		Iterator iterate = list.iterator();
        
        while(iterate.hasNext()){
        	System.out.print(iterate.next() + " ");
        }
	}

	static void toArray(){

		list.add("Berry");
        list.add("Mango");
        list.add("Pineapple");

		String[] fruits = new String[3];
		fruits = list.toArray(fruits);

		for(String f : fruits){
			System.out.println("To array: " + f);
		}
	}

}