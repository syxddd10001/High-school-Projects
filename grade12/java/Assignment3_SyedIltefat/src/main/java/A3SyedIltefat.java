/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Name: Syed Iltefat
 * Date: 02/10/2020
 * Purpose: String and Arrays
 * Title: Assignment 3
 */
import java.io.*;
import java.util.StringTokenizer;
public class A3SyedIltefat
{
	static BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException
	{
		
		menuFunction();
		
	}
	
	public static void menuFunction() throws IOException
	{
		
		System.out.println("Enter from the menu: ");
		System.out.println("A. Vowels, consonants, ',' and other characters");
		System.out.println("B. How many of each letter(also spaces and special characters)");
		System.out.println("C. Roman numerals to Arabic numerals");
		System.out.println("D. Grade checker");
		System.out.println("E. Exit");
		String userInput = myInput.readLine();
		
		if (userInput.equals("A"))
		{
			vowelsCounter();
			
			
		}
		
		else if (userInput.equals("B"))
		{
			
			alphabetCounter();
			
		}
		
		else if (userInput.equals("C"))
		{
			
			romanNumeral();
			
		}
		else if (userInput.equals("D"))
		{
			
			multipleCGrader();
			
		}
		
		else 
		{
			
			
			
		}
		
	
	}
	
	
	public static void vowelsCounter() throws IOException
	{
		int intVowelCounter = 0, intConsonantCounter = 0, intSpacesCounter = 0, intOtherCharactersCounter = 0, intInputSize;
		System.out.println("Please enter a lower case word");
		String strUserInput = myInput.readLine();
                strUserInput.toLowerCase();
		intInputSize = strUserInput.length();
		
		for(int i = 0; i<intInputSize;i++) 
		{
			
			
			if (strUserInput.substring(i,i+1).equals("a") || strUserInput.substring(i,i+1).equals("e") || strUserInput.substring(i,i+1).equals("i") || strUserInput.substring(i,i+1).equals("o") || strUserInput.substring(i,i+1).equals("u"))
			{
				intVowelCounter+=1;					
			}
			else if (strUserInput.substring(i,i+1).equals("b") || strUserInput.substring(i,i+1).equals("c") || strUserInput.substring(i,i+1).equals("d") || strUserInput.substring(i,i+1).equals("f") || strUserInput.substring(i,i+1).equals("g")|| strUserInput.substring(i,i+1).equals("h")||strUserInput.substring(i,i+1).equals("j")||strUserInput.substring(i,i+1).equals("k")||strUserInput.substring(i,i+1).equals("l")||strUserInput.substring(i,i+1).equals("m")||strUserInput.substring(i,i+1).equals("n")||strUserInput.substring(i,i+1).equals("p")||strUserInput.substring(i,i+1).equals("q")||strUserInput.substring(i,i+1).equals("r")||strUserInput.substring(i,i+1).equals("s")||strUserInput.substring(i,i+1).equals("t")||strUserInput.substring(i,i+1).equals("v")||strUserInput.substring(i,i+1).equals("w")||strUserInput.substring(i,i+1).equals("x")||strUserInput.substring(i,i+1).equals("y")||strUserInput.substring(i,i+1).equals("z"))
			{
				intConsonantCounter+=1;					
			}
			else if(strUserInput.substring(i,i+1).equals(" "))
			{
				intSpacesCounter +=1;
				
			}
			else
			{
				intOtherCharactersCounter += 1;
				
			}
		
		}
		
		System.out.println("Vowels: " + intVowelCounter);
		System.out.println("Consonants: " + intConsonantCounter);
		System.out.println("Spaces: " + intSpacesCounter);
		System.out.println("Other Characters: " + intOtherCharactersCounter);
	
		menuFunction();
		
	}
	
	
	public static void alphabetCounter() throws IOException 
	{
		
		BufferedReader readFile = new BufferedReader(new FileReader("mytext.txt"));
		String strInput="";
        int intRecCount = 0;
        String strWords[]; 
        String strWordsF = "";
		//counts record
       
        while((strInput = readFile.readLine())!=null)
        {
        	    	
        	intRecCount++;
    		
        }
		strWords = new String[intRecCount];
		intRecCount = 0;
		readFile.close();
		readFile = new BufferedReader(new FileReader("mytext.txt"));
        while((strInput = readFile.readLine())!=null)
        {     	
        	strWords[intRecCount] = strInput;     	
        	  		
        	intRecCount++;
        }
       
        readFile.close();
        intRecCount = 0;
        readFile = new BufferedReader(new FileReader("mytext.txt"));
        while((strInput = readFile.readLine())!=null)        
        {     	
        	strWordsF = strWordsF +  strWords[intRecCount];     	
        	
        	intRecCount++;
        }
        System.out.println(strWordsF);
        
        //
        
	        
	     // Create an array of size 256 i.e. ASCII_SIZE 
	        int intCount[] = new int[256]; 
	        strWordsF = strWordsF.toUpperCase();
	        int intLen = strWordsF.length(); 
	        
	        // Initialize count array index 
	        for (int x = 0; x < intLen; x++)
	        {
	            intCount[strWordsF.charAt(x)]++; 
	        }
	        // Create an array of given String size 
	        char ch[] = new char[strWordsF.length()]; 
	        for (int k = 0; k < intLen; k++) 
	        { 
	            ch[k] = strWordsF.charAt(k);
	            
	            int intFind = 0; 
	            for (int j = 0; j <= k; j++)
	            { 
	  
	                // If any matches found 
	                if (strWordsF.charAt(k) == ch[j])
	                {  
	                	            	
	                	intFind++;                 
	                }
	            } 
	  
	            if (intFind == 1) //  print the number of occurences
	            {
	            	System.out.println("Number of " + strWordsF.charAt(k) + " is:" + intCount[strWordsF.charAt(k)]);
	            	
	            	
	        	} 
	        
	        }
	        
        //
        
	        menuFunction();
        
        
     
        
	}
	
