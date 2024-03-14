class Printer{
    
    //method that prints out to the user
	public static void print(String name, String surname, String age, String miles){
     
     //prompting the user
     System.out.print("\n+++++++++++ Capturing user details +++++++++++");
	 name = Prompter.prompt("\n\nWhat is your name? ");
     surname = Prompter.prompt("What is your surname? ");
     String date_of_birth = null;
     String distance_from_store = null;;
     
     //double age = AgeCalculator.calculate(date_of_birth);
     double toMiles = 0;
     boolean dob = false; 
     boolean distance = false;
    
    //do wile loop that excutes the prompt first then checks if the date is false
    do{
       
        date_of_birth = Prompter.prompt("Enter your date of birth (DD/MM/YYYY): ");
       
    }while(!DateValidator.isValid(date_of_birth));
    

    do{

        distance_from_store = Prompter.prompt("How far is your favourite store from your home in km? ");

    }while(!NumberValidator.isValid(distance_from_store));

    //if the statement is true where dob and siatnce are true then it prints out to the user
	if(!dob && !distance){

     //declaring and initialising variables
     int ageCalc = AgeCalculator.calculate(date_of_birth);
     int ageInSeconds = ageCalc;
     int seconds = ageInSeconds *365*24*60*60;
     int ageInMilli = seconds * 1000;
     String hexaAge = Integer.toHexString(ageInSeconds);
     String binaryAge = Integer.toBinaryString(ageInSeconds);
     toMiles = MilesCalculator.calculate(distance_from_store);  
     double meters = toMiles * 1609.34;
     
     //printing out to the user
     System.out.print("\n+++++++++++ Displaying user details +++++++++++\n");
     System.out.println("Hello " + name + " " + surname);
     System.out.println("You are " + ageCalc + " years old.");x
     System.out.println("The distance is from kilometeres to miles " + toMiles + " miles.");
     System.out.println("The distance in meters is " + meters + " m.");
     System.out.println("\nYour age in seconds " + seconds + " s.");
     System.out.println("Your age in milliseconds " + ageInMilli + " ms.");
     System.out.println("Your age in hexadecimal " + hexaAge);
     System.out.println("Your age in binary " + binaryAge);
     System.out.print("\n-------------------------------");

	}
  }
}