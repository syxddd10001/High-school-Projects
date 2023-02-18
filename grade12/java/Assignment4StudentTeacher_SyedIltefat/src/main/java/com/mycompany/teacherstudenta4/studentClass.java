
/**
 *Name: Syed Iltefat
 *Date: 2020-10-13
 *Purpose: Teacher Student Class
 *Title: Assignment 4
 */


package com.mycompany.teacherstudenta4;
import java.io.*;
public class studentClass extends personClass 
{
	static BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in));
	String[] strCourses;
	int intCoursesNum;
	int [] intGrades;
	int intStudentID;
	int intTuition;
	int intTuitionOweing;




	static final int MAX_COURSES = 30;

	public studentClass(String strName, String strAddress, long intDateOfBirth)
	{
		super(strName, strAddress, intDateOfBirth);
		intCoursesNum = 0;
		strCourses = new String[MAX_COURSES];
		intGrades = new int[MAX_COURSES];
		this.intTuition = (int)(Math.random()*10000+5000);
		this.intTuitionOweing = (int)(Math.random()*5000);
		this.intStudentID = (int)(Math.random()*100+1);
	}





	public void addCourseGrade(String course, int grade) 
	{
		strCourses[intCoursesNum] = course;
		intGrades[intCoursesNum] = grade;
		intCoursesNum++;
	}

	// Print all courses taken and their grade
	public void printInfo()
	{
		System.out.print(this);
		for (int i = 0; i < intCoursesNum; i++)
		{
			System.out.print(" " + strCourses[i] + ": " + intGrades[i] + " "); 

		}
		System.out.println(" tuition: " + intTuition + " tuition owed: " + intTuitionOweing);
		System.out.println();
	}

	public double getAverageGrade()
	{
		int sum = 0;
		for (int i = 0; i < intCoursesNum; i++ ) 
		{
			sum += intGrades[i];
		}
		return (double)sum/intCoursesNum;
	}


	public boolean addCourse(String course, int grade)
	{
		// Check if the course already in the course list
		for (int i = 0; i < intCoursesNum; i++)
		{
			if (strCourses[i].equals(course)) return false;
		}
		strCourses[intCoursesNum] = course;
		intGrades[intCoursesNum] = grade;
		intCoursesNum++;
		return true;
	}


	public boolean removeCourse(String course) 
	{
		// Look for the course index
		int courseIndex = intCoursesNum;
		for (int i = 0; i < intCoursesNum; i++) {
			if (strCourses[i].equals(course)) 
			{
				courseIndex = i;
				break;
			}
		}
		if (courseIndex == intCoursesNum) 
		{ // cannot find the course to be removed
			return false;   
		} 
		else 
		{  // remove the course and rearrange for courses array
			for (int i = courseIndex; i < intCoursesNum-1;i++) 
			{
				strCourses[i] = strCourses[i+1];
			}
			intCoursesNum-=1;
			return true;
		}
	}

	public void rmvFunc(String courseName) throws IOException
	{


		for (int i=0; i<strCourses.length; i++) 
		{
			if ((strCourses[i]) == null) 
			{
				break;
			}
			if (removeCourse(courseName)) 
			{
				System.out.println("course removed.");
			} 
			else 
			{
				System.out.println("");
			}
		}
	}


	public void addFunc() throws IOException
	{

		while(true) 
		{				 

			System.out.println("enter 999 to exit now or press enter to continue adding: ");
			String input1 = myInput.readLine(); 
			if (input1.equals("999")) 
			{					

				break;
			}
			for (int i=0; i<strCourses.length; i++)
			{
				System.out.print("Add Course: ");

				String userInput1 = myInput.readLine();
				System.out.println("Grade ");
				String userInp2 = myInput.readLine();
				int intParseInp = Integer.parseInt(userInp2);



				if (addCourse(userInput1, intParseInp))
				{
					System.out.println("course added.");
					break;
				} 
				else 
				{
					System.out.println("cannot be added.");
				}
			}
		}




	}
}