	public static void romanNumeral() throws IOException 
	{
		System.out.println("Please enter roman numerals");
		String strInput = myInput.readLine();
		strInput =  strInput.toUpperCase();
        int intCount = 0;
        String strNumbers[]; 
        int intTotalNum = 0;
        strNumbers = new String[strInput.length()+1];
        strNumbers[strInput.length()] = "";
        
        while(intCount != strInput.length())
        {
        	strNumbers[intCount] = strInput.substring(intCount,intCount+1);
        	
        	
        	intCount += 1;
        	
        	        	
        }
        int intICount = 0;
        int intXCount = 0;
        for(int i = 0; i<=strInput.length();i++)
        {
        	if (strNumbers[i].equals("I")) 
	    	{
	    		
	    		if (strNumbers[i+1].equals("V") || strNumbers[i+1].equals("X") || strNumbers[i+1].equals("L")|| strNumbers[i+1].equals("C") || strNumbers[i+1].equals("D")|| strNumbers[i+1].equals("M"))
	    		{
	    			if (intICount<2) 
	    			{
		    			intTotalNum -=1;
		    			intICount+=1;
	    			}
	    			
	    			else
	    			{
	    				System.out.println("Please input a proper Roman number");
	    				romanNumeral();
	    			}
	    		}
	    		
	    		
	    		
	    		else
	    		{
	    			
	    			intTotalNum +=1;
	    			
	    		}
	    	}
	    	
	        else if (strNumbers[i].equals("V")) 
	    	{	    		
	        	if (strNumbers[i+1].equals("V") || strNumbers[i+1].equals("L")|| strNumbers[i+1].equals("C") || strNumbers[i+1].equals("D")|| strNumbers[i+1].equals("M"))
	    		{
	    			System.out.println("Please input a proper Roman number");
	    			romanNumeral();
	    		}
	    		
	    		
	    		
	    		else
	    		{
	    			intTotalNum +=5;
	    			
	    		}
	        		        	
	    	}
        
	        
	        else if (strNumbers[i].equals("X")) 
	    	{	    		
	        	if (strNumbers[i+1].equals("L")|| strNumbers[i+1].equals("C") || strNumbers[i+1].equals("D")|| strNumbers[i+1].equals("M"))
	    		{
	        		if (intXCount<2) 
	    			{
		    			intTotalNum -=10;
		    			intXCount+=1;
	    			}
	    			
	    			else
	    			{
	    				System.out.println("Please input a proper Roman number");
	    				
	    			}
	    		}
	    		
	    		
	    		
	    		else
	    		{
	    			intTotalNum +=10;
	    			
	    		}
	    	}
	        
	        else if (strNumbers[i].equals("L")) 
	    	{	    		
	        	if (strNumbers[i+1].equals("L")|| strNumbers[i+1].equals("C") || strNumbers[i+1].equals("D")|| strNumbers[i+1].equals("M"))
	    		{
	    			System.out.println("Please input a proper Roman number");
	    			romanNumeral();
	    		}
	    		
	    		
	    		
	    		else
	    		{
	    			intTotalNum +=50;
	    			
	    		}
	    	}
	        
	        else if (strNumbers[i].equals("C")) 
	    	{	    		
	        	if (strNumbers[i+1].equals("C") || strNumbers[i+1].equals("D")|| strNumbers[i+1].equals("M"))
	    		{
	    			System.out.println("Please input a proper Roman number");
	    			romanNumeral();
	    		}
	    		
	    		
	    		
	    		else
	    		{
	    			intTotalNum +=100;
	    			
	    		}
	    	}
	        else if (strNumbers[i].equals("D")) 
	    	{	    		
	        	if (strNumbers[i+1].equals("M"))
	    		{
	    			System.out.println("Please input a proper Roman number");
	    			romanNumeral();
	    			
	    		}
	    		
	    		
	    		
	    		else
	    		{
	    			intTotalNum +=500;
	    			
	    		}
	    	}
	        
	        else if (strNumbers[i].equals("M")) 
	    	{	    		
	        	if (strNumbers[i+1].equals("M"))
	    		{
	    			System.out.println("Please input a proper Roman number");
	    			romanNumeral();
	    			
	    		}
	    		
	    		
	    		
	    		else
	    		{
	    			intTotalNum +=1000;
	    			
	    		}
	    	}
	            
        }
        
        System.out.println("the number is: " + intTotalNum);
        
        
        menuFunction();
        	
        	
        }
	
	
	public static void multipleCGrader() throws IOException
	{
		
		System.out.println("File Loaded...");
		System.out.println("A. Rank Grades (Descending)");
		System.out.println("B. Exit");
		String strUserInput = myInput.readLine();
		strUserInput =  strUserInput.toUpperCase();
		
			
			BufferedReader readFile = new BufferedReader(new FileReader("mytest.txt"));
			String strInput="";
	        int intRecCount = 0;
	        String strStudentMarks[]; 
	        String strAnswers[] = new String[15];
	        
	        
			//counts record
	       
	        while((strInput = readFile.readLine())!=null)
	        {
	        	    	
	        	intRecCount++;
	    		
	        }
			strStudentMarks = new String[intRecCount];
			intRecCount = 0;
			readFile.close();
			readFile = new BufferedReader(new FileReader("mytest.txt"));
	        while((strInput = readFile.readLine())!=null)
	        {     	
	        	
	        	for (int i = 0; i < 14; i++) 
	        	{
	        		strStudentMarks[intRecCount] = strInput; 
	        			        		
	        	}
	        	
	        	intRecCount++;
	        }
			
	        readFile.close();
	        intRecCount = 0;
	        
	        
	        readFile = new BufferedReader(new FileReader("myanswers.txt"));
	        
	        
			
			intRecCount = 0;
			readFile.close();
			String strMarks[] = new String [strStudentMarks.length];
			readFile= new BufferedReader(new FileReader("myanswers.txt"));
	            
	        String strAnsRecord =readFile.readLine();
	            
	        readFile.close();
	        
	        StringTokenizer strToken = new StringTokenizer(strAnsRecord, ",");
	        while(strToken.hasMoreElements())
	        {
		        for (int i = 0; i < 15; i++)
		        {              
		           strAnswers[i] = strToken.nextElement().toString();   
		           
		        }
		    }
	        int intGrades[] = new int[strStudentMarks.length];
	        int intTempGrade = 0;
	        String strTempName[] = new String[strStudentMarks.length];
	        
	        while(intRecCount != strStudentMarks.length)
	        {
	        	intTempGrade = 0;
	        	strTempName[intRecCount] = strStudentMarks[intRecCount].substring(strStudentMarks[intRecCount].indexOf(""), strStudentMarks[intRecCount].indexOf(","));
	        	strStudentMarks[intRecCount] = strStudentMarks[intRecCount].substring(strStudentMarks[intRecCount].indexOf(",")+1, strStudentMarks[intRecCount].length());
	        	strToken = new StringTokenizer(strStudentMarks[intRecCount], ",");
	        	
	        	
	        	
	        	for (int i = 0; i < 13; i++)
		        {              
	        		
	        		
	        		strMarks[i] = strToken.nextElement().toString();   
		        	
		        	
		        	
		        	if (strMarks[i].equals(strAnswers[i]))
		        	{
		        		
		        		intTempGrade +=1;
		        		
		        	}
		        	
		        }
	        	intGrades[intRecCount] = intTempGrade;
	        	
	        	intRecCount+=1;
	        	
	        	
	        }
	        
	        
	        
	        
	        
       
	       if (strUserInput.equals("A"))
	       {
	    	   int intCounter = 1;
	    	   for (int i = 0; i < strTempName.length; i++)
	    	   {
	    		   for (int j = 0; j<strTempName.length-1;j++)
	    		   {
	    			   if (intGrades[j]<intGrades[j+1])
	    			   {
	    				   int tempG = intGrades[j];
	    				   intGrades[j] = intGrades[j+1]; 
                                        intGrades[j+1] = tempG; 
                                        String tempN = strTempName[j];
                                        strTempName[j] = strTempName[j+1]; 
                                        strTempName[j+1] = tempN; 
	                       
	    				   
	    			   }
	    			   
	    		   }
	    		   
	    		   
	    	   }	   
	    		   float fltMarks = 0;
		    	   	for(int i = 0; i< strStudentMarks.length;i ++)
		    		  {
		    	   		fltMarks = intGrades[i]/15F*100;
		    	   		float fltRoundOff = Math.round(fltMarks*100)/100;
		    	   		System.out.println("Rank: " + (i+1) + ": " + strTempName[i] + " || " + intGrades[i] + " out of 14 right || GRADE: " + fltRoundOff);
		    		  }
	    	  
	       
	       
	       
	       }
	        	
	        	
	       	System.out.println("Press Enter to return to menu");
			strUserInput = myInput.readLine();
	        menuFunction();
	        
			
	
		
		
	}
	        

		
	
}

