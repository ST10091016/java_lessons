import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class Banana{

	public Banana(String b){

	}

	public static void main(String[] args){
       
       List<Banana> bananas = new ArrayList<Banana>();
       bananas.add(new Banana("Ripe"));
       bananas.add(new Banana("Unripe"));

       Iterator<Banana> b = bananas.iterator();
       while(b.hasNext()){
       	System.out.println(b.next());
       }
  
	}

	public String toString(){

		return "Banana";
	}
}