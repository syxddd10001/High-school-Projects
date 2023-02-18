

package lockCombination;

import java.io.*;

public class mainClass {
	
	public static void main(String[] args) throws IOException
	{
		func();
		
		
	}
	
	public static void func() throws IOException
	{
		
		BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the 1st number: ");
		String strInp1 = myInput.readLine();
		int intInp1 = Integer.parseInt(strInp1);
		System.out.println("Enter the 2nd number: ");
		String strInp2 = myInput.readLine();
		int intInp2 = Integer.parseInt(strInp2);
		System.out.println("Enter the 3rd number: ");
		String strInp3 = myInput.readLine();
		int intInp3 = Integer.parseInt(strInp3);
		lockClass lock1 =  new lockClass(intInp1,intInp2,intInp3);        
		
		lock1.checkCombo(intInp1,intInp2,intInp3);
		while (lock1.locked==true)
		{
			System.out.println("Enter the 1st number: ");
			strInp1 = myInput.readLine();
			intInp1 = Integer.parseInt(strInp1);
			System.out.println("Enter the 2nd number: ");
			strInp2 = myInput.readLine();
			intInp2 = Integer.parseInt(strInp2);
			System.out.println("Enter the 3rd number: ");
			strInp3 = myInput.readLine();
			intInp3 = Integer.parseInt(strInp3);
			lock1.checkCombo(intInp1,intInp2,intInp3);
		}	
		
		
	}
	
	
	

}
