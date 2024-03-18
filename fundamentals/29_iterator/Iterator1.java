import java.util.Iterator;
import java.util.ArrayList;

public class Iterator1{
 public static void main(String[] args) {
 
   ArrayList<String> names = new ArrayList<>();
   names.add(0, "Tumi");
   names.add(1, "Keith");

   Iterator<String> arrayNames = names.iterator();
 }
}