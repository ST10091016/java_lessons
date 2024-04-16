public class Question2{
    
    //global populated array that is accessible in the class
	static int[] num = 
	{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,
	16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,
    31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,
    46,47,48,49,50};

	public static void main(String[] args){
       
       //calling the methods and printing out.
	   System.out.print("\nArray before: ");
	   print();
       //prints to the cmd
	   System.out.print("\n\nEven numbers and numbers divisable by 11: ");
       evenAndEvelen();
	}

	//method that prints out the elements from the array
	public static void print(){	   
       for(int i = 0; i < num.length; i++){
       	  System.out.print(num[i] + " ");
       }
	}
    
    //method that prints out the even numbers and numbers divisable by 11 in the array.
	public static void evenAndEvelen(){
        for(int i = 0; i < num.length; i++){
          //if statement that checks if the element of that index is divisable by 2 AND by 11
       	  if(num[i]%2 == 0 && num[i]%11 == 0){
       	  	System.out.print(num[i] + " ");
       	  }
       }
    }
}