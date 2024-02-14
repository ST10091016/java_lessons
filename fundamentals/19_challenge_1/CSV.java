import java.util.Scanner;

//importing input and output classes
import java.io.*;
import java.lang.System;

public class CSV{

       //instantiation of Scanner class
        static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
        
        //prompting the user 
		System.out.print("Please select a number from the menu: \n");
		System.out.print("1. Capture a new user. ");
		System.out.print("2. Print full CSV. ");
		System.out.print("3. Exit program. ");
        
        //storing the users value into a variable
        String option = sc.nextLine();
		int menu = Integer.parseInt(option);

        //if else statements that go according to the menu
		if(menu == 1){

		   //calling the method
           createNewUser();
		} 

		else if(menu == 2){

              viewCSV();
		}

		else if(menu ==3) {
         
         //exits the program
       //  System.out();

		}
	}

    //method for creating a new user
	public static void createNewUser(){

      //prompting the user
      System.out.print("Enter user's name: ");
      String name = sc.nextLine();

      System.out.print("Enter user's surname: ");
      String surname = sc.nextLine();

      System.out.print("Enter user's age: ");
      String age = sc.nextLine();
      int userAge = Integer.parseInt(age);

      String data = null;
 
      try{

      //creating a new file for the CSV
      File files = new File("CSVData.txt");
      files.createNewFile();

      FileWriter writing = null;
      writing = new FileWriter("CSVData.txt", true);

      BufferedWriter bufferedWriter = new BufferedWriter(writing);

      data = String.format(name, surname, age);
      bufferedWriter.write(data);

      bufferedWriter.close();
      System.out.println("User successfully captured!");

      } catch(IOException e){
         System.out.println("An error has occured.");
      }
      
	}

    //method that prints out all of the users that have been captured
	public static void viewCSV(){


	}
}