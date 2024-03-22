public class BubbleSort {

	static int[] numbers = {5,2,4,9,1,10,3};
	static int temp = 0;

	public static void main(String[] args){

		print();
		
    }

    public static void print(){

    	System.out.print("Before bubble sorting: ");
        for(int i = 0; i < numbers.length; i++){
           
           System.out.print(numbers[i] + " ");
           
        } 

        sort();

        System.out.print("\nAfter bubble sorting: ");
        for(int i = 0; i < numbers.length; i++){
           
           System.out.print(numbers[i] + " ");
           
        } 
    }

    public static void sort(){

    	for(int i = 0; i < numbers.length-1; i++){
           for(int j =0; j< numbers.length-1-i; j++){
                
                if(numbers[j] > numbers[j+1]){

                	 temp = numbers[j];
                	 numbers[j] = numbers[j+1];
                	 numbers[j+1] = temp;

                }
            }    
		}
    }
}