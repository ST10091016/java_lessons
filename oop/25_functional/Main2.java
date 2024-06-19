public class Main2{
	public static void main(String[] args){
         
         Interface1 interface1 = (s) -> ++s;
         System.out.println(interface1.increment(1));

         Interface2 interface2 = (x, y) -> (x+y);
         System.out.println(interface2.add(2,3));
	}
}