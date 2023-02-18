/**
 *Name: Syed Iltefat
 *Date: 2020-10-13
 *Purpose: Teacher Student Class
 *Title: Assignment 4
 */
package com.mycompany.teacherstudenta4;

public class personClass
{
	String strName;
    String strAddress;
    long intDateOfBirth; // format: DDMMYYYY or 04121999
    


	public personClass(String strName, String strAddress, long intDateOfBirth) 
	{
		this.strName = strName;
		this.strAddress = strAddress;
		this.intDateOfBirth = intDateOfBirth;
	}







	public String toString()
    {
      return strName + "(" + strAddress + ")";
    }
	
	
}
