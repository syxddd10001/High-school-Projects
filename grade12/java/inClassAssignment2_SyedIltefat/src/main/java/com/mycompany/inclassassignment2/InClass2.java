/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inclassassignment2;
import java.io.*;
import java.util.StringTokenizer;

/**
 *Name: Syed Iltefat
 *Date: 2020-09-28
 *Purpose: Bubble sorting 
 *Title: In class Assignment 2
 */

public class InClass2
{
    public static void main(String args[]) throws IOException
    {
        realFunction();
    
    }

    
    public static void realFunction() throws IOException
    {
               
        BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));
        String strInput="";
        String strRecord[];
        String strLastName[];
        String strFirstName[];
        String strStudNum[];
        String strRole[];
        int intGrade[];
        int intRecCount=0;
        int intAge[];
        //read from a file
        BufferedReader readFile=new BufferedReader(new FileReader("SampleDataCompany.txt"));
        //counts record
        while((strInput=readFile.readLine())!=null)
        {
            intRecCount++;
        }
        readFile.close();
        //size the array to store records
        strRecord=new String[intRecCount];
        strFirstName=new String[intRecCount];
        strLastName=new String[intRecCount];
        intGrade=new int[intRecCount];
        strStudNum=new String[intRecCount];
        strRole=new String[intRecCount];
        intAge = new int[intRecCount];
        //open again
        readFile=new BufferedReader(new FileReader("SampleDataCompany.txt"));
        readFile.readLine();
        //input information
        for(int i=1; i<strRecord.length; i++)
        {
            strRecord[i]=readFile.readLine();
        }

        //input values one by one per record
        for(int i=1; i<strRecord.length;i++)
        {
            StringTokenizer strToken= new StringTokenizer(strRecord[i], ",");
            while(strToken.hasMoreElements())
            {
                strStudNum[i]=strToken.nextElement().toString();
                strFirstName[i] = strToken.nextElement().toString();
                strLastName[i] = strToken.nextElement().toString();
                strRole[i]=strToken.nextElement().toString();
                intGrade[i]=Integer.parseInt(strToken.nextElement().toString());
                intAge[i]=Integer.parseInt(strToken.nextElement().toString());

            }

        }
        //input
        
        System.out.println("A. Sort by Grade");       
        System.out.println("B. Sort by Age");
        System.out.println("C. Exit");
        
        String strUserInput = myInput.readLine();
        if (strUserInput.equals("A"))
        {
            System.out.println("ID FirstN LastN    Role  Grade  Age");

            for(int i=0;i<intGrade.length-1;i++)
            {
                for(int j=0;j<intGrade.length-1;j++)
                {
                    if(intGrade[j]<intGrade[j+1])
                    {
                        //swap
                        int intGrTemp=intGrade[j];
                        intGrade[j]=intGrade[j+1];
                        intGrade[j+1]=intGrTemp;
                        int intAgeTemp=intAge[j];
                        intAge[j]=intAge[j+1];
                        intAge[j+1]=intAgeTemp;
                        String strTemp=strStudNum[j];
                        strStudNum[j]=strStudNum[j+1];
                        strStudNum[j+1]=strTemp;
                        strTemp=strRole[j];
                        strRole[j]=strRole[j+1];
                        strRole[j+1]=strTemp;
                        strTemp=strFirstName[j];
                        strFirstName[j]=strFirstName[j+1];
                        strFirstName[j+1]=strTemp;
                        strTemp=strLastName[j];
                        strLastName[j]=strLastName[j+1];
                        strLastName[j+1]=strTemp;
                    }
                }
            }

            for(int i=0; i<strRecord.length;i++)
            {        
                System.out.println(strStudNum[i]+" "+strFirstName[i] + " " + strLastName[i] + " " +strRole[i] + " " +intGrade[i] + " "+intAge[i]);       


            }

        System.out.println("Do you want to create a sorted file? y or n?");
        strUserInput = myInput.readLine();
        if (strUserInput.equals("y"))
        {
            FileWriter fileOut = new FileWriter("GradeSamplefile.txt");
            
            String newLine = System.getProperty("line.separator");
            for(int i=0; i<47; i++)
            {
                if (!strStudNum[i].equals("null"))
                {
                    fileOut.write(strStudNum[i]+","+strFirstName[i] + "," + strLastName[i] + "," +strRole[i] + "," +intGrade[i] + ","+intAge[i]+ newLine);
                    
                }
                else
                {}
            }
           fileOut.close(); 
        }
       
        else 
        {
            realFunction();
        }
        }
        else if (strUserInput.equals("B"))
        {
            System.out.println("ID FirstN LastN     Role  Grade  Age");
            for(int i=0;i<intAge.length-1;i++)
            {
                for(int j=0;j<intAge.length-1;j++)
                {
                    if(intAge[j]>intAge[j+1])
                    {
                        //swap
                        int intGrTemp=intGrade[j];
                        intGrade[j]=intGrade[j+1];
                        intGrade[j+1]=intGrTemp;
                        int intAgeTemp=intAge[j];
                        intAge[j]=intAge[j+1];
                        intAge[j+1]=intAgeTemp;
                        String strTemp=strStudNum[j];
                        strStudNum[j]=strStudNum[j+1];
                        strStudNum[j+1]=strTemp;
                        strTemp=strRole[j];
                        strRole[j]=strRole[j+1];
                        strRole[j+1]=strTemp;
                        strTemp=strFirstName[j];
                        strFirstName[j]=strFirstName[j+1];
                        strFirstName[j+1]=strTemp;
                        strTemp=strLastName[j];
                        strLastName[j]=strLastName[j+1];
                        strLastName[j+1]=strTemp;
                    }
                }
            }

            for(int i=0; i<strRecord.length;i++)
            {        
                System.out.println(strStudNum[i]+ " "  +strFirstName[i] + " " +strLastName[i] + " " +strRole[i] + " " +intGrade[i] + " "+intAge[i]);       

            }
            System.out.println("Do you want to create a sorted file? y or n?");
            strUserInput = myInput.readLine();
            if (strUserInput.equals("y"))
            {
                FileWriter fileOut = new FileWriter("AgeSamplefile.txt");
                String newLine = System.getProperty("line.separator");
                
                for(int i=0; i<strRecord.length; i++)
                {
                    if (!strStudNum[i].equals("null"))
                    {
                        fileOut.write(strStudNum[i]+","+strFirstName[i] + "," + strLastName[i] + "," +strRole[i] + "," +intGrade[i] + ","+intAge[i]+newLine);
                    
                    }
                    
                    else
                    {
                    
                    }
                }
                fileOut.close(); 
            }
            
            
            else
            {
            realFunction();
            }
        }
        else
        {}
           
    }
        
}


