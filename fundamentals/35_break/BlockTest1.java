public class BlockTest1 {
    public static void main(String[] args) {
           
            int i =1;
        {
          
           System.out.println("Block 1 i = "+ i);
        }
       
        {
            
            System.out.println("Block 2 i = "+ i);            
        }

        System.out.println("Sum of block 1 and 2: " + (i + i));
       
    }
}
