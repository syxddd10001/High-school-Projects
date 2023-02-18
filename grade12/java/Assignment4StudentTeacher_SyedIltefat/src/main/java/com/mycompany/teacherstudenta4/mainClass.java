/**
 *Name: Syed Iltefat
 *Date: 2020-10-13
 *Purpose: Teacher Student Class
 *Title: Assignment 4
 */
package com.mycompany.teacherstudenta4;

import java.io.*;

public class mainClass
{
	static BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in)); // global bufferedreader input for global access
	static int globalCount = 0; // a global counter that can be used everywhere


	public static void main(String[] args) throws IOException
	{	
		
		menuFunc(); //calling the menu function
		
	}

	public static void menuFunc() throws IOException
	{
		
		System.out.println("Choose 1 of the following options: ");		 // the user selects which file they want to access
		System.out.println("A. Student Files ");
		System.out.println("B. Teacher Files ");
		System.out.println("E. Exit ");
		String userInput3 = myInput.readLine();
		
		if (userInput3.equals("A"))
		{
			student();
			
		}
		
		else if (userInput3.equals("B"))
		{
			teacher();
			
		}
		
	}
	
	
	
	
	
	public static void student() throws IOException
	{

                globalCount = 0;
		System.out.println("How many students do you want to add: ");	//the user inputs how many students they want to add	 
		String userInput344 = myInput.readLine();
		int ParseInp = Integer.parseInt(userInput344);
		String courses[] = new String[30]; // array that stores the courses for that individual student
		studentClass stuArray[] = new studentClass[ParseInp]; // declaring a student class array

		

		while(globalCount != ParseInp) 
		{
			int convNum = globalCount + 1;
			
			System.out.println("Enter Student "+ convNum + " name: "); // the user inputs the student's name
			String userNameInp = myInput.readLine(); 
			System.out.println("Enter Student " + convNum + " address: "); // the user inputs the student's address
			String userAddressInp = myInput.readLine(); 
			System.out.println("Enter Student's Date of birth (enter as MMDDYY with no spaces or symbols");  // the user inputs the student's address
			String userInput1 = myInput.readLine();
			long lngParseInp = Long.parseLong(userInput1);
			stuArray[globalCount] = new studentClass(userNameInp, userAddressInp ,lngParseInp); // saving the students info in the student class array




			System.out.println("Enter how many courses you want to add (max 30)"); //user inputs how many courses they want to add
			userInput1 = myInput.readLine(); 
			lngParseInp = Integer.parseInt(userInput1);


			int count = 0;
			System.out.println(lngParseInp);
			if (ParseInp > 30 ) 
			{
				System.out.println("number of courses has to be less than 30 and more than 0: ");	// number courses cant be more than 30
				student();
			}

			while (true) //adding courses to the course array
			{
				if (count == lngParseInp)
				{
					break;
				}
				System.out.print("Course ");
				System.out.println(count+1); 
				userInput1 = myInput.readLine(); // user inputs the course name 
				System.out.println("Grade ");
				String userInp2 = myInput.readLine();// user inputs the course grade 
				int intParseInp = Integer.parseInt(userInp2);
				stuArray[globalCount].addCourseGrade(userInput1, intParseInp);// calling the add course function from the student class			 
				count+=1;

			}



			courses[globalCount] = stuArray[globalCount].strCourses[globalCount];

			stuArray[globalCount].printInfo();


			System.out.println("Average:  " + stuArray[globalCount].getAverageGrade());
			globalCount+=1;
		}

		System.out.println("Do you want to add or remove any courses[for student]? A to add and R to remove and E to go to main menu");//if the user wants to remove or add other courses
		
		String userInput = myInput.readLine(); 
		
		if (userInput.equals("A"))
		{
			System.out.println("which student do you want to access [indexes start with 1 not 0]"); // user selects which student's file they want to access
			userInput = myInput.readLine();
			int intParseInp = Integer.parseInt(userInput);
			stuArray[intParseInp-1].addFunc(); // calling the add function from the student class
			stuArray[intParseInp-1].printInfo();// calling the print info function from the student class
			menuFunc();
		}
		




		else if (userInput.equals("R"))						 
		{
			System.out.println("which student do you want to access [indexes start with 1 not 0]");
			userInput = myInput.readLine();
			int intParseInp = Integer.parseInt(userInput);
			System.out.println("which course do you want to remove? Enter the exact name: "); // user enters the exact name of the course they want to remove
			userInput = myInput.readLine();
			stuArray[intParseInp-1].rmvFunc(userInput); // calling the remove function from the student class
			stuArray[intParseInp-1].printInfo(); // calling the print info function from the student class	 		
			menuFunc();
		}
		
		else if (userInput.equals("E"))	
		{
			menuFunc(); //exit to main menu
		}
		
		

		
		globalCount=0;

	}

	public static void teacher () throws IOException
	{
            globalCount=0;
            System.out.println("How many teachers do you want to add: ");	//the user inputs how many teachers they want to add	 
		String userInput310 = myInput.readLine();
		int ParseInp = Integer.parseInt(userInput310);
		String courses[] = new String[10]; // array that stores the courses for that individual teacher
		teacherClass teachArray[] = new teacherClass[ParseInp]; // declaring a teacher class array	
		
		while(globalCount != ParseInp) 
		{
			int convNum = globalCount + 1;
			
			System.out.println("Enter Teacher "+ convNum + " name: "); // the user inputs the teacher's name
			String userNameInp = myInput.readLine(); 
			System.out.println("Enter Teacher " + convNum + " address: "); // the user inputs the teacher's address
			String userAddressInp = myInput.readLine(); 
			System.out.println("Enter Teacher's Department: ");   // the user inputs the teacher's deparment
			String userInput1 = myInput.readLine();
			
			
			
			teachArray[globalCount] = new teacherClass(userNameInp, userAddressInp , userInput1, (long)(Math.random()*100+1)); 

			// saving the students info in the student class array


			System.out.println("Enter how many courses you want to add (max 10)"); // the user inputs how many courses they want to add (max 10)
			userInput1 = myInput.readLine();
			long lngParseInp = Integer.parseInt(userInput1);


			int count = 0;
			


			while (true) //adding courses to the course array
			{
				if (count == lngParseInp)
				{
					break;
				}
				System.out.print("Course ");
				System.out.println(count+1); 
				userInput1 = myInput.readLine();
				System.out.println(" "); 
				teachArray[globalCount].addCourse(userInput1);	// calling the add course function from the teacher class			 
				count+=1;

			}


			
			courses[globalCount] = teachArray[globalCount].strCourses[globalCount];

			teachArray[globalCount].printInfo();

			globalCount+=1;
			
		}
				
		System.out.println("Do you want to add or remove any courses? A to add and R to remove and E to go to main menu");	//if the user wants to add or remove any courses	
		String userInput10 = myInput.readLine(); 
		
		if (userInput10.equals("A"))
		{
			System.out.println("which teacher do you want to access [indexes start with 1 not 0]"); // user inputs the teacher ID number to access add
			userInput10 = myInput.readLine();
			int intParseInp = Integer.parseInt(userInput10);
			teachArray[intParseInp-1].addFunc();// calling the add course function from the teacher class	
			teachArray[intParseInp-1].printInfo();// calling the print function from the teacher class
			menuFunc();
		}
		




		else if (userInput10.equals("R"))						 
		{
			System.out.println("which teacher do you want to access [indexes start with 1 not 0]"); // user inputs the teacher ID number to access add
			userInput10 = myInput.readLine();
			int intParseInp = Integer.parseInt(userInput10);
			System.out.println("which course do you want to remove? Enter the exact name: "); // user inputs the teacher ID number to access add
			userInput10 = myInput.readLine();
			teachArray[intParseInp-1].rmvFunc(userInput10);// calling the remove course function from the teacher class
			teachArray[intParseInp-1].printInfo();		// calling the print function from the teacher class	
			menuFunc();
		}
		
		else if (userInput10.equals("E"))	
		{
			menuFunc(); //exit to main menu
		}
		
		
		
	}
	
	











}

