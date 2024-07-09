import java.io.*;
class HelloWorld {
    public static void main(String[] args) {
        
   try {
        throw new RuntimeException("Exception in try block");
    } catch (RuntimeException e) {
        System.out.println("Caught runtime exception: " + e.getMessage());
        
        throw e;
        
        
    } finally {
        
        System.out.println("Finally block executed.");
       
    }
    }
}