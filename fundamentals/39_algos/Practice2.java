import java.util.Random;
import java.util.Arrays;

public class Practice2 {
	public static void main(String[] args){
     
     int[][] numbers = new int[10][50];
     Random ran = new Random();

    
     for(int i =0; i< numbers.length; i++){
          
          for(int j = 0;j< numbers[i].length; j++){
          		numbers[i][j] = ran.nextInt(50);

          }
        
     }

     for(int i =0; i< numbers.length; i++){
     	Arrays.sort(numbers[i]);
     }

        for(int i =0; i< numbers.length; i++){
          
          for(int j = 0;j< numbers[i].length; j++){
          	System.out.println(numbers[i][j]);

        }
     }
  }
}