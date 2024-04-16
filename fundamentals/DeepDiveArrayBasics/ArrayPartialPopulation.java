public class ArrayPartialPopulation {
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
        
        //populates the last 5 elements/values in the array for the char and boolean
        for(int i = 5; i < boolArray.length; i++){
           boolArray[i] = true;
           charArray[i] = 97;
           shortArray[i] = 22;
           intArray[i] = i;
           byteArray[i] = (byte)i;
           doubleArray[i] = i;
           longArray[i] = i;
           floatArray[i] = i;
        }
        
        //populates the forst 5 elements in the array with zero in the string array
        for(int i = 0; i < 5; i++){
            stringArray[i] = "0";
        }
         
        //printing the arrays of each data type 
        printArray("boolean array: ", boolArray);
        printArray("char array: ", charArray);
        printArray("string array: ", stringArray);
        printArray("int array: ", intArray);
        printArray("double array: ", doubleArray);
        printArray("long array: ", longArray);
        printArray("byte array: ", byteArray);
        printArray("floatArray: ", floatArray);
        printArray("short array: ", shortArray);
        
    }
    
    /*overloaded methods where each parameter is different with the second parameter**/
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

    public static void printArray(String prefix, double[] arrayToPrint){
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

    public static void printArray(String prefix, byte[] arrayToPrint){
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
}