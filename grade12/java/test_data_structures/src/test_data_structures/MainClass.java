package test_data_structures;
import java.awt.*;
import java.util.*;
import java.io.*;

public class MainClass
{
	public static void main(String[]args)
	{
		
		
		function();
		
	}
	static int count = 0;
	
	static void function()
	{
		ArrayList <String> names = new ArrayList<String>();
		names.add("Pete");
		names.add("Rick");
		names.add("Harry");
		names.add("Ben");
		names.add("Gwen");
		System.out.println("unsorted: "+ names);
		Collections.sort(names);
		System.out.println("sorted: "+ names);
		
		
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		 while (count < 52)
	        {
	            int rand = (int)(Math.random()*10+1);
	            numbers.add(rand);
	            
	            count+=1;
	            
	        }    
		
		System.out.println("unsorted: "+ numbers);
		Collections.shuffle(numbers);
		System.out.println("shuffled: "+ numbers);
		
		
	}
	
	
	
}
