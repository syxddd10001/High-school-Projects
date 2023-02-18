//Name: Syed Iltefat
//Date: 02/10/2019
//Title: Assignment 4
//Purpose: Create a program with menus in it that has all the application as a sub
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace A4_SyedIltefat
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Welcome!"); // Welcome message
            mainMethod(); // Main Menu method

        }

        
       


        public static void mainMethod() //main menu function
        {
            string strUser = "";
            while (strUser != "8") //menu 8 options
            {
                Console.Write("Press Enter to continue");
                Console.ReadKey();
                Console.Clear();
                mnuMenu();
                strUser = Console.ReadLine();
                if (strUser == "1") // first application
                {
                    Q1_SyedI();
                }
                else if (strUser == "2") // second application
                {
                    Q2_SyedI();
                }
                else if (strUser == "3") // third application
                {
                    
                    Q3_SyedI();
                }

                else if (strUser == "4") // fourth application
                {
                    Q4_SyedI();

                }

                else if (strUser == "5") // fifth application
                {
                    Q5_SyedI();
                }


                else if (strUser == "6") // sixth application
                {
                    Q6_SyedI();

                }

                else if (strUser == "7") // seventh application
                {

                    Q7_SyedI(); 

                }

                else if (strUser == "8") // exit if 8 is the input
                {
                    break;
                }

                else // User is not punished for typing wrong into the menu 
                {
                    Console.WriteLine("Please Enter a number from the menu");
                }
            }
            Console.WriteLine("Thank you, come again!");
            Console.ReadKey();

        }

        public static void mnuMenu() //main menu display
        {
            Console.WriteLine("Select an option: ");
            Console.WriteLine("1. Program that will print a sequence that goes up by 5");
            Console.WriteLine("2. Program that will print a sequence that goes down by 4");
            Console.WriteLine("3. Program that adds all numbers until the user types \"exit\"");
            Console.WriteLine("4. Program that adds all odd numbers between 1201 to 12501");
            Console.WriteLine("5. PrimeNumber Finder");
            Console.WriteLine("6. Power Table application");
            Console.WriteLine("7. Fibonacci numbers sequence");
            Console.WriteLine("8. Exit");
        }

        public static void Q1_SyedI() //application 1
        {
            //using for loop for incrimenting
            for (int i = -1000; i <= 100; i+=5)
            {
                Console.WriteLine(i);

            }

        }

        public static void Q2_SyedI() //application 2
        {
            //Using for loop for decrementing
            for (int i = 200; i >= -160; i -= 4)
            {
                Console.WriteLine(i);

            }

        }

        public static void Q3_SyedI() // application 3
        {
            int Result = 0;

            while (true) //infinite loop until the user inputs exit
            {
                Console.Write("Enter a number: ");
                string input = Console.ReadLine();

                if (input == "exit" || input == "EXIT")
                {
                    Console.WriteLine(Result); //if the user inputs "exit" or "EXIT", the result is displayed and the returned to the menu
                    break;

                }

                else
                {
                    Result += int.Parse(input); // if the user inputs a number
                }
            }


        }

       

        public static void Q4_SyedI() // application 4
        {
            int intResult1 = 0;
            for (int i = 1201; i <= 12501; i+=2) // adding all odd numbers from 1201 to 12501
            {
                intResult1 += i;
            }
            Console.WriteLine(intResult1);
        }


        public static void Q5_SyedI() // application 5
        {
            Console.Write("Enter a number: ");
            string strInput = Console.ReadLine();
            int intNumber = Int32.Parse(strInput);
            if (intNumber == 2 || intNumber == 3 || intNumber == 5)
            {
                Console.WriteLine("PRIME NUMBER"); // if its 2, 3, or 5, its a prime number by default

            }

            else if (intNumber % 2 == 0 || intNumber % 3 == 0 || intNumber % 5 == 0) // using modulo to check if its a prime number
            {

                Console.WriteLine("NOT A PRIME NUMBER");

            }
            else
            {
                Console.WriteLine("PRIME NUMBER"); // if the number is divisible by 2, 3 or 5, its a prime number 
            }

        }

        public static void Q6_SyedI() // application 6
        {
            Console.WriteLine("\n\n\n");
            int intNumberN = 5;

            for (int i = 1; i <= intNumberN; i++) // using nested for loops for powers and numbers
            {
                for (int p = 1; p <= 6; p++)
                {
                    double dblResult = Math.Pow(p,i); 
                    Console.WriteLine(dblResult);
                }
                Console.WriteLine("----------------"); //seperating parts of the Power Table

            }

        }

        public static void Q7_SyedI() //application 7 
        {
            //variable declaration
            int intNumA = 0;
            int intNumB = 1;
            int intNumC = 0;

            for (int i = 0; i <= 30; i++)
            {
                intNumC = intNumB + intNumA; // adding 2 numbers to get a result 
                Console.WriteLine(intNumC);
                intNumA = intNumB; // numA = numB 
                intNumB = intNumC; // numB = numC // numB somehow gets incrimented automatically
                

            }


        }

        






    }


        





    }

