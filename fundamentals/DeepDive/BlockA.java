import java.util.Random;

public class BlockA{
 
 public static void highSchool(int phaseNum){
    
    //creating an object for the random class
    Random randomName = new Random();
    
    //declaring arrays and initialising the array
  	String[] junior = {"Miss. Smith", "Mr. Roberts", "Mr. Nkosi"};
 	  String[] senior = {"Mr. Bryant", "Mr.Scott", "Mrs. Alexander"};
    
    //if statement for the lower highschool phase
    if(phaseNum >= 7 && phaseNum <= 9){
      
      //using the name of the array and making use of next int method to get a random number from the array index
      System.out.println("Your classroom teacher is " + junior[randomName.nextInt(junior.length)]);
      System.out.println("Gym teacher is Mrs. Scarlett");
    
    //if else statement for the upper highschool phase
    }else if(phaseNum >= 10 && phaseNum <= 12){
      
      System.out.println("Your classroom teacher is " + senior[randomName.nextInt(senior.length)]);
      System.out.println("Gym teacher is Mrs. Daniel");
      
    }
  }
}