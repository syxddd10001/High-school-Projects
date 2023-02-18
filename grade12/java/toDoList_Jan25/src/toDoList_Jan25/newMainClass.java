package toDoList_Jan25;
import java.io.*; 
import java.lang.Math;
import java.util.Random;
import java.util.Scanner;


	
public class newMainClass {
	static BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String [] args) throws IOException
	{
		Random rand = new Random();
		
		/*
		 * System.out.println("input some letters: "); String input1 =
		 * myInput.readLine();
		 */
		
		schedule();
	
		
		
	}
	
	static boolean inOrder(String letter) throws IOException
	{
		
		char char_array[] = new char[letter.length()];
		int int_array[] = new int[letter.length()];
		for (int i = 0; i< int_array.length;i++)
		{
			char_array[i] = letter.charAt(i);
			int_array[i] = (int) char_array[i];
			
		}
		
		boolean stat = true;
		
		for (int i = 0; i < int_array.length-1; i++)
		{
			if (int_array[i+1] == int_array[i]+1)
			{
				stat = true;
				
			}
			
			else
			{
				stat = false;
				break;
			}
		}
		
		if (stat == true)
		{
			System.out.println("Letters are in order");
			
		}
		
		else 
		{
			System.out.println("Letters are NOT in order");
			
		}
		return stat;
			
	}
	
	// //
	///
	///
	///
	//		SCHEDULE
	//
	//
	//
	//
	public static void createFile() throws IOException
	{
		try
		{
			File file1 =new File("schedule.txt");
			if (file1.createNewFile())
			{
				System.out.println("File created");
				
			}
			
			else 
			{
				System.out.println("File already exists");
						
			}
			
			
			
			
		}
		catch (IOException e)
		{
			System.out.println("Something bad happened...");
			e.printStackTrace();
		}	
		
	}
	
	
	public static void writeSchedule() throws IOException
	{
		try
		{
			
			System.out.println("Enter your schedule below, press only enter to exit");
			String inputWrite = "x";
			PrintWriter writeTo = new PrintWriter(new FileWriter("schedule.txt", true));
			while(!inputWrite.equals(""))
			{
				inputWrite = myInput.readLine();
				writeTo.write("\n");
				writeTo.write(inputWrite);
				
			}
				
			
			writeTo.write(" ");
			
			writeTo.close();
		}
		catch (IOException e)	
		{
			System.out.println("Snap! Your data wasn't found.");
			e.printStackTrace();
			
		}		
		
	}
	
	
	public static void readSchedule(String x)
	{
		if (x == "east")
		{
			
			try
			{
				File myFile = new File("schedule.txt");
				Scanner myReader = new Scanner(myFile);
				
				while(myReader.hasNextLine())
				{
					String data = myReader.nextLine();
					System.out.println(data);
			
				
				}
				myReader.close();
				}
			
			catch (IOException e)
			{
				System.out.println("Drat! Something bad happened...");
				e.printStackTrace();;
			}
			
			
			
			
		}
		
		
	}
	
	
	
	public static void deleteFile()
	{
		File myFile = new File("schedule.txt"); 
	    if (myFile.delete()) { 
	      System.out.println("Deleted file: " + myFile.getName());
	    } 
	    else {
	      System.out.println("Failed to delete the file.");
	    } 
		
		
	}
	
	
	public static void schedule() throws IOException
	{
		// createFile();
		
		createFile();
			
		
		
		System.out.println("What do you wanna do with your schedule?");
		System.out.println("1. Check your schedule");
		System.out.println("2. Add to your schedule");
		System.out.println("3. Exit");		
		String input0 = myInput.readLine();
		
		while (true)
		{
			
			if(input0.equals("1"))
			{
				readSchedule("east");
				System.out.println("Press Enter to Continue");
				input0 = myInput.readLine();
				schedule();
			}
			
			if(input0.equals("2"))
			{
				writeSchedule();
				schedule();
			}
			
			else if (input0.equals("del"))
			{
				deleteFile();
				schedule();
			}
			
			else if (input0.equals("3"))
			{
				System.exit(0);
				
				
			}
			
			else
			{
				schedule();
				
			}					
		}		
	}
	
	
	
	
	
	
	
	

}
