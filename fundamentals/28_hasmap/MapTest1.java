import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class MapTest1 {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put("Zimbabwe", "Harare");
		hashMap.put("Zambia", "Lusaka");
		hashMap.put("Yemen", "Sana'a");
		hashMap.put("Wales", "Cardiff");
		hashMap.put("Vietnam", "Hanoi");
		hashMap.put("Venezuela", "Caracas");
		hashMap.put("Vatican City", "Vatican City");
		
		Set keySet = hashMap.keySet();		
		Collection values = hashMap.values();
		
       Iterator keys = keySet.iterator(); 
       Iterator val = values.iterator(); 

       Map<String, String> maps = new HashMap<>();

       while(keys.hasNext() && val.hasNext()){
           
           String stringKey = (String)keys.next();
           String stringVal = (String)val.next();

           maps.put(stringKey, stringVal);

       }

       System.out.print(maps);

	}	
}
