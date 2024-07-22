import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ComparableTest{
 
 	public static void main(String[] args){
       
       List<Money> list = new ArrayList<Money>();

       list.add(new Money(Currency.USD, 20.55));
       list.add(new Money(Currency.ZAR, 10));
       list.add(new Money(Currency.GBP, 5));
       list.add(new Money(Currency.EUR, 45));
       list.add(new Money(Currency.USD, 55.89));
       list.add(new Money(Currency.ZAR, 900));
       list.add(new Money(Currency.ZAR, 1));
       list.add(new Money(Currency.USD, 25));
       list.add(new Money(Currency.GBP, 250));
       list.add(new Money(Currency.EUR, 75));

       System.out.println("Before sorting: " + list + "\n");
       Collections.sort(list);
       System.out.println("After sorting: " + list);
       
 	}
}