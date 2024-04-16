public class String2Test{
	public static void main(String[] args){
		String line = "1,4,3,2,3,7,5,6,9\n"+
                      "8,6,3,7,3,7,5,6,9\n"; 

        String[] strNumber = line.split(",");
        String[] strArray = strNumber.split("\n");

        for(String i: strArray){
        	System.out.print(i);
        }
       

	}
}