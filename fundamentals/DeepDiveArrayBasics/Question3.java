public class Question3{
    
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
       //printing to the cmd
	   System.out.print("\n\nEven numbers and numbers divisable by 11: ");
       evenAndEvelen();
	}

	//method that prints out the elements from the array
	public static void print(){	
	   int i = 0;   
       while(i < num.length){
       	  System.out.print(num[i] + " ");
       	  i++;
       }
	}
    
    //method that prints out the even numbers and numbers divisable by 11
	public static void evenAndEvelen(){
      
      //declaring and initialising the variable for the while loop
      int i = 0;
        while(i < num.length){

        	//checks if index is divisable by 2, if it has no remainder then it goes to the next switch
            switch(num[i]%2){
            	case 0:
            	 //checks if the switch statements is true, if it is, then it prints out that value from the index
            	switch(num[i]%11){
            	  case 0:
                   System.out.print(num[i] + " ");
                  break;
            	}
              break;
            }
           //increments after the body
           i++;
       }
	}	
}