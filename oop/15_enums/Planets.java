public enum Planets{
	SUN(1), MERCURY(2), VENUS(3), EARTH(4), SATURN(5), JUPITER(6), URANUS(7);
    
    Planets(int numberOfPlanets){
		planetNumber = numberOfPlanets;
	}
	 
	private int planetNumber;
	 
	public int getPlanetNumber(){
		return planetNumber;
	}
}