public class EnumTest1 {
	public static void main(String[] args) {
		Planets[] values = Planets.values();
		 
		for(Planets day:values){
			System.out.println(day + " "+ day.getPlanetNumber());
		}
	}
}
