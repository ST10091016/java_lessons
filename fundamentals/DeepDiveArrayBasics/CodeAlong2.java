import java.lang.Math;
import java.lang.System;

public class CodeAlong2{
	public static void main(String[] args){
          
          //declare and initialise empty arrays with their sizes
	      int[] src_arr = new int[100];
	      int[] dest_arr = new int[17];
        
        //for loop that populates the source array with a random number starting from 0 - 100
        for(int i = 0; i < src_arr.length; i++){
      		src_arr[i] = (int)(Math.random() * 100) + 0;
        }

          for(int i = 0; i < src_arr.length; i++){
            System.out.print(src_arr[i]);

        	if(i != src_arr.length -1)
         	System.out.print(", ");
        }

          
           //method that allows the elements from the src array to be copied into the destination array
           //the 16 was taken from 31-15 to get the length
	       System.arraycopy(src_arr, 15, dest_arr, 0, 17);
	       
	       //pretty printing the array
	       System.out.print("[");
	       
        //printing out the destination array using a for loop
        for(int i = 0; i < dest_arr.length; i++){
            System.out.print(dest_arr[i]);

        	if(i != dest_arr.length -1)
         	System.out.print(", ");
        }
         	System.out.print("]");
	}
}