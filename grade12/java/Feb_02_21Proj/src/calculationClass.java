import java.io.*;
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

public class calculationClass {
	
	private static String [][] identity = 
		{
			{"Stephanie", "26", "East Bay",},
			{"Greg", "19" , "G Cres."},
			{"Ahmed","20", "P Ave."},
			{"Alex","29", "G Street"}
		};
	
		
		
	
	
	public void readInfo()
	{
		
		for (int i = 0; i< identity.length; i++)
		{
			for (int j = 0; j< identity[i].length;j++)
			{
				
				System.out.print(identity[i][j]);
				System.out.print(", ");
				
			}
			
			System.out.println();
		}
		
		
	}
	
	
}
