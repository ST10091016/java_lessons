import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
class Ball{

	public Ball(int i){

	}

	public static void main(String[] args){

       Map<Ball, Banana> map = new HashMap<>();
       map.put(new Ball(1), new Banana("1 Banana"));
       map.put(new Ball(2), new Banana("2 Bananas"));

       Iterator<Map.Entry<Ball,Banana>> iterate = map.entrySet().iterator();

       while(iterate.hasNext()){
       	Map.Entry<Ball,Banana> elements = iterate.next();
       	Ball key = elements.getKey();
       	Banana value = elements.getValue();

       	System.out.println("Key = " + key + " , Value = " + value);
       }
	}

	public String toString(){

		return "Ball";
	}
}