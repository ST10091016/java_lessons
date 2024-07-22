public class CompareMain{

	public static void main(String[] args){
      
       Money money1 = new Money(Currency.USD, 10);
       Money money2 = new Money(Currency.USD, 10);

       System.out.println(money1.equals(money1));

	}
}