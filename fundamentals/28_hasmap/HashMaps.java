import java.util.HashMap;
import java.util.Map;

public class HashMaps{
	 public static void main(String[] args) {

       size();
       put();
       keySet();
       isEmpty();
       get();
       clear();
       containsKey();
       containsValue();
	 }

	 public static void size(){

         HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
         hashMap.put(1, "Banana");
         hashMap.put(2, "Berries");
         hashMap.put(3, "Strawberries");
         hashMap.put(4, "Mangoes");

         System.out.print("The size of this hash map is: " + hashMap.size());
	 }

	 public static void put(){

	 	 HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
         hashMap.put(1, "Banana");
         hashMap.put(2, "Berries");
         hashMap.put(3, "Strawberries");
         hashMap.put(4, "Mangoes");

         System.out.print(hashMap);
	 }

	 public static void keySet(){

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
         hashMap.put(1, "Banana");
         hashMap.put(2, "Berries");
         hashMap.put(3, "Strawberries");
         hashMap.put(4, "Mangoes");

	 	// Set<Integer, String> keySet = hashMap.keySet();
	 	System.out.print("KeySet " + hashMap.isEmpty());
	 }

	 public static void isEmpty(){
      
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
         hashMap.put(1, "Banana");
         hashMap.put(2, "Berries");
         hashMap.put(3, "Strawberries");
         hashMap.put(4, "Mangoes");

	 	 System.out.print("Is the hashmap empty? " + hashMap.isEmpty());
	 }

	 public static void get(){

	 	 HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
         hashMap.put(1, "Banana");
         hashMap.put(2, "Berries");
         hashMap.put(3, "Strawberries");
         hashMap.put(4, "Mangoes");

         System.out.print("Getting the Berries from hashMap: " + hashMap.get("Berries"));
	 }
	 public static void clear(){
       
          HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
         hashMap.put(1, "Banana");
         hashMap.put(2, "Berries");
         hashMap.put(3, "Strawberries");
         hashMap.put(4, "Mangoes");
	 	 
	 	 System.out.print("Before clearing: " + hashMap);
	 	 hashMap.clear();
	 	 System.out.print("After clearing: " + hashMap);
	 }
	 public static void containsKey(){

	 	HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	 	           hashMap.put(1, "Banana");
         hashMap.put(2, "Berries");
         hashMap.put(3, "Strawberries");
         hashMap.put(4, "Mangoes");

          System.out.print("Does the hashmap contain the key 1? " + hashMap.containsKey(1));
	 }
	 public static void containsValue(){

	 	HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
         hashMap.put(1, "Banana");
         hashMap.put(2, "Berries");
         hashMap.put(3, "Strawberries");
         hashMap.put(4, "Mangoes");

          System.out.print("Does the hashmap contain the value banana? " + hashMap.containsValue("Banana"));
	 }
}