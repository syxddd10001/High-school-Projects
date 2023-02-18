/**
 *Name: Syed Iltefat
 *Date: 2020-10-13
 *Purpose: Teacher Student Class
 *Title: Assignment 4
 */
package com.mycompany.teacherstudenta4;

import java.io.*;


public class teacherClass extends personClass{
	String[] strCourses;
	int intCoursesNum;
	String strDepartment;
	int intEmployeeID;
	int intSalary;
	static BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in));
	static final int MAX_COURSES = 10;

	public teacherClass(String strName, String strAddress, String strDepartment, long intDateOfBirth)
	{
		super(strName, strAddress, intDateOfBirth);
		intCoursesNum = 0;
		strCourses = new String[MAX_COURSES];
		this.intEmployeeID = (int)(Math.random()*100+1);
		this.strDepartment = strDepartment;
		this.intSalary = (int)(Math.random()*10000+50000);
	}

	public boolean addCourse(String course)
	{
		// Check if the course already in the course list
		for (int i = 0; i < intCoursesNum; i++)
		{
			if (strCourses[i].equals(course)) return false;
		}
		strCourses[intCoursesNum] = course;
		intCoursesNum++;
		return true;
	}

	public void printInfo()
	{
		System.out.print(this);
		for (int i = 0; i < intCoursesNum; i++)
		{
			System.out.print(" " + strCourses[i] + ": " + strDepartment + " "); 

		}
		System.out.println(" salary: " +  intSalary);
		System.out.println();
	}





	public boolean removeCourse(String course) 
	{
		// Look for the course index
		int courseIndex = intCoursesNum;
		for (int i = 0; i < intCoursesNum; i++) {
			if (strCourses[i].equals(course)) {
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




				if (addCourse(userInput1))
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
