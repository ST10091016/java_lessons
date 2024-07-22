import java.util.ArrayList;
import java.util.List;


public class GenericsOnSteroids1 {
	public static void main(String[] args) {
		List amounts = new ArrayList();
		
		amounts.add(new Long(1));
		amounts.add(new Long(2));
		amounts.add(new Long(3));
		amounts.add(new Long(4));
		
		
		for(int i = 0; i < amounts.size();i++){
			
			Long amount = (long)amounts.get(0);
			System.out.println("Position ["+i+"] amount ["+amount+"]");
		}
	}
}
