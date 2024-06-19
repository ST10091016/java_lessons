public class EnumTest {
	public static void main(String[] args) {
		Planets day1 = Planets.MERCURY;
		Planets day2 = day1;
		 
		boolean res1 = day1.equals(day2);
		 
		System.out.println(day1+" equals "+day2+" is "+res1);
 
	}
 
}
