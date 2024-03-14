import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        
        list.add("banana");
        list.add("strawberries");
        list.add("kiwi");
        list.add("apples");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("grapes");
        list2.add("watermelon");
        list2.add("mangos");
        list2.add("kiwi");
        list2.add("apples");

        Object[] arr = list2.toArray();
        System.out.println(Arrays.toString(arr));    
        
    }
}
