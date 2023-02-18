package test102;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*Name: Syed Iltefat
 *Date: 25/09/2020 
 *Title: Assignment 1
 *Purpose: Menu driven applications
 */
public class TestAssign1 
{
    public static void main (String [] args) throws IOException
    {   
    //Main function
        menu();
    
    }
    
    public static void menu () throws IOException
    {
        BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in)); //for input
        
        //menu list
        System.out.println("Hello, and welcome to the Menu of my first program\nEnter the letter (case sensitive) of the program you want to launch");
        System.out.println("A. BINGO! app"); 
        System.out.println("B. Object height");   
        System.out.println("C: Start and End program");
        System.out.println("D: World Length");
        System.out.println("E: Quatratic Formula");
        System.out.println("F: Movie Tickets");
        System.out.println("G: Random Numbers");
        System.out.println("H: Dice Game");
        System.out.println("I: Math Game");
        System.out.println("J: Interest Calculator");
        System.out.println("Enter Any Key to Exit");
        
        String userInput = myInput.readLine(); //user inputs the program letter they want to launch
        
        if (userInput.equals("A")) // launches BINGO! 
        {
            BINGO();                                  
        }
        
        else if (userInput.equals("B"))
        {
            ObjectHeight();
        
        }
        
        else if (userInput.equals("C"))
        {
            StartEnd();
        
        }
        
        else if (userInput.equals("D"))
        {
            WordLength();
        
        }
        else if (userInput.equals("E"))
        {
            QuadraticEquation();
        
        }
        else if (userInput.equals("F"))
        {
            MovieTickets();
        
        }
        else if (userInput.equals("G"))
        {
            randomNumbers();
            
        }
        else if (userInput.equals("H"))
        {
            DiceGame();
            
        }
        
        else if (userInput.equals("I"))
        {
            MathGame();
        }        
        else if (userInput.equals("J"))
        {
            CalculateInterest();
        }
        else 
        {
        
        }
        
    }
    
   
    
    public static void BINGO() throws IOException
    {
        System.out.println("This is the BINGO! app");
        Random rand = new Random(); //for generating random numbers
       
        
        //arrays that store the randomly generated numbers
        int B [] = new int [6]; // each column will have 5 numbers
        int I [] = new int [6]; 
        int N [] = new int [6];
        int G [] = new int [6];
        int O [] = new int [6];
               
        //B
        int max = 16; //the maximum range
        int min = 1; //the minimum range
        int range = max - min + 1; //the range of the generated random number
  
        // using for loop to store the generated random number 5 times
        for (int i = 0; i < 5; i++) //
        { 
            int rand1 = (int)(Math.random() * range) + min; //generate random number
                
            B[i] = (int)rand1; //store the generated random number in the correct array
            
            
        }
                  
        //I
        min = 16; //the minimum range
        max = 31; //the maximum range 
        range = max - min + 1; //the range of the generated random number
  
        // using for loop to store the generated random number 5 times
        for (int i = 0; i < 5; i++) 
        { 
            int rand1 = (int)(Math.random() * range) + min; //generate random number
                
            I[i] = (int)rand1; //store the generated random number in the correct array
            
            
        } 
        
        
        //N
        min = 31; //the minimum range
        max = 46; //the maximum range
        range = max - min + 1; //the range of the generated random number
  
        // using for loop to store the generated random number 5 times
        for (int i = 0; i < 5; i++) 
        { 
            int rand1 = (int)(Math.random() * range) + min; //generate random number
                
            N[i] = (int)rand1; //store the generated random number in the correct array
            
            
        } 
        
        //G
        min = 46; //the minimum range
        max = 61; //the maximum range
        range = max - min + 1; //the range of the generated random number
  
        // using for loop to store the generated random number 5 times
        for (int i = 0; i < 5; i++) 
        { 
            int rand1 = (int)(Math.random() * range) + min; //generate random number
                
            G[i] = (int)rand1; //store the generated random number in the correct array
            
            
        } 
        
        //O
        min = 61; //the minimum range
        max = 75; //the maximum range
        range = max - min + 1; //the range of the generated random number
  
        // using for loop to store the generated random number 5 times
        for (int i = 0; i < 5; i++) 
        { 
            int rand1 = (int)(Math.random() * range) + min; //generate random number
                
            O[i] = (int)rand1; //store the generated random number in the correct array
            
            
        } 
        
        System.out.println("B"+"\t" + "I"+"\t" + "N"+"\t"+ "G"+"\t" + "O");
        
        int counter = 0;
        while (counter != 5) //output 5 rows 
        {
            if (counter == 0) // first row
            {
                System.out.println(B[counter] + "\t" + I[counter] + "\t" + N[counter] + "\t"+ G[counter] + "\t"+ O[counter]);                
                //output the arrays in the correct order    
            }   
            else if (counter == 1) // second row
            {
                System.out.println(B[counter] + "\t" + I[counter] + "\t" + N[counter] + "\t"+ G[counter] + "\t"+ O[counter]);                
            //output the arrays in the correct order
            }           
            else if (counter == 2)// third row
            {
                System.out.println(B[counter] + "\t" + I[counter] + "\t" + " " + "\t"+ G[counter] + "\t"+ O[counter]);                
            //output the arrays in the correct order
            }       
            else if (counter == 3) // forth row
            {
                System.out.println(B[counter] + "\t" + I[counter] + "\t" + N[counter] + "\t"+ G[counter] + "\t"+ O[counter]);                
             //output the arrays in the correct order   
            }
            else if (counter == 4)// fifth row
            {
                System.out.println(B[counter] + "\t" + I[counter] + "\t" + N[counter] + "\t"+ G[counter] + "\t"+ O[counter]);                
            //output the arrays in the correct order
            }
            else
            {
                break;  //output 5 rows then break the loop
            }
            counter+=1;
        }

        BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in)); //for input
        System.out.println("Press enter to continue");//for making user experience better
        String strUserInput = myInput.readLine();
        menu(); // returns to the main menu after user uses the application
    }
    
    public static void ObjectHeight() throws IOException
    {
        BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in)); //for input
        
        double dblHeight; //variable that stores height
        System.out.println("This application calculates the height of an object");
        System.out.println("Input time (must be less than 4.5 seconds)");      
        String userInput = myInput.readLine();   // user input    
        double dblTime = Double.parseDouble(userInput);
        dblHeight = 100-(4.9*(Math.pow(dblTime, 2))); //the formula
        System.out.println("The height of the object is: "+ dblHeight + " m"); //output
        
        
        System.out.println("Press enter to continue");
        String strUserInput = myInput.readLine();
        menu();
    
    }
    
    public static void StartEnd() throws IOException
    {
        BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in)); //for input
        System.out.println("This program writes all int number between two numbers entered by the user");
             
               
        
        int intStart; //variable that stores the start number
        int intEnd; //variable that stores the end number
        System.out.println("Enter Start: ");
        String userInput = myInput.readLine(); // input
        int intInput = Integer.parseInt(userInput);//converting the input(string) to a number
        intStart = intInput;
        
        System.out.println("Enter End: ");
        userInput = myInput.readLine(); // input
        intInput = Integer.parseInt(userInput); //converting the input(string) to a number
        intEnd = intInput+1;
        
        
        for (int i = intStart; i<intEnd;i++) // using for loop to output all the numbers from 'start' to 'end'
        {
            System.out.println(i);
        
        }
        
        System.out.println("Press enter to continue");
        String strUserInput = myInput.readLine();
        menu();
    
    }
    public static void WordLength() throws IOException
    {
        BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in)); //for input              
        System.out.println("This program outputs the word (input by the user)as many times as its number of characters");
        System.out.println("Enter a word: "); // input
        int intWordLength; // variable that stores the number of characters in the input string
        String userInput = myInput.readLine();               
        intWordLength = userInput.length();
        System.out.println("------"); //so that the input and output don't mix
        for (int i=0;i<intWordLength;i++)
        {
            System.out.println(userInput);
        }
        
        
        System.out.println("Press enter to continue");
        String strUserInput = myInput.readLine();
        menu();
    
    }
    
    public static void QuadraticEquation() throws IOException
    {
        BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in)); //for input
        
        System.out.println("This application calculates using the Quadractic Equation");     
        System.out.println("Enter a:"); // a value
        String userInput = myInput.readLine();       
        double dblA = Double.parseDouble(userInput); //variable that stores the a value as a double 
        System.out.println("Enter b:"); // b value
        userInput = myInput.readLine();
        double dblB = Double.parseDouble(userInput);  //variable that stores the b value as a double 
        System.out.println("Enter c:"); // c value
        userInput = myInput.readLine();  
        double dblC = Double.parseDouble(userInput); //variable that stores the c value as a double 
        
        double sqrForm= dblB*dblB-4*dblA*dblC; // the sqr root part of the formula
        
        double quadraticFormulaP = (-dblB + Math.sqrt(sqrForm)) /(2*dblA); // the quadratic formula with + 
        double quadraticFormulaM = (-dblB - Math.sqrt(sqrForm)) /(2*dblA); // the quadratic formula with -
        System.out.println("the roots are:" + quadraticFormulaP + " and " + quadraticFormulaM); //ouput the roots
        
        System.out.println("Press enter to continue");
        String strUserInput = myInput.readLine();
      
        menu();
    
    }
    
    public static void MovieTickets() throws IOException
    {
        BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in)); //for input              
        System.out.println("This program calculates the price of tickets based on age");
        System.out.println("Enter age of buyer(enter 999 exit): ");
        float fltPrice = 0; //vairable that stores the price                   
        float fltInputAge = 0; //vairable that stores the Age 
        
        while (fltInputAge != 999 )//unless the input is not 999 run the loop
        {
            String userInput = myInput.readLine();               
            fltInputAge = Float.parseFloat(userInput); 
            if (fltInputAge == 999) // break the loop and show the full price if the input is 999 
            {
                System.out.println(fltPrice);
                break;
                
            }
            
            else if (fltInputAge < 12) //price based on age
            {
                fltPrice += 11.00; //addsthe current price to the previous price until the user exits\inputs 999
            
            }
            else if (fltInputAge > 12 && fltInputAge < 65) //price based on age
            {
                fltPrice += 17.00; //adds the current price to the previous price until the user exits\inputs 999
                // 
            }
            else if (fltInputAge > 65) //price based on age
            {
                fltPrice += 8.00; //adds the current price to the previous price until the user exits\inputs 999
            
            }
            else if (fltInputAge > 120 || fltInputAge < 0) // if the input is more than 120 or less than 0
            {
                System.out.println("Invalid input");
            
            }
            
            else //anything else breaks the loop
            {
                break;
            }
            
            
        
        }
        
        System.out.println("Press enter to continue");
        String strUserInput = myInput.readLine();
        menu();
    
    }
    
    public static void randomNumbers() throws IOException
    {
        BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in)); //for input              
        System.out.println("This program generates random numbers");       
        int intRandomN = 0; //variable that stores the integer random number                   
        float fltRandomN = 0; //variable that stores the decimal/real random number  
        System.out.println("1. Random Integer number"); // shows a menu list 
        System.out.println("2. Random Real number");
        System.out.println("3. Return to main menu");
        String strUserInput = myInput.readLine();
        
        
        if (strUserInput.equals("1"))
        {                
            System.out.println("1. Numbers from 1 to 10");// shows another menu list
            System.out.println("2. Numbers from 20 to 30");
            System.out.println("3. Return to Menu");
            String strUserInput1 = myInput.readLine();
            
            if (strUserInput1.equals("1"))
            {
                int max = 11; //the maximum range
                int min = 1; //the minimum range   
                int range = max - min + 1; //the range of the generated random number  
                // using for loop to store the generated random number 5 times
                for (int i = 0; i < 5; i++) //
                { 
                    intRandomN = (int)(Math.random() * range) + min; //generate random number                       
                    System.out.println(intRandomN);
                    

                }
                randomNumbers();
            }
            else if (strUserInput1.equals("2"))
            {
                int max = 31; //the maximum range
                int min = 20; //the minimum range   
                int range = max - min+1; //the range of the generated random number
                for (int i = 0; i < 5; i++) //
                { 
                    intRandomN = (int)(Math.random() * range) + min; //generate random number                       
                    System.out.println(intRandomN);  
                      
                }
                randomNumbers();
            }
            else if (strUserInput1.equals("1"))
            {
                randomNumbers();
            }
            
        }
        
        else if (strUserInput.equals("2"))
        {
            int max = 11; //the maximum range
            int min = 1; //the minimum range   
            int range = max - min+1; //the range of the generated random number
            System.out.println("1. Numbers from 1 to 10");
            System.out.println("2. Numbers from 20 to 30");
            System.out.println("3. Return to Menu");
            String strUserInput1 = myInput.readLine();
            
            if (strUserInput1.equals("1"))
            {
                for (int i = 0; i < 5; i++) //
                { 
                    fltRandomN = (float)(Math.random() * range) + min; //generatint the random number                       
                    System.out.println(Math.round(fltRandomN * 100.0) / 100.0);
                    

                }
            }
            else if (strUserInput1.equals("2"))
            {
                max = 31; //the maximum range
                min = 20; //the minimum range   
                range = max - min+1; //the range of the generated random number
                for (int i = 0; i < 5; i++) //
                { 
                    fltRandomN = (float)(Math.random() * range) + min; //generate random number                       
                    System.out.println(Math.round(fltRandomN * 100.0) / 100.0); //rounding to 2 decimal places
                    fltRandomN = 0;    
                }
                randomNumbers();
            }
            else if (strUserInput1.equals("3"))
            {
                randomNumbers();
            }
        
        
        
        
        }
        else if (strUserInput.equals("3"))
        {           
        
        }
        
        System.out.println("Press enter to continue");
        strUserInput = myInput.readLine();
        menu();
    }
    
    public static void DiceGame() throws IOException
    {
        BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in)); //for input              
        System.out.println("This program rolls a dice until it reaches the number put by the user");
        System.out.println("Enter a number from 1 to 6: ");
        String strUserInput = myInput.readLine();
        int intUserInput = Integer.parseInt(strUserInput); 
        int numberX = 0;
        int intCounter = 0; //'counter' variable to keep track of the number of times the dice is rolled
        if (intUserInput < 1 || intUserInput > 6)
        {
            System.out.println("Pls input a valid number"); // if the input is not 1 to 6
        
        }
        else
        {
            while (numberX != intUserInput) //run the loop until the user input number is generated
            {
                int min = 1; //the minimum range
                int max = 7; //the maximum range
                int range = max - min + 1; //the range of the generated random number
        
                int rand1 = (int)(Math.random() * range) + min;
                numberX = rand1;
                
                if (numberX == intUserInput)  
                {
                    System.out.println("Roll " + intCounter + " is " + numberX);
                    System.out.println("It took " + intCounter + " times to roll " + intUserInput);
                    System.out.println("Would you like to continue? y or n?:");
                    strUserInput = myInput.readLine();
                    if (strUserInput.equals("y"))
                    {
                        DiceGame();
                    }
                    
                    else if (strUserInput.equals("n"))
                    {
                        break;
                    }
                    break;
                }
            
                else
                {
                    System.out.println("roll " + intCounter + " is " + numberX);
                    intCounter += 1;   
                 
                }
            }
                   
        
        }      
    menu();
    
    }

    public static void MathGame() throws IOException
    {
        BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in)); //for input              
        System.out.println("This is a simple math quiz game. It randomly generates 2 numbers and you have to input the correct answer. You get points for answering the correct answer");
        System.out.println("3 wrong answers and you're out! Enter 999 any time to exit");
        int max = 31; //the maximum range
        int min = 1; //the minimum range
        int range = max - min + 1; //the range of the generated random number
        int intPoints = 0;
        int intStrikes = 0;
        while (true)
        {
            int intRand1 = (int)(Math.random() * range) + min;
            int intRand2 = (int)(Math.random() * range) + min;
            int intSum = intRand1 + intRand2;
            System.out.println(intRand1 + " + " + intRand2 + " = \b");
            String strUserInput = myInput.readLine();
            int intUserInput = Integer.parseInt(strUserInput);
            if (intUserInput == 999 || intStrikes == 3)
            {
                intStrikes = 0;
                System.out.println("You're out! Points earned: " + intPoints);
                break;
            } 
            else if (intUserInput == intSum)
            {
                intPoints+=1;
                intStrikes = 0;

            }
            else if (intUserInput != intSum)        
            {
                intStrikes += 1;
                System.out.println("Wrong answer try harder! ");                
                System.out.println(intRand1 + " + " + intRand2 + " = \b");
                strUserInput = myInput.readLine();
                intUserInput = Integer.parseInt(strUserInput);
                if (intUserInput != intSum)        
                {
                    intStrikes += 1;
                    System.out.println("Wrong answer try harder! ");                
                    System.out.println(intRand1 + " + " + intRand2 + " = \b");
                    strUserInput = myInput.readLine();
                    intUserInput = Integer.parseInt(strUserInput);
                    
                    if (intUserInput != intSum)        
                    {
                        intStrikes = 0;
                        System.out.println("You're out! Points earned: " + intPoints);
                        break;
                    }
                    
                    else
                    {
                        intStrikes = 0;
                    }
                }
                
                else
                {
                    intStrikes = 0;
                }
            }
                  
        
        }
        
        
        System.out.println("Would you like to continue? y or n: ");
        String strUserInput = myInput.readLine();
        if (strUserInput.equals("y"))
        {
            MathGame();
        }
        
        else
        {
        
        }
        menu();
    }

    public static void CalculateInterest() throws IOException
    {
        BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in)); //for input              
        System.out.println("This program calculates the interest by taking the Deposit amount, the Rate and the number of Years");
        System.out.println("Enter principal amount: ");        
        String strUserInput = myInput.readLine();
        double dblPrincInp = Double.parseDouble(strUserInput);
        System.out.println("Enter Rate in % (but dont enter '%'):");        
        strUserInput = myInput.readLine();
        double dblRateInp = Double.parseDouble(strUserInput);
        System.out.println("Enter number of years: ");        
        strUserInput = myInput.readLine();
        int intPYrs = Integer.parseInt(strUserInput);
        double dblPrincipal = dblPrincInp;
        double dblRate = dblRateInp;
        int intYears = intPYrs;
        
        double dblInterest = dblPrincipal*Math.pow(1 + (dblRate/100),intYears);//the forcmula to calculate interest
        System.out.println("Your Interest for " + dblPrincipal + " at " + dblRate +" % rate" + " in " + intYears + " years is " + Math.round(dblInterest * 100.0) / 100.0);  
        System.out.println("Would you like to continue? y or n: ");
        strUserInput = myInput.readLine();
        if (strUserInput.equals("y"))
        {
            CalculateInterest();
        }
        
        else
        {
        
        }
        
        menu();
    }
    
    
    
    
    
}



