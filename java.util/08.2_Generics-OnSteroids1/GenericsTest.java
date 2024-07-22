import java.util.List;
import java.util.ArrayList;

class GenericsTest{

	public static void main(String[] args){

        List<Money> list = new ArrayList<Money>();
        
        list.add(new Money(Currency.ZAR, 1));
        list.add(new Money(Currency.ZAR, 1));
        list.add(new Money(Currency.ZAR, 1));
        list.add(new Money(Currency.ZAR, 1));
        list.add(new Money(Currency.ZAR, 1));
        list.add(new Money(Currency.ZAR, 1));

        System.out.println(list.toString());
    
	}
}