public class ArrayPopulation4 {
    public static void main(String[]args){

	        //declare and initialise arrays that have the size of 10
	        boolean[] boolArray = new boolean[10];
	        byte[] byteArray = new byte[10];
	        char[] charArray = new char[10];
	        short[] shortArray = new short[10];
	        int[] intArray = new int[10];
	        float[] floatArray = new float[10];
	        long[] longArray = new long[10];
	        double[] doubleArray = new double[10];
	        String[] stringArray = new String[10];
	        
	        //decalre and initialise variables
	        int arrayValue = -1;
	        char intialiseChar = 'a';

        //for loop that intialises the arrays to a specific value
        for(int i = 0; i < intArray.length; i++){
            
            //intialising the numeric arrays to -1
            boolArray[i] = Boolean.parseBoolean("true");
            byteArray[i] = (byte)arrayValue;
            charArray[i] = (char)intialiseChar;
            shortArray[i] = (short)arrayValue;
            intArray[i] = arrayValue;
            floatArray[i] = arrayValue;
            longArray[i] = arrayValue;
            doubleArray[i] = arrayValue;
            stringArray[i] = null;
       
        } 
        
	        //calling the methods to display the default values inside of the array
	        printArray("boolean array: ", displayBool(boolArray));
	        printArray("byte array: ", displayByte(byteArray));
	        printArray("char array: ", displayChar(charArray));
	        printArray("short array: ", displayShort(shortArray));
	        printArray("int array: ", displayInt(intArray));
	        printArray("float array: ", displayFloat(floatArray));
	        printArray("long array: ", displayLong(longArray));
	        printArray("double array: ", displayDouble(doubleArray));
	        printArray("string array: ", displayString(stringArray));
    }

    public static int[] displayBool(boolean[] array){
        
        int[] show = new int[array.length];

        for(int i = 0; i < array.length; i++){

            //using a ternary/short cut if to print out the default values
            show[i] = array[i] ? 1 : 0;
        }
        
        //returning the values that have been stored in the int[]
        return show;
    }

    //method that has a return type of int array and a parameter of short array
    public static int[] displayShort(short[] array){
        
        //declaring an array that has the same length as the short[]
        int[] show = new int[array.length];
        
        //for loop tht displays the values stored in the array
        for(int i = 0; i < array.length; i++)
            show[i] = array[i];

        //returning the values that have been stored in the int[]
        return show;
    }

    //method that has a return type of int array and a parameter of char array
    public static int[] displayChar(char[] array){
        
        int[] show = new int[array.length];

        for(int i = 0; i < array.length; i++)
            show[i] = array[i];
        
        //returning the values that have been stored in the int[]
        return show;
    }

    //method that has a return type of int array and a parameter of byte array
    public static int[] displayByte(byte[] array){
        
        int[] show = new int[array.length];

        for(int i = 0; i < array.length; i++)
            show[i] = array[i];

        //returning the values that have been stored in the int[]
        return show;
    }

    public static int[] displayFloat(float[] array){
        
        int[] show = new int[array.length];

        for(int i = 0; i < array.length; i++)

            //casting the array so that it could be stored in the int array
            show[i] = (int)array[i];
        
        //returning the values that have been stored in the int[]
        return show;
    }

    public static int[] displayDouble(double[] array){
        
        int[] show = new int[array.length];

        for(int i = 0; i < array.length; i++)

           //casting the array so that it could be stored in the int array
            show[i] = (int)array[i];

        //returing the values that have been stored in the int[]
        return show;
    }

    public static int[] displayLong(long[] array){
        
        int[] show = new int[array.length];

        for(int i = 0; i < array.length; i++)
            
            //casting the array so that it could be stored in the int array
            show[i] = (int)array[i];
        
        //returning the values that have been stored in the int[]
        return show;
    }

    public static int[] displayInt(int[] array){
        
        int[] show = new int[array.length];

        for(int i = 0; i < array.length; i++)
            
            //casting the array so that it could be stored in the int array
            show[i] = array[i];
        
        //returning the values that have been stored in the int[]
        return show;
    }

    public static int[] displayString(String[] array){
        
        int[] show = new int[array.length];

        for(int i = 0; i < array.length; i++)

           //parsed the string to a boolean and since it is false it returns 0
           show[i] = Boolean.parseBoolean(array[i])? 1 : 0;
      
        //returning the values that have been stored in the int[]
        return show;
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

}
