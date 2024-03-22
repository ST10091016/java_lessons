public class Practice {
	public static void main(String[] args){

		int[] num = new int[4];
		
		for(int i = 0; i < num.length; i++){
			num[i] = i + 1;
		}

		for(int x = 0; x < num.length; x++){
			   
			System.out.print(num[x] + " ");
		}
	}
}