import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

class ListsSynchronized{

	public static void main(String[] args){
       
       List<String> list = Collections.synchronizedList(new LinkedList<String>());

       list.add("berries");
       list.add("and");
       list.add("cream");

       synchronized(list){

       	Iterator it = list.iterator();

	       	while(it.hasNext()){

	       		System.out.println(it.next());
	       	}
       }
	}
}