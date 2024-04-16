public class ArrayPopulation3_initialisation {
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
        
        //for loop that populates the arrays with -1
        for(int i = 0; i < intArray.length; i++){
            
            //intialising the numeric arrays to -1
            boolArray[i] = Boolean.parseBoolean("true");
            byteArray[i] = (byte)-1;
            charArray[i] = (char)i;
            shortArray[i] = (short)-1;
            intArray[i] = -1;
            floatArray[i] = -1;
            longArray[i] = -1;
            doubleArray[i] = -1;
            stringArray[i] = Integer.toString(-1);
       
        } 
         
         //printing the arrays of each data type 
         printArray("boolean array: ", boolArray);
         printArray("byte array: ", byteArray);
         printArray("char array: ", charArray);
         printArray("short array: ", shortArray);
         printArray("int array: ", intArray);
         printArray("float array: ", floatArray);
         printArray("long array: ", longArray);
         printArray("double array: ", doubleArray);
         printArray("string array: ", stringArray);
        
    }
    
    /*overloaded methods where each parameter is different with the second parameter**/
    
    //method that prints the array of the double array
    public static void printArray(String prefix, double[] arrayToPrint){
        System.out.print(prefix);

        //makes the output pretty
        System.out.print("[");
       
        //for loop that prints the values of each index of the double with commas if the condition is right
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);

            //if statement that checks if the value/element is not equal to the arrays length 
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }        
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix, String[] arrayToPrint){
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

    public static void printArray(String prefix, float[] arrayToPrint){
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

    public static void printArray(String prefix, char[] arrayToPrint){
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
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }        
        }
        System.out.print("]\n");
    }

    public static void printArray(String prefix, short[] arrayToPrint){
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

    public static void printArray(String prefix, boolean[] arrayToPrint){
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

    public static void printArray(String prefix, int[] arrayToPrint){
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

    public static void printArray(String prefix, long[] arrayToPrint){
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
