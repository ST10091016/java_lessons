import package2.Child;

public class MainAccessMod extends Child{
	public static void main(String[] args){
       Child c = new Child();
       c.child();
       c.child1();
       new Child("tumi", "maleka", 22);
	}
}