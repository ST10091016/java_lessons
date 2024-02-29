import java.util.Random;

public class BlockB{

	public static void primarySchool(int phaseNum){
    
    Random randomName = new Random();

   	String[] junior = {"Mrs. RedField", "Mrs. Keg", "Mr. Grey"};
 	  String[] senior = {"Miss. Green", "Mr. Brown", "Mr. White"};
    
    if(phaseNum >= 0 && phaseNum <=3){
      
      System.out.println("Your classroom teacher is " + junior[randomName.nextInt(junior.length)]);
      System.out.println("Gym teacher is Mr. Boldman");

    }else if(phaseNum >= 4 && phaseNum <= 6){
      
      System.out.println("Your classroom teacher is " + senior[randomName.nextInt(senior.length)]);
      System.out.println("Gym teacher is Mrs. Mendez");

    }
  }
}