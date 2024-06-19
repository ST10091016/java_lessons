import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate1 {
   public static void main(String[] args) {
     Predicate<Integer> overAge = a -> a >= 21;
     Predicate<Integer> underAge = a -> a < 65;

     System.out.println(overAge.and(underAge).test(2));
     System.out.println(overAge.and(underAge).test(64));
   }
}

