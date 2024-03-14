import java.util.*;

public class VectorTest {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        
        v.add("banana");
        v.add("blueberries");
        v.add("raspberries");
        v.add("kelp");
        
        //System.out.println("Before: "+ v);

         Vector<String> v2 = new Vector<>();  
        v2.add("salad");
        v2.add("grapes");
        v2.add("apples");
        v2.add("dressing");
        v2.add("banana");
        v2.add("blueberries");
        v2.add("raspberries");
        v2.add("kelp");   

        Vector<String> vector = new Vector<String>(v2);
        System.out.println("vector: "+ vector);
        
    }
}
