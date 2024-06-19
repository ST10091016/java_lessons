import java.util.Scanner;

public class AgeGetter3{
   private int age;

   public int getAge(){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter your age ");
       age = Integer.parseInt(input.nextLine());
   	 return age;
   }
}