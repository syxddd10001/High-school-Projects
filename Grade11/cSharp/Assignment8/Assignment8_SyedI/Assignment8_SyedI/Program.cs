/*
Name: Syed Iltefat
Date: 28/11/2019
Purpose: Applications with functions
Title: Assignment 8 

 
 
 */ 
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment8_SyedI
{
    class Program
    {
        static void Main(string[] args)
        {

            menu();
            Console.WriteLine("Press Any key to exit");

        }

        // menu methods

        public static void menu() // menu
        {
            while (true)
            {
                Console.WriteLine("Press any key to continue");
                Console.ReadKey();
                menuDisplay();
                Console.WriteLine("Type the number you want to access: ");
                string input1 = Console.ReadLine();
                // menu input and output
                if (input1 == "1")
                {
                    Q1_SyedI();

                }

                else if (input1 == "2")
                {
                    Q2_SyedI();

                }


                else if (input1 == "3")
                {
                    Q3_SyedI();

                }

                else if (input1 == "4")
                {
                    Q4_SyedI();

                }

                else if (input1 == "5")
                {
                    Q5_SyedI();

                }

                else if (input1 == "6")
                {
                    Q6_SyedI();

                }

                else if (input1 == "7")
                {
                    Q7_SyedI();

                }

                else if (input1 == "8")
                {
                    Q8_SyedI();

                }
                else if (input1 == "9")
                {
                    Q9_SyedI();

                }

                else if (input1 == "10")
                {
                    break;

                }

                else
                {
                    Console.WriteLine("Please input from the menu");

                }

            }
        }

        public static void menuDisplay()
        {
            //the user types in any one of the numbers 
            Console.WriteLine("1. Check if a number is a perfect integer or not");
            Console.WriteLine("2. Flip a coin as many times as you want and know the outcome");
            Console.WriteLine("3. Roll a dice as many times as you want and know the outcome");
            Console.WriteLine("4. Find the midpoint of two points");
            Console.WriteLine("5. Find the maximum and minimum point of x");
            Console.WriteLine("6. Total Dollar amount");
            Console.WriteLine("7. Draw a rectangle with a height and length");
            Console.WriteLine("8. Draw a upside down Triangle");
            Console.WriteLine("9. Encrypt a number");
            Console.WriteLine("10.Exit");

        }






        // all main methods

        public static void Q1_SyedI()
        {
            
            try
            {
                Console.WriteLine("Enter A Number: ");
                string perfectint = IsPerfect(Int32.Parse(Console.ReadLine())); // calling the IsPerfect function in this method 
                Console.WriteLine(perfectint); // outputting the result
            }

            catch (Exception) // catching any input errors i.e strings/doubles
            {
                Console.WriteLine("Please enter a valid number");
                Q1_SyedI();
            }
        }


        public static void Q2_SyedI()
        {
            try
            {
                Console.WriteLine("How many times do you want to flip the coin?");
                coinFlip(Int32.Parse(Console.ReadLine())); //calling the coinFlip(parameters) function 
                
            }
            catch (Exception)
            {
                Console.WriteLine("Please Enter a valid number"); // looking for bad input
                Q2_SyedI();
            }

        }

        public static void Q3_SyedI()
        {
            try
            {
                Console.WriteLine("How many times do you want to roll the dice");
                rollDice(Int32.Parse(Console.ReadLine()));
            }
            catch (Exception)
            {
                Console.WriteLine("Invalid input");
                Console.WriteLine("How many times do you want to roll the dice");
                Q3_SyedI();
            }

        }


        public static void Q4_SyedI()
        {
            try
            {

                Console.WriteLine("Enter the two points to find the mid point: ");
                double average = midPoint(Int32.Parse(Console.ReadLine()), Int32.Parse(Console.ReadLine()));
                Console.WriteLine("Midpoint is: " + Math.Round(average, 2));
                
            }

            catch (Exception)
            {
                Console.WriteLine("Enter something valid");
                Q4_SyedI();
            }

        }

        public static void Q5_SyedI()
        {
            try
            {
                Console.WriteLine("Enter coefficients A, B and C");
                parabolaFindX(double.Parse(Console.ReadLine()), double.Parse(Console.ReadLine()), double.Parse(Console.ReadLine()));
            }
            catch (Exception)
            {
                Console.WriteLine("Invalid Input");
                Q5_SyedI();

            }
        }


        public static void Q6_SyedI()
        {
            try
            {
                Console.WriteLine("Enter number of quarters, dimes, nickel and pennies respectively: ");
                string coinValue = GetDollarAmount(Int32.Parse(Console.ReadLine()), Int32.Parse(Console.ReadLine()), Int32.Parse(Console.ReadLine()), Int32.Parse(Console.ReadLine()));
                Console.WriteLine(coinValue);
            }

            catch (Exception)
            {
                Console.WriteLine("invalid input");
                Q6_SyedI();

            }

        }

        public static void Q7_SyedI()
        {
            try
            {
                Console.WriteLine("Enter height and length: ");
                rectangleDrawing(Int32.Parse(Console.ReadLine()), Int32.Parse(Console.ReadLine()));
            }

            catch (Exception)
            {
                Console.WriteLine("Invalid Input");
                Q7_SyedI();

            }

        }


        public static void Q8_SyedI()
        {
            try
            {
                Console.WriteLine("Enter height: ");
                triangleDrawing(Int32.Parse(Console.ReadLine()));
            }
            catch (Exception)
            {
                Console.WriteLine("Invalid Input");
                Q8_SyedI();

            }

        }

        public static void Q9_SyedI()
        {
            try
            {
                Console.WriteLine("Enter a 4 digit number to encrypt: ");
                string[] encrypt = encryptionOfData(Console.ReadLine());
                for (int i = 0; i < encrypt.Length; i++)
                {
                    Console.Write(encrypt[i]);
                }
                Console.WriteLine();
            }
            catch (Exception)
            {
                Console.WriteLine("Invalid Input");
                Q9_SyedI();

            }

        }



        // all functions

        static string IsPerfect(int intInput)
        {
            int sum = 0;
            for (int i = 1; i < intInput; i++)
            {
                if (intInput % i == 0)
                {
                    sum += i;
                }
               
            }

            if (sum == intInput)
            {
                return (intInput + " is a perfect integer");
            }

            else
            {
                return (intInput + " is not a perfect integer");
            }
            
        }

        static bool coinFlip(int intMultiplier)
        {
            
            bool boolHeadsOrTails = true;
            int numberHeads = 0;
            int numberTails = 0;
            Random rnd = new Random();
            for (int i = 0; i < intMultiplier; i++)
            {

                int HeadsOrTails = rnd.Next(1, 3); // randoming heads/tails based on the numbers 1 and 2
                if (HeadsOrTails == 1)
                {
                    boolHeadsOrTails = true;
                    numberHeads += 1; // acumulating heads if the number is 1
                    
                }

                else
                {
                    boolHeadsOrTails = false;
                    numberTails += 1; //accumulating tales if the number is 2
                    
                }
                
            }

            Console.WriteLine("Number of Heads: {0}\nNumber of Tails {1}", numberHeads, numberTails); // returning the number of accumulated heads or tales
           
            return boolHeadsOrTails;
            


        }






        static void rollDice(int intMultiplier)
        {
           
            int number1 = 0, number2 = 0, number3 = 0, number4 = 0, number5 = 0, number6 = 0;
            Random rnd = new Random();

            for (int i = 0; i <= intMultiplier; i++)
            {
                int randomizeDice = rnd.Next(1,7); //randoming the number from dice

                if (randomizeDice == 1)
                {
                    number1 += 1; // accumulation of 1 on the dice

                }

                else if (randomizeDice == 2)
                {
                    number2 += 1; // accumulation of 2 on the dice

                }

                else if (randomizeDice == 3)
                {
                    number3 += 1; // accumulation of 3 on the dice

                }
                else if (randomizeDice == 4)
                {
                    number4 += 1; // accumulation of 4 on the dice

                }
                else if (randomizeDice == 5)
                {
                    number5 += 1; // accumulation of 5 on the dice

                }
                else if (randomizeDice == 6)
                {
                    number6 += 1; // accumulation of 6 on the dice

                }



            }


            Console.WriteLine("1: " + number1 + "\n" +  "2: " + number2 + "\n" + "3: " + number3 + "\n" + "4: " + number4 + "\n" + "5: " + number5 + "\n" + "6: " + number6 + "\n");
            
        }


        static double midPoint(double point1, double point2)
        {
            double average = (point1 + point2) / 2; // finding the average
            return average; // returning the average 
        }

        static double parabolaFindX(double dblCoefficientA, double dblCoefficientB, double dblCoefficientC)
        {
           
            double root1 = Math.Sqrt(dblCoefficientB * dblCoefficientB - (4 * dblCoefficientA * dblCoefficientC)); // getting the root first

            if (root1 >= 0) // if the root is more than zero, we proceed with the formula
            {
                double minParabolaX = (-dblCoefficientB + root1) / 2 * dblCoefficientA;
                double maxParabolaX = (-dblCoefficientB - root1) / 2 * dblCoefficientA;
                Console.WriteLine("Minimum X: {0} \nMaximum X: {1}",Math.Round(minParabolaX, 3), Math.Round(maxParabolaX, 3));
            }

            else // if the root is less than zero , the formula won't work
            {
                Console.WriteLine("No existing roots");
            }
            
            
            
            return 0; // returning 0 bcoz there are two value (x1 and x2) to return, which cannot be done
        }


        static string GetDollarAmount(int quarters, int dimes, int pennies, int nickels)
        {
            

            double dblTotal = (25 * quarters) + (10 * dimes) + (5 * nickels) + (1 * pennies); // adding all the coins
            double dblTotalinDollars = dblTotal / 100; // dividing the added coins by 100 to get the dollar value
            string stramount = "$" + dblTotalinDollars + ""; // converting the dollar value to a tring
            return stramount; // returning the amount 

        }


        static void rectangleDrawing(int height, int length)
        {
            for (int i = 1; i <= height; i++) // reading the height/ accumulator for height
            {
                Console.Write("|"); // drawing the height at the beginning of the length 
                for (int j = 1; j <= length; j++) // if the accumlated height is 1 or is equal to the heigth itself, draw the side length 
                {                  
                    if (i == 1)
                    {
                        Console.Write("-"); // drawing the side length
                    }
                    else if (i == height)
                    {
                        Console.Write("-"); // drawing the side length
                    }
                    else
                    {
                        Console.Write(" "); // drawing nothing when its not at the end/start of the height 
                    }
                }                            
                Console.WriteLine("|");  // drawing the height at the end of the length                    
            }

            Console.WriteLine();
        }

        static void triangleDrawing(int height)
        {
            for (int i = height; i > 0; i--)
            {
                for (int j = 1; j <= height-i; j++)
                {
                    Console.Write(" "); // getting the spaces out first
                }

                for (int j = 1; j <= i*2-1; j++)
                {

                    Console.Write("*"); // drawing the triangle 
                    

                }
                Console.WriteLine("");
                
                
               
            }
            Console.WriteLine("");
            
        }




        static string[] encryptionOfData(string strNumber)
        {
            string[] arrtemp = new string[strNumber.Length]; // temporary array
            string[] mainArray = new string[arrtemp.Length]; // main array to store the final number
             
            for (int i = 0; i < strNumber.Length; i++)
            {              
                
                string subString = strNumber.Substring(i, 1); // reading the individual number
                int number = Int32.Parse(subString); //converting that string number to an int 
                int complexNumber = (number + 7) % 10;  // using the formula to convert that number to a complex (encrypted) number                 
                arrtemp[i] = complexNumber + ""; // storing that encrypted number to the temporary array 
                
                
            }
            
            // shuffling the numbers 
            // storing the numbers in the main array 
            for (int i = 0; i < 2; i++)
            {
                string temporary = arrtemp[i]; // storing the first read number to a temporray array 
                mainArray[i] = arrtemp[i+2]; // the 1st/2nd number is the 3rd number and the 1st/2nd number is stored in the temporary variable 
                mainArray[i + 2] = temporary; // replaced the 3rd/4th number with the 1st number

                

            }

            
            return mainArray; // returning the mainArray




        }


    }
}


