public class ArrayPopulation5 {
    public static void main(String[]args){
        
        //declare and initialise the empty arrays with a size of 10 
        int[] source = new int[10];
        byte[] byteArray = new byte[10];
        char[] charArray = new char[10];
        short[] shortArray = new short[10];
        int[] intArray = new int[10];
        float[] floatArray = new float[10];
        long[] longArray = new long[10];
        double[] doubleArray = new double[10];
        String[] stringArray = new String[10];

        //declare and initialise src and destination array for boolean for same values
        boolean[] boolArray = new boolean[10];
        boolean[] srcBoolArray = new boolean[10];
        
        //populating the src array 
        for(int i = 0; i < source.length; i++){
            source[i] = i + 20;
        }
        
        //calling the methods to display each array before and after copying it and passed the variables in the methods
        printArray("\nSource int before copy: ", source);
        printArray("Destination int before copy: ", intArray);
        printArray("Source int after copy: ",source);
        printArray("Destination int after copy: ", copyInt(intArray, source));

        printArray("\nSource byte before copy: ", source);
        printArray("Destination byte before copy: ", byteArray);
        printArray("Source byte after copy: ",source);
        printArray("Destination byte after copy: ", copyByte(byteArray, source));

        printArray("\nSource short before copy: ", source);
        printArray("Destination short before copy: ", shortArray);
        printArray("Source short after copy: ",source);
        printArray("Destination short after copy: ", copyShort(shortArray, source));

        printArray("\nSource char before copy: ", source);
        printArray("Destination char before copy: ", charArray);
        printArray("Source char after copy: ",source);
        printArray("Destination char after copy: ", copyChar(charArray, source));

        printArray("\nSource boolean before copy: ", srcBoolArray);
        printArray("Destination boolean before copy: ", boolArray);
        printArray("Source boolean after copy: ", srcBoolArray);
        printArray("Destination boolean after copy: ", copyBoolean(boolArray, srcBoolArray));

        printArray("\nSource double before copy: ", source);
        printArray("Destination double before copy: ", doubleArray);
        printArray("Source short double copy: ",source);
        printArray("Destination double after copy: ", copyDouble(doubleArray, source));

        printArray("\nSource float before copy: ", source);
        printArray("Destination float before copy: ", floatArray);
        printArray("Source float after copy: ",source);
        printArray("Destination float after copy: ", copyFloat(floatArray, source));

        printArray("\nSource long before copy: ", source);
        printArray("Destination long before copy: ", longArray);
        printArray("Source long after copy: ",source);
        printArray("Destination long after copy: ", copyLong(longArray, source));
        
        printArray("\nSource string before copy: ", source);
        printArray("Destination string before copy: ", stringArray);
        printArray("Source string after copy: ", source);
        printArray("Destination string after copy: ", copyString(stringArray, source));

    }
    
    //method that copies the src into the destination
    public static String[] copyString(String[] destination, int[] source){
        
        //for loop that only loops for the first 3 elements and copies those into the destination
        for(int i = 0; i < destination.length - 7; i++){
             destination[i] = Integer.toString(source[i]);
        }
        
        //returns the string value which will be used
        return destination;
    } 
    
    public static int[] copyInt(int[] destination, int[] source){
        
         //for loop that only loops for the first 3 elements and copies those into the destination
        for(int i = 0; i < destination.length - 7; i++){
             destination[i] = source[i];
        }

        return destination;
    }

    public static double[] copyDouble(double[] destination, int[] source){
        
        for(int i = 0; i < destination.length - 7; i++){
             destination[i] = source[i];
        }

        return destination;
    }

    public static float[] copyFloat(float[] destination, int[] source){
        
        //for loop that only loops for the first 3 elements and copies those into the destination
        for(int i = 0; i < destination.length - 7; i++){
             destination[i] = source[i];
        }

        return destination;
    }

    public static byte[] copyByte(byte[] destination, int[] source){
        
        for(int i = 0; i < destination.length - 7; i++){
             destination[i] = (byte)source[i];
        }

        return destination;
    }

    public static char[] copyChar(char[] destination, int[] source){
        
         //for loop that only loops for the first 3 elements and copies those into the destination
        for(int i = 0; i < destination.length - 7; i++){
             destination[i] = (char)source[i];
        }

        return destination;
    }

    public static long[] copyLong(long[] destination, int[] source){
        
         //for loop that only loops for the first 3 elements and copies those into the destination
        for(int i = 0; i < destination.length - 7; i++){
             destination[i] = source[i];
        }

        return destination;
    }

    public static short[] copyShort(short[] destination, int[] source){
        
        for(int i = 0; i < destination.length - 7; i++){
             destination[i] = (short)source[i];
        }

        return destination;
    }

    public static boolean[] copyBoolean(boolean[] destination, boolean[] source){
        
        //for loop that only loops for the first 3 elements and copies those into the destination
        for(int i = 0; i < destination.length - 7; i++){

             //fills the destination with true values
             destination[i] = source[i] ? false : true;
        }

        return destination;
    }

    /*Methods that are overloaded for each data type and prints out the values for each data type**/

    public static void printArray(String prefix,boolean[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }         
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix,byte[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
        
          //for loop that prints the values of each index of the double with commas if the condition is right
        for (int i =0;i < arrayToPrint.length;i++) {
            
            //if statement that checks if the value/element is not equal to the arrays length 
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }         
        }
        System.out.print("]\n");
    }

      public static void printArray(String prefix,char[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }         
        }
        System.out.print("]\n");
    }

      public static void printArray(String prefix,short[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }         
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
            	System.out.print(",");
            }         
        }
        System.out.print("]\n");
    }

      public static void printArray(String prefix,float[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }         
        }
        System.out.print("]\n");
    }

      public static void printArray(String prefix,long[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }         
        }
        System.out.print("]\n");
    }

      public static void printArray(String prefix,double[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }         
        }
        System.out.print("]\n");
    }

      public static void printArray(String prefix,String[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }         
        }
        System.out.print("]\n");
    }
}
