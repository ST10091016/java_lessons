import java.util.Map;
import java.util.HashMap;

public class Maps{

	public static void main(String[] args){

		Map<Integer, String> hashmap = new HashMap<>();
        hashmap.put(1, "Mangoes");
        hashmap.put(2, "Oranges");
        hashmap.put(3, "Carrots");
        System.out.println("Before merging map1: " +hashmap);
        
        Map<Integer, String> hashmap2 = new HashMap<>();
        hashmap2.put(1, "Lemons");
        hashmap2.put(2, "Avocadoes");
        hashmap2.put(4, "Strawberries");
        System.out.println("Before merging map2: " +hashmap2);

        hashmap2.forEach((key,value) -> hashmap.merge(key,value, (v1,v2) -> v1 + " " + v2));
        System.out.println("After merging: " +hashmap);
	}
}