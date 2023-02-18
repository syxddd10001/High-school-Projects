//Name: Syed Iltefat
//Date: 10/10/2019
//Title: Assignment 5
//Purpose: Make an application a menu that has sub applications
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace A5_SyedI
{
    class Program
    {
        static void Main(string[] args)
        {
            //start
            backColor(); // changes the background color
            mnuMenu(); //menu application
            
        }

        //added methods and menus

        public static void backColor() // cool side application that changes the background color
        {
            Console.WriteLine("Choose background color: \n1. White\n2. Black");
            string mainInput = Console.ReadLine(); 
            if (mainInput == "1")
            {
                Console.BackgroundColor = ConsoleColor.White;
                Console.ForegroundColor = ConsoleColor.Black;

            }

            else
            {
                Console.WriteLine("Set to default background color: Black.");
            }

        }

        public static void mnuMenu() // menu method
        {
            string strInput = "";
            while (true)
            {
                Console.Write("Press Enter to continue");
                Console.ReadKey();
                Console.Clear();
                menuDisplay();
                Console.WriteLine("Enter the menu number: "); 
                strInput = Console.ReadLine(); //input from the user 

                if (strInput == "1") //applcation 1
                {
                    Q1_SyedI();

                }

                else if (strInput == "2") // application 2
                {
                    Q2_SyedI();

                }

                else if (strInput == "3") // application 3
                {
                    Q3_SyedI();

                }

                else if (strInput == "4") // application 4
                {
                    Q4_SyedI();

                }

                else if (strInput == "5") // application 5
                {
                    Q5_SyedI();

                }

                else if (strInput == "6") // application 6
                {

                    Q6_SyedI();

                }

                else if (strInput == "7") // application 7
                {
                    Q7_SyedI();

                }

                else if (strInput == "8") // exit
                {
                    break;
                }

                else
                {
                    Console.WriteLine("Please input a number from the menu"); // the user is not punished for bad input
                    
                }

            }


        }

        public static void menuDisplay() //menu display
        {
            Console.WriteLine("1. Program that converts an integer taken from a user to words"); // application 1
            Console.WriteLine("2. Program that reads the first character of a input reads whether or not it is a vowel or a consonant."); // application 2
            Console.WriteLine("3. Program that converts all lower case to capital and all capital to lowercase");// application 3
            Console.WriteLine("4. Program that converts an integer (3 digits) from a user to words"); // application 4
            Console.WriteLine("5. Program that will flip a word given by the user"); // application 5
            Console.WriteLine("6  Rainbow color words!"); // application 6
            Console.WriteLine("7. LEET SPEAK"); // application 7
            Console.WriteLine("8. Exit"); // Exit function

        }


        public static void Q1_SyedI() // application 1
        {
            Console.Write("Please input a number: ");
            string strInput = Console.ReadLine();
            for (int i = 0; i < strInput.Length; i++)
            {
                string stringSubInput = strInput.Substring(i, 1);   // reading the input 
                //using if statements to determine which number is input
                if (stringSubInput == "1") // if the number is 1
                {
                    Console.Write("One ");

                }

                else if (stringSubInput == "2")// if the number is 2
                {

                    Console.Write("Two ");
                }

                else if (stringSubInput == "3") // if the number is 3
                {

                    Console.Write("Three ");
                }

                else if (stringSubInput == "4") // if the number is 4
                {

                    Console.Write("Four ");
                }

                else if (stringSubInput == "5")// if the number is 5
                {

                    Console.Write("Five ");
                }

                else if (stringSubInput == "6") // if the number is 6
                {

                    Console.Write("Six ");
                }

                else if (stringSubInput == "7") // if the number is 7
                {

                    Console.Write("Seven ");
                }

                else if (stringSubInput == "8") // if the number is 8
                {

                    Console.Write("Eight ");
                }

                else if (stringSubInput == "9") // if the number is 9
                {

                    Console.Write("Nine ");
                }

                else if (stringSubInput == "0") // if the number is 0
                {

                    Console.Write("Zero ");
                }

                else // if input is not a number 
                {
                    Console.WriteLine("Not a Number");
                }
            }
            Console.WriteLine("");
        }


        public static void Q2_SyedI() // application 2
        {
            Console.Write("Please Input something except numbers: "); 
            string strInput = Console.ReadLine(); // input
            string strSubInput = strInput.Substring(0, 1); // reading the first letter from the input
            strSubInput = strSubInput.ToUpper(); 
            string strV = "";
            if (strSubInput == "A") // determining whether its a vowel or consonent
            {
                strV = "Vowel";
            }
            else if (strSubInput == "E")  // if the first character is (A, E, I, O or U) it is a Vowel 
            {
                strV = "Vowel";
            }
            else if (strSubInput == "I") //anything except (A, E, I, O or U) it is a Consonent
            {
                strV = "Vowel";
            }

            else if (strSubInput == "O")
            {
                strV = "Vowel";
            }

            else if (strSubInput == "U")
            {
                strV = "Vowel";
            }

            else //anything except (A, E, I, O or U) is a Consonent
            {
                strV = "Consonant"; 
            }

            Console.WriteLine("First character is a {0}", strV); // output
            


        }


        public static void Q3_SyedI() // application 3
        {
            Console.Write("\nEnter Your Full Name: "); 
            string input = Console.ReadLine(); // input
            Console.Write("\nHello ");
            for (int i = 0; i < input.Length; i++)
            {
                string sub = input.Substring(i, 1); // reading the string individially
                bool checkLower; //
                checkLower = Char.IsLower(sub,0); // check whether a character is lower case
                if (checkLower is true) // when a letter in the input is lower case the variable 'a' is true 
                {
                    Console.Write(sub.ToUpper());

                }

                if (checkLower is false) // when a letter in the input is upper the variable 'a' is false
                {
                    Console.Write(sub.ToLower());
                }
                
            }
            Console.WriteLine("\n"); // spaces 
            
        }


        public static void Q4_SyedI() // application 4
        {
            Console.Write("Please input a 3 digit number: ");
            string strInput = Console.ReadLine();
            string stringSubInput = strInput.Substring(0, 1);// reading the input 
            string stringSubInput1 = strInput.Substring(1, 1);
            string stringSubInput2 = strInput.Substring(2, 1);
            //using if statements to determine which number is input    
            //HUNDREDS
            if (stringSubInput == "1")
            {
                stringSubInput = "One Hundred ";
            }

            else if (stringSubInput == "2")
            {
                stringSubInput = "Two Hundred ";
            }

            else if (stringSubInput == "3")
            {
                stringSubInput = "Three Hundred ";
            }

            else if (stringSubInput == "4")
            {
                stringSubInput = "Four Hundred ";
            }

            else if (stringSubInput == "5")
            {
                stringSubInput = "Five Hundred ";
            }

            else if (stringSubInput == "6")
            {
                stringSubInput = "Six Hundred ";
            }

            else if (stringSubInput == "7")
            {
                stringSubInput = "Seven Hundred ";
            }

            else if (stringSubInput == "8")
            {
                stringSubInput = "Eight Hundred ";
            }

            else if (stringSubInput == "9")
            {
                stringSubInput = "Nine Hundred ";
            }

            else if (stringSubInput == "0")
            {
                stringSubInput = " ";
            }

            

            //TENS

            if (stringSubInput1 == "0")
            {
                stringSubInput1 = " ";
            }

            else if (stringSubInput1 == "2")
            {
                stringSubInput1 = "Twenty ";
            }

            else if (stringSubInput1 == "3")
            {
                stringSubInput1 = "Thirty ";
            }

            else if (stringSubInput1 == "4")
            {
                stringSubInput1 = "Forty ";
            }

            else if (stringSubInput1 == "5")
            {
                stringSubInput1 = "Fifty ";
            }

            else if (stringSubInput1 == "6")
            {
                stringSubInput1 = "Sixty ";
            }

            else if (stringSubInput1 == "7")
            {
                stringSubInput1 = "Seventy ";
            }

            else if (stringSubInput1 == "8")
            {
                stringSubInput1 = "Eighty ";
            }

            else if (stringSubInput1 == "9")
            {
                stringSubInput1 = "Ninety ";
            }

            else if (stringSubInput1 == "0")
            {
                stringSubInput = "";
            }

            

            if (stringSubInput1 == "1" && stringSubInput2 == "0")
            {
                stringSubInput1 = "Ten ";
                stringSubInput2 = "";
            }

            else if (stringSubInput1 == "1" && stringSubInput2 == "1")
            {
                stringSubInput1 = "Eleven ";
                stringSubInput2 = "";

            }

            else if (stringSubInput1 == "1" && stringSubInput2 == "2")
            {
                stringSubInput1 = "Twelve ";
                stringSubInput2 = "";

            }

            else if (stringSubInput1 == "1" && stringSubInput2 == "3")
            {
                stringSubInput1 = "Thirteen ";
                stringSubInput2 = "";

            }

            else if (stringSubInput1 == "1" && stringSubInput2 == "4")
            {
                stringSubInput1 = "Fourteen ";
                stringSubInput2 = "";

            }

            else if (stringSubInput1 == "1" && stringSubInput2 == "5")
            {
                stringSubInput1 = "Fifteen ";
                stringSubInput2 = "";

            }

            else if (stringSubInput1 == "1" && stringSubInput2 == "6")
            {
                stringSubInput1 = "Sixteen ";
                stringSubInput2 = "";

            }
            else if (stringSubInput1 == "1" && stringSubInput2 == "7")
            {
                stringSubInput1 = "Seventeen ";
                stringSubInput2 = "";

            }
            else if (stringSubInput1 == "1" && stringSubInput2 == "8")
            {
                stringSubInput1 = "Eighteen ";
                stringSubInput2 = "";

            }
            else if (stringSubInput1 == "1" && stringSubInput2 == "9")
            {
                stringSubInput1 = "Nineteen ";
                stringSubInput2 = "";

            }

            

            //ONES

            if (stringSubInput2 == "1" && stringSubInput1 != "1")
            {
                stringSubInput2 = "One";

            }

            else if (stringSubInput2 == "2" && stringSubInput1 != "1")
            {
                stringSubInput2 = "Two";

            }

            else if (stringSubInput2 == "3" && stringSubInput1 != "1")
            {
                stringSubInput2 = "Three";

            }

            else if (stringSubInput2 == "4" && stringSubInput1 != "1")
            {
                stringSubInput2 = "Four";

            }

            else if (stringSubInput2 == "5" && stringSubInput1 != "1")
            {
                stringSubInput2 = "Five";

            }

            else if (stringSubInput2 == "6" && stringSubInput1 != "1")
            {
                stringSubInput2 = "Six";

            }

            else if (stringSubInput2 == "7" && stringSubInput1 != "1")
            {
                stringSubInput2 = "Seven";

            }

            else if (stringSubInput2 == "8" && stringSubInput1 != "1")
            {
                stringSubInput2 = "Eight";

            }

            else if (stringSubInput2 == "9" && stringSubInput1 != "1")
            {
                stringSubInput2 = "Nine";

            }

            

            if (stringSubInput2 == "0" && stringSubInput1 != "1")
            {
                
                stringSubInput2 = "";

            }
            //if the user inputs 1000
            if (strInput == "1000")
            {
                stringSubInput = "One Thousand";
                stringSubInput1 = "";
                stringSubInput2 = "";
            }

            //OUTPUT


            Console.Write(stringSubInput);
            Console.Write(stringSubInput1);
            Console.Write(stringSubInput2);
                
           
            Console.WriteLine("\n"); 
        }


        public static void Q5_SyedI() // application 5
        {
            Console.Write("Input a word: ");
            string strInput = Console.ReadLine(); // input
            
            for (int i = strInput.Length; i > 0; i--) 
            {
                string final = strInput.Substring(i-1, 1); // if the input is 'abc' the length is 3 but really the length is NOT 3... its 2. To fix that we use i-1
                Console.Write(final);
            }
            Console.WriteLine(); //spaces
        }


        public static void Q6_SyedI() // application 6
        {
            Console.Write("Input a word or a sentence: ");
            string strInput = Console.ReadLine(); // input
            int intCounter = -1;
            for (int i = 0; i < strInput.Length; i++)
            {
                string strSubInput = strInput.Substring(i, 1); // reading individual chracter
                
                intCounter = intCounter + 1;  // using a counter to change the string color
                if (intCounter == 0)
                {
                    Console.BackgroundColor = ConsoleColor.White;
                    Console.ForegroundColor = ConsoleColor.DarkRed;

                }

                else if (intCounter == 1)
                {
                    Console.BackgroundColor = ConsoleColor.White;
                    Console.ForegroundColor = ConsoleColor.Red;
                }

                else if (intCounter == 2)
                {
                    Console.BackgroundColor = ConsoleColor.White;
                    Console.ForegroundColor = ConsoleColor.Yellow;

                }

                else if (intCounter == 3)
                {
                    Console.BackgroundColor = ConsoleColor.White;
                    Console.ForegroundColor = ConsoleColor.Green;

                }

                else if (intCounter == 4)
                {
                    Console.BackgroundColor = ConsoleColor.White;
                    Console.ForegroundColor = ConsoleColor.Blue;

                }

                else if (intCounter == 5)
                {
                    Console.BackgroundColor = ConsoleColor.White;
                    Console.ForegroundColor = ConsoleColor.DarkBlue;

                }

                else if (intCounter == 6)
                {

                    Console.BackgroundColor = ConsoleColor.White;
                    Console.ForegroundColor = ConsoleColor.DarkMagenta;

                }

                if (intCounter > 6) //returning to the starting color if the length is more than 7
                {
                    intCounter = -1;
                }
                Console.Write(strSubInput); //output in different colours
                
            }
            Console.WriteLine("");
            Console.BackgroundColor = ConsoleColor.Black;
            Console.ForegroundColor = ConsoleColor.Gray;
            backColor();
            
            


        } 


        public static void Q7_SyedI() // application 7
        {
            Console.Write("Input a word or a sentence: ");
            string strInput = Console.ReadLine(); // input

            for (int i = 0; i < strInput.Length; i++)
            {
                string strSubInput = strInput.Substring(i, 1); // using for loop and substring to determine the letter
                strSubInput = strSubInput.ToUpper();
                if (strSubInput == "A") // replacing the letters with appropriate symbols of LEET
                {
                    strSubInput = "@";

                }

                else if (strSubInput == "B")
                {
                    strSubInput = "8";

                }

                else if (strSubInput == "C")
                {
                    strSubInput = "[";

                }
                else if (strSubInput == "D")
                {
                    strSubInput = "D";

                }
                else if (strSubInput == "E")
                {
                    strSubInput = "3";

                }
                else if (strSubInput == "F")
                {
                    strSubInput = "F";

                }
                else if (strSubInput == "G")
                {
                    strSubInput = "6";

                }
                else if (strSubInput == "H")
                {
                    strSubInput = "#";

                }
                else if (strSubInput == "I")
                {
                    strSubInput = "!";

                }
                else if (strSubInput == "J")
                {
                    strSubInput = "7";

                }
                else if (strSubInput == "K")
                {
                    strSubInput = "|<";

                }
                else if (strSubInput == "L")
                {
                    strSubInput = "|_";

                }
                else if (strSubInput == "M")
                {
                    strSubInput = "M";

                }
                else if (strSubInput == "N")
                {
                    strSubInput = "N";

                }
                else if (strSubInput == "O")
                {
                    strSubInput = "()";

                }
                else if (strSubInput == "P")
                {
                    strSubInput = "P";

                }
                else if (strSubInput == "Q")
                {
                    strSubInput = "Q";

                }
                else if (strSubInput == "R")
                {
                    strSubInput = "|2";

                }
                else if (strSubInput == "S")
                {
                    strSubInput = "$";

                }
                else if (strSubInput == "T")
                {
                    strSubInput = "7";

                }
                else if (strSubInput == "U")
                {
                    strSubInput = "|_|";

                }
                else if (strSubInput == "V")
                {
                    strSubInput = "\\/";

                }
                else if (strSubInput == "W")
                {
                    strSubInput = "W";

                }
                else if (strSubInput == "X")
                {
                    strSubInput = "+";

                }
                else if (strSubInput == "Y")
                {
                    strSubInput = "Y";

                }
                else if (strSubInput == "Z")
                {
                    strSubInput = "7_";

                }
                else
                {
                    //if numbers or other characters, do nothing
                }

                Console.Write(strSubInput);
                //output
            }
            Console.WriteLine(); // spaces

        }


    }
}
