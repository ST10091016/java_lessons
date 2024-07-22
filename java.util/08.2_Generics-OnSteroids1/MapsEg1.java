import java.util.HashMap;
import java.util.Map;

public class MapsEg1 {
	public static void main(String[] args) {
		
		Map<String, Money> shareMap = new HashMap<String,Money>();
		
		
		shareMap.put("Mr John",new Money(Currency.USD, 1000));
		shareMap.put("Mr Sky",new Money(Currency.USD, 1000));
		shareMap.put("Mr Slico",new Money(Currency.USD, 1000));
		shareMap.put("Ms No3",new Money(Currency.USD, 1000));
		
		System.out.println("shareMap = "+shareMap);
	}
}
