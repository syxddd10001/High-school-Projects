package test102;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test
{

	public static void main (String[] args) throws IOException
	{
		BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in));	
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows to print: ");
	        int rows = scanner.nextInt();
	        System.out.println("Pascal Triangle:");
	        
	        scanner.close();
		function();
		
	}
	
	static void function() throws IOException
	{
		BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in));
		BufferedReader readFile = new BufferedReader(new FileReader("mytest.txt"));
		String strInput="";
		
        int intRecCount = 0;
        
        String strWords[]; 
         
       		
		
        while((strInput = readFile.readLine())!=null)
        {
        	
        	
        	intRecCount++;
    		
        }
		strWords = new String[intRecCount];
		intRecCount = 0;
		readFile.close();
		readFile = new BufferedReader(new FileReader("mytest.txt"));
        while((strInput = readFile.readLine())!=null)
        {     	
        	strWords[intRecCount] = strInput;     	
        	System.out.println(strWords[intRecCount]);    		
        	intRecCount++;
        }
        intRecCount = 0;
        while(intRecCount != strWords.length)
        {
        	strWords[intRecCount] = strWords[intRecCount].toUpperCase();
        	
        	
        }
		

       

        
        
        
        
        
        
        
		
		
		
		
	}
	
	
	
	
}