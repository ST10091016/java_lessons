public class Grade{

	public static void displayGrade(){
        
        String name = null, grade = null, surname = null, teacher = null, physEd = null;
        boolean validName = false, validGrade = false;
        int intGrade = 0;
        
        while(!validName){

        	name = Prompter.prompt("Enter your name: ");

	        if(name.isEmpty()){
	           
	           System.out.print("\nYour name cannot be empty! Please enter in valid details.\n");
	       
	        }else{

              validName = true;

	        }

        }
		
		while(!validGrade){
             
            grade = Prompter.prompt("Enter in your grade in school: ");
            
	        try{
            
            intGrade = Integer.parseInt(grade);

            if (intGrade > 0 ) {
            	validGrade = true;
            }

            }catch(Exception e){
 
             System.out.println("\nError! Please make use of a number.");

            }

		} 

		//validGrade = false;
		 
        if(validGrade && validName){
         
           Printer.print(name, grade, teacher, physEd);
        }



        
        

        // if(intGrade >= 1 && intGrade <= 7){
        //    System.out.print("You are in block A");
        // }else{
        // 	System.out.print("You are in block B");
        // }
	}
}