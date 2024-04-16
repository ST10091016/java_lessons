public class Question1{
    
    //global populated array that is accessible in the class
	static int[] num = 
	{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,
	16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,
    31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,
    46,47,48,49,50};

	public static void main(String[] args){
        
        //calling the methods and printing
		System.out.print("\nArray before adding 1: ");
        print();
        //printing to the cmd
        System.out.print("\n\nArray after adding 1: ");
        addOne();
        print();
	}
        
    //method that prints out the elements from the array.
	public static void print(){
       for(int i = 0; i < num.length; i++){
       	  System.out.print(num[i] + " ");
       }
	}
    
    //method that deals with adding 1 more to the values in the array.
	public static void addOne(){
		//for loop goes through the index of the array and prints each one added with 1
		for(int i = 0; i < num.length; i++){
       	   num[i] = num[i] + 1;
       }
	}
}