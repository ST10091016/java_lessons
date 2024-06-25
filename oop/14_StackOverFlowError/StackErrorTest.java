 public class StackErrorTest {	
	
	public static void main(String[] args) {	
        args = new String[]{"Tumi", "Peggy", "Maleka"};  

        if(args[0].equals("Tumi")){
           
           System.out.println(args[0]);
           
        }else{

        	main(args);
        }
      
		System.out.println("Step 1");
	}
}
