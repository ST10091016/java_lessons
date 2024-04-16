public class TestSourceDestination {
    public static void main(String[]args){
        int[] source = new int[10];
        int[] destination = new int[10];

        //populate source with position+20 as index value

        for(int i = 0; i < source.length; i++){
            source[i] = i + 20;
 
        }

       
        printArray("Source int before copy: ",source);
        printArray("Destination in before copy: ",destination);

        //write a for loop that copies all the values in source to destination. Do not use System.arraycopy()
        // use assignment to assign values to matching indexes
     
        printArray("Source after copy: ",source);
        printArray("Destination after copy: ",destination);

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
