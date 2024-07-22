import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NestedMapEg1 {
	public static void main(String[] args) {
		
		Map<String,List<Money>> outerMap = new HashMap<String,List<Money>>();
		
		List<Money> innerList = new ArrayList<Money>();
		
		innerList.add(new Money(Currency.USD, 100));
		outerMap.put("Mr x",innerList);
		
		
		System.out.println("outerMap = "+outerMap);
	}
}
