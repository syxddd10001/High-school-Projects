package com.mycompany.recursionmini_syediltefat;
import java.io.*;
import java.util.Scanner;

public class mainClass 
{

	static BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in));	
	static int y;
	static int tries;
	public static void main(String[] args) throws IOException
	{
			
		menu();

	}


	static void menu() throws IOException
	{   
		System.out.println("Choose one of the following options: ");
		System.out.println("A. Simplify numerators and denominators to the lowest form");
		System.out.println("B. Combination of objects");
		System.out.println("C. Pascal's Triangle ");
		System.out.println("D. Investment");
		System.out.println("E. Recursion Coin");
		String inputMenu = myInput.readLine();

		if (inputMenu.equals("A"))
		{

			System.out.println("Enter a numerator: ");
			String input1 = myInput.readLine();
			int parseInt1 = Integer.parseInt(input1);
			System.out.println("Enter a denominator: ");
			String input2 = myInput.readLine();
			int parseInt2 = Integer.parseInt(input2);
			simplify(parseInt1, parseInt2);
			System.out.println("press enter to continue: ");
			String inputM = myInput.readLine();
			menu();

		}



		else if (inputMenu.equals("B"))
		{

			objects();
			System.out.println("press enter to continue: ");
			String inputM = myInput.readLine();
			menu();

		}
		else if (inputMenu.equals("C"))
		{
			System.out.println("How many rows do you want: ");
			printPascal(Integer.parseInt(myInput.readLine()));
			System.out.println("press enter to continue: ");
			String inputM = myInput.readLine();
			menu();

		}

		else if (inputMenu.equals("D"))
		{
			System.out.println("Input your investment: ");
			double invest = Double.parseDouble(myInput.readLine());
			System.out.println("Input your rate (10, 20 etc): ");
			double rate = (Double.parseDouble(myInput.readLine()))/100;
	
			investmentCal(invest, rate, invest*2);
			System.out.println("press enter to continue: ");
			String inputM = myInput.readLine();
			menu();

		}
		
		else if (inputMenu.equals("E"))
		{
			coinTries();
			tries = 0;	
			System.out.println("press enter to continue: ");
			String inputM = myInput.readLine();
			menu();

		}
	}



	//Q1 
	static int commonFactor(int a, int b) //find the common factor between the two numbers
	{       
		int intR; // remainder
		if ((intR = a % b) == 0) //if the remainder is 0
		{
			return b;
		}
		else 
		{
			return commonFactor(b, intR);
		}
	}   
	public static void simplify(int a, int b)
	{       

		int result = commonFactor(a, b);
		int simple_num = a / result;
		int simple_den = b / result;
		System.out.println(simple_num);
		System.out.println(simple_den);
	}   
	//End
	//Question 2
	public static int factorial(int n)
	{
		if (n == 0)
		{
			return 1;
		}

		else
		{
			return n*factorial(n-1);

		}

	}

	public static int choose(int r)
	{
		if (r == 0)
		{
			return 1;
		}

		else
		{
			return r*factorial(r-1);

		}

	}


	public static int formulaQ2(int n, int r)
	{
		int intFomulaPart1 = choose(r)*factorial(n-r);
		int combo1 = factorial(n)/intFomulaPart1;

		return combo1;


	}

	public static void objects() throws IOException
	{

		System.out.println("Enter a number: ");
		String input1 = myInput.readLine();
		int parseInt1 = Integer.parseInt(input1);
		System.out.println("choose: ");
		String input2 = myInput.readLine();
		int parseInt2 = Integer.parseInt(input2);
		System.out.println(formulaQ2(parseInt1,parseInt2));

	}
	//end
	//Question 3

	static void printPascal(int n)
	{
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print(formulaQ2(i, j) + " ");
			}
			System.out.println();
		}
	}

	//end 
	//Question 4
	
	static double investment(double investm, double rate, double principal) 
	{
		y+=1;
		double total = investm + (investm*rate); 
	
		if (total >= principal) 
		{
			
			return y;
			
		}
		
		else 
		{
			
			return investment(total, rate, principal);
			
		}
	}

	
	
	
	static void investmentCal(double invest, double rate, double principal)  throws IOException
	{
		investment(invest, rate, principal);
		System.out.println("how would you want to pay, 2 times a year, 4 times a year etc... input 1/2/3/...");
		int comp_per = Integer.parseInt(myInput.readLine());
		System.out.println("It will take " +  y   + " years or " + y * comp_per  + " compounding periods to double the investment");
		
		y=0;
	}
	//end
	//Question 5

	

	static int RecursionCoin(int c)
	{
		tries+=1;
		if (c == 2)
		{
			return 1;
			
		}
		
		else
		{
			return RecursionCoin((int)(Math.random()*10+1));
		}
	}
	
	
	static void coinTries()
	{
		int rand = (int)(Math.random()*10+1);
		
		
		for (int i = 0; i < 4;i ++)
		{	
			RecursionCoin(rand);
			
		}
		
		System.out.println("It took " + tries + " tries to get 4 toonies");
		
		
	}
	
	


}




