public class MockExam2 {
	public static void main(String[] args){

    	int [] shoesize  =  {11,2,33,4,5,6,7,8,9,10,2,4,6,8,20,1,3,5,10,99,17,2,3,21,5,6,7,8,9,50,13,2,4,32,7,8,4,2,6,8,2,5,43,9,3,5,88,54,4,10};

        int allSizes = 0;
        System.out.print("The available shoe sizes are: \n");
        while(allSizes < shoesize.length){
            System.out.print(shoesize[allSizes] +" ");
            allSizes++;
            System.out.print(" ");
        }
        
        //iterating through for the sizes of the shirts
    	int j = 0;
        System.out.print("\n\nThe shirt sizes are: \n");
    	while(j < shoesize.length){

    	 	int shirt = shoesize[j];
    	 	int pants = shoesize[j]%2;
            
    	 	switch(pants){
    	 		case 0:
    	 			System.out.print(shirt + " ");
    	 			break;
    	 	}
    	 	j++;
    	}	
                //iterating through for the sizes of the socks
                int t = 0;
                System.out.print("\n\nThe sock sizes are: \n");
    	 		while(t < shoesize.length){

    	 			int sock = shoesize[t];
    	 			int shoe = shoesize[t]%11;

    	 			switch(shoe){
    	 			    case 0:
    	 			 	    System.out.print(sock + " ");
    	 			 	    break;
    	 			}
    	 			t++;
    	 		}
    	 		
        int size = 0;
        System.out.print("\n\nThe shoe sizes added with 1: \n");
        while(size < shoesize.length){
        	System.out.print(shoesize[size] +1);
        	size++;
        	System.out.print(" ");
        }

    	    int k = 0;
            System.out.print("\n\nShoes that are even in sizes: \n");
    	    while(k < shoesize.length){

    	   		int me = shoesize[k] + 1;
    	   		int you = me%2;

    	   		switch(you){
    	   		case 0:
    	   		     System.out.print(me + " ");
    	   		     break;
    	   		}
    	   		k++;
    	   	}
    	   	
    	   	int y = 0;
            System.out.print("\n\nShoe sizes that can be divided by 11: \n");
    	   	while(y < shoesize.length){	

    	   		int us = shoesize[y] + 1;
    	   		int we = us%11;

    	   		switch(we){
    	   			case 0:
    	   		      System.out.print(us+ " ");
    	   		      break;
    	   		}
    	   	  y++;
    	    }
	}		
}