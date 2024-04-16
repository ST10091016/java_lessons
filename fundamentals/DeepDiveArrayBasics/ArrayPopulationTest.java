public class ArrayPopulationTest {
    public static void main(String[]args){

        int[] array = new int[10];
        printBooleanArray("boolean array: ", array);
        printByteArray("byte array: ", array);
        printCharArray("char array: ", array);
        printShortArray("short array: ", array);
        printIntArray("int array: ", array);
        printFloatArray("float array: ", array);
        printLongArray("long array: ", array);
        printDoubleArray("double array: ", array);
        //printStringArray("string array: ", array);
    }

    public static void printBooleanArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            boolean values = (arrayToPrint[i] != 0);
            System.out.print(values);
            if(i < arrayToPrint.length - 1){
            	System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

     public static void printByteArray(String prefix, int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (byte i =0; i < arrayToPrint.length;i++) {
            int j = i;
            System.out.print(arrayToPrint[j]);
            if(j != arrayToPrint.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static void printCharArray(String prefix, int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0; i < arrayToPrint.length;i++) {
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static void printShortArray(String prefix, int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (short i =0; i < arrayToPrint.length;i++) {
            int j = i;
            System.out.print(arrayToPrint[j]);
            if(j != arrayToPrint.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static void printIntArray(String prefix,int[] arrayToPrint){
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

    public static void printFloatArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (float i =0;i < arrayToPrint.length;i++) {
            System.out.print(arrayToPrint[(int)i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static void printLongArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (long i =0;i < arrayToPrint.length;i++) {
            System.out.print(arrayToPrint[(int)i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    public static void printDoubleArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            double j = i;
            System.out.print(arrayToPrint[i]);
            if(j != arrayToPrint.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]\n");
    }

    //  public static void printStringArray(String prefix,int[] arrayToPrint){
    //     System.out.print(prefix);
    //     System.out.print("[");
    
    //     for (int i =0;i < arrayToPrint.length;i++) {
    //         String j = Integer.toString(i);
    //         System.out.print(arrayToPrint[j]);
    //         if(j < arrayToPrint.length-1){
    //             System.out.print(",");
    //         }
    //     }
    //     System.out.print("]\n");
    // }
}

