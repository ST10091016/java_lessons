import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class VectorTest1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Tumi");
        list.add("Keegan");
        list.add("Thabo");
        list.add("Tsholo");

        Object[] arr = list.toArray();
        System.out.print("ArrayList to Array: " + Arrays.toString(arr));     
    }
}
