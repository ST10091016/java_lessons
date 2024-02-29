public class Printer{

	public static void print(String name, int grade){
     
     //declaring and initialisng the variables
     String inputGrade = null;
     boolean validName = false;
     boolean validGrade = false;
     
     //while loop to reprompt the user
     while(!validName){

     	name = Prompter.prompt("\nEnter your name: ");
      
      //if name is empty then an error gets displayed to the user and they get reprompted again
     	if(name.isEmpty()){
         
          System.out.print("\nError! Your name cannot be empty.");

        }else{
          
          //setting the boolean to true, which breaks out of the loop
        	validName = true;
        }

     }

     while(!validGrade){
         
         inputGrade = Prompter.prompt("\nEnter your grade: ");
        
        //tests if the grade is an int, if not there is an exception thrown and user gets prompted again
        try{

         grade = Integer.parseInt(inputGrade);
         
         //checks if the user inputted an empty value, if so they get prompted again
         if(inputGrade.isEmpty()){
         
          System.out.print("\nError! Your grade cannot be empty.");
          
        //if the user enters anything else, then the garde is out of range
        }else if(grade > 12 || grade < 0){

          System.out.print("\nError! Grade is out of school range.");
        	
        }else{

          validGrade = true;
        }

        }catch(Exception e){
        
         System.out.print("\nError! Please enter a number.");
        
        }

     }
     
     //if the user enters a grade from 0-6 they are in primary school
     if(grade >= 0 && grade <= 6){
       
       //prints out to the user
       System.out.println("\n\nStudent Details\n");
       System.out.print("Hello " + name + "! \nYou are in grade " + inputGrade + "\n");
      BlockB_Alternative.primarySchool(grade);
       //BlockB.primarySchool(grade);

     }
     
     //if the user enters a grade from 7-12 they are in primary school
     else if(grade >= 7 && grade <= 12){
       
       System.out.println("\n\nStudent Details\n");
       System.out.print("Hello " + name + "! \nYou are in grade " + inputGrade + "\n");
      BlockA_Alternative.highSchool(grade);
       //BlockA.highSchool(grade);
    
     }
      
   }

}