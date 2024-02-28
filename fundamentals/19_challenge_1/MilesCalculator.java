public class MilesCalculator{

     //method that calculates the distance and converts it into miles and meters.
     public static double calculate(String km){
           
        //ininitialising the miles for it to do the calculation
	     double miles = (Double.parseDouble(km)/1.609344);
        return miles;
    }
}