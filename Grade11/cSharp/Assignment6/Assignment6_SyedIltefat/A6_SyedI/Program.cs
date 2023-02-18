//Name: Syed Iltefat
//Date: 23rd October, 2019.
//Title: Assignment 6
//Purpose: Create an application with menus and sub applications that can be accessed through the menu
using System;

namespace A6_SyedI
{
    class Program
    {
        static void Main(string[] args)
        {
            mainMenuMethod();
            

        }



        public static void mainMenuMethod()
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

                else if (strInput == "5") // exit
                {
                    break;
                }

                else
                {
                    Console.WriteLine("Please input a number from the menu"); // the user is not punished for bad input

                }
            }
        }


        public static void menuDisplay()
        {
            //The user enters a number from this menu to access individual programs
            Console.WriteLine("1. Program that outputs random numbers after user specifies how many times to do it");
            Console.WriteLine("2. Program that asks for a set of 5 to 15 grades until they enter -99");
            Console.WriteLine("3. Program that keeps track of grocery list ");
            Console.WriteLine("4. Program that manages a class list of names");
            Console.WriteLine("5. Exit");

        }


        public static void Q1_SyedI() // application 1
        {
            Console.WriteLine("Please input how many times to iterate: "); 
            string strInput = Console.ReadLine(); //taking input from the user for how many times they want to iterate
            int intInput = Int32.Parse(strInput); //parsing to int
            Random random = new Random(); //random method       
            int [] arrvalue = new int[intInput]; //array to store the random values
            int Counter1 = 0, Counter2 = 0, Counter3 = 0, Counter4 = 0, Counter5 = 0, Counter6 = 0, Counter7 = 0; //declaring counters for numbers 0 to 9
            int Counter8 = 0, Counter9 = 0, Counter0 = 0; //declaring counters for numbers 0 to 9
            for (int i = 0; i != intInput; i++)
            {
                int rand = random.Next(0,10); // getting a random number from 0 to 9
                arrvalue[i] = rand; // storing the generated random number 

                if (arrvalue[i] == 1) // checking what number it is in the array
                {
                    Counter1 += 1; // adding 1 to the counter everytime it finds that number
                }

                else if (arrvalue[i] == 2)// checking what number it is in the array
                {
                    Counter2 += 1; // adding 1 to the counter everytime it finds that number
                }


                else if (arrvalue[i] == 3) // checking what number it is in the array
                {
                    Counter3 += 1; // adding 1 to the counter everytime it finds that number
                }


                else if (arrvalue[i] == 4)// checking what number it is in the array
                {
                    Counter4 += 1; // adding 1 to the counter everytime it finds that number
                }

                else if (arrvalue[i] == 5) // checking what number it is in the array
                {
                    Counter5 += 1; // adding 1 to the counter everytime it finds that number
                }


                else if (arrvalue[i] == 6) // checking what number it is in the array
                {
                    Counter6 += 1; // adding 1 to the counter everytime it finds that number
                }


                else if (arrvalue[i] == 7)// checking what number it is in the array
                {
                    Counter7 += 1;// adding 1 to the counter everytime it finds that number
                }


                else if (arrvalue[i] == 8) // checking what number it is in the array
                {
                    Counter8 += 1; // adding 1 to the counter everytime it finds that number
                }


                else if (arrvalue[i] == 9) // checking what number it is in the array
                {
                    Counter9 += 1; // adding 1 to the counter everytime it finds that number
                }

                else if (arrvalue[i] == 0) // checking what number it is in the array
                {
                    Counter0 += 1; // adding 1 to the counter everytime it finds that number

                }

            }


            //output
            Console.WriteLine("NUMBER  " + "   OCCURANCE ");
            Console.WriteLine("0       " + "     {0}", Counter0); // outputting the occurance number 
            Console.WriteLine("1       " + "     {0}", Counter1);
            Console.WriteLine("2       " + "     {0}", Counter2);
            Console.WriteLine("3       " + "     {0}", Counter3);
            Console.WriteLine("4       " + "     {0}", Counter4);
            Console.WriteLine("5       " + "     {0}", Counter5);
            Console.WriteLine("6       " + "     {0}", Counter6);
            Console.WriteLine("7       " + "     {0}", Counter7);
            Console.WriteLine("8       " + "     {0}", Counter8);
            Console.WriteLine("9       " + "     {0}", Counter9);

        }

        public static void Q2_SyedI() // application 2
        {

            //Variable declaration
            Console.WriteLine("Enter 5 to 15 grades; enter -99 to show the result immediately: ");
            int intCounter = 0;
            double[] arrGrade = new double[15];
            double dblAverage = 0;
            double result = 0;
            //using while loop for iteration
            while (true)
            { 
                string Input = Console.ReadLine();

                if (Input == "" && intCounter < 5)
                {
                    Console.WriteLine("Invalid input\n");
                    Console.WriteLine("Please input 5 or more grades\n\nPress Enter to continue");
                    Console.ReadKey();
                    Console.Clear();
                    Q2_SyedI();
                }


                else if (Input == "") //if the user inputs nothing, break the loop
                {
                    break;
                }             

                double dblInput = Double.Parse(Input);  //input conversion to double 

                if (dblInput > 100 && intCounter < 5) // if the user inputs more than 100 and the user inputs less than 5 grades
                {
                    Console.WriteLine("Invalid input\n");
                    Console.WriteLine("Please input 5 or more grades\n\nPress Enter to continue");
                    Console.ReadKey();
                    Console.Clear();
                    Q2_SyedI();

                }
                else if (dblInput > 100 || dblInput < 0 && dblInput != -99) //if the user inputs more a grade more than 100
                {
                    Console.WriteLine("Invalid input\n");
                    Console.WriteLine("Please input 5 or more grades\n\nPress Enter to continue");
                    Console.ReadKey();
                    Console.Clear();
                    Q2_SyedI();
                }


                if (dblInput == -99 && intCounter >= 5 && intCounter < 15) //if the user inputs -99, entered 5 grades or more and 15 grades or less 
                {
                    break;
                }

                if (dblInput == -99 && intCounter < 5) // if the user inputs -99 before 5 grades
                {
                    Console.WriteLine("Please input 5 or more grades\n\nPress Enter to continue");
                    Console.ReadKey();
                    Console.Clear();
                    Q2_SyedI();
                }

                arrGrade[intCounter] = dblInput; // storing the input in the array
                
                intCounter += 1;              

                if (intCounter == 15) // if the user enters 15 grades
                {
                    break;
                }        
            }
           

            //making a temporary storage for the previous arrays
            double[] arrTemp = new double[intCounter];
            for (int i = 0; i < intCounter; i++)
            {
                arrTemp[i] = arrGrade[i];
            }
            //re declaring the main grade array to reset the values
            arrGrade = new double[intCounter];
            //re assigning the temporary array values in the main array 
            for (int i = 0; i < arrTemp.Length; i++)
            {
                arrGrade[i] = arrTemp[i];
            }


            while (true)
            {
                Console.WriteLine("what do you want to know?");
                Console.WriteLine("1. Number of values in the array\n2.List the values in the array\n3.Average\n4.Delete a specific value\n5.Clear all the values in the array\n6.Change a specific value\n7. Exit to main menu");
                string inputMenu = Console.ReadLine(); // menu for the user to input what they want to do with that grade

                if (inputMenu == "1")
                {
                    Console.WriteLine("You have {0} values", arrGrade.Length);  // outputting the array length
                }

                if (inputMenu == "2")
                {
                    for (int i = 0; i < arrGrade.Length; i++)
                    {
                        Console.WriteLine(arrGrade[i]); // outputting all the grades in the array
                    }
                    Console.WriteLine("\n\n");
                }

                if (inputMenu == "3")
                {
                    result = 0;
                    for (int i = 0; i < arrGrade.Length; i++)
                    {
                        result += arrGrade[i]; // adding the stored values
                    }  

                    dblAverage = result / arrGrade.Length; // average
                    dblAverage = Math.Round(dblAverage, 1); // rounding to 1 decimal place
                    Console.WriteLine("\nYour average is: {0}\n\n", dblAverage); //outputting the average
                }

                if (inputMenu == "4")
                {
                    Console.WriteLine("Type the index you want to delete\nNote: indexes start with 0: "); // input of the index the user wants to delete
                    string input4 = Console.ReadLine();
                    int intInput4 = Int32.Parse(input4);
                    
                    arrTemp = new double[arrGrade.Length-1]; // declaring temporary array size

                    for (int i = 0; i < intInput4; i++) // copying the grades from index 0 to (but not including) the index that the user entered 
                    {
                        arrTemp[i] = arrGrade[i];
                    }

                    for (int i = intInput4; i < arrTemp.Length; i++) //skipping the index that the user entered 
                    {
                        arrTemp[i] = arrGrade[i+1]; // copying all the grades AFTER the index the user entered
                    }

                    arrGrade = new double[arrGrade.Length-1]; // reinitializing the main array

                    for (int i = 0; i < arrTemp.Length; i++) //trasferring the grades from the temporary array to the main array
                    {
                        arrGrade[i] = arrTemp[i];

                    }

                    

                }

                if (inputMenu == "5")
                {
                    arrGrade = new double[5];
                    Console.WriteLine("\nCleared all the values in the array\nSet the array size to 5 (default)\n"); // redeclaring the array to reset it 
                    
                }

                if (inputMenu == "6")
                {
                    Console.WriteLine("Type the index you want to change\nNote: indexes start with 0: ");
                    string input6 = Console.ReadLine();
                    int intInput6 = Int32.Parse(input6);
                    Console.WriteLine("Type Grade you want to input: "); // user inputs the new grade
                    double input7 = Double.Parse(Console.ReadLine()); // parsing the input
                    arrGrade[intInput6] = input7;  // replacing that input with the user input index                    
                }

                if (inputMenu == "7")
                {       
                    break;
                }
            }


        }

        public static void Q3_SyedI() // application 3
        {
            Console.WriteLine("How many items do you want to enter: ");
            string numberInput = Console.ReadLine();
            if (numberInput == "")
            {
                Console.WriteLine("Please input how many items you want to purchase");
                Q3_SyedI();
            }
            
            int intItemNumber = Int32.Parse(numberInput ); // getting input on how many items the user wants to purchase
            string[] arrItems = new string[intItemNumber]; //declaring an array to store the items 
           
            for (int i = 0; i < arrItems.Length; i++)
            {
                Console.Write("Item {0}: ", i + 1);
                string strItems = Console.ReadLine(); // the user inputs what items they want to purchase
                arrItems[i] = strItems; // storing that input in an array
            }


            while (true) // menu for the user
            {

                Console.WriteLine("what do you want to do?");
                Console.WriteLine("1. View the items\n2.Add items\n3.Change an Item\n4.Delete an Item\n5.Exit to main menu"); // menu list
                string input = Console.ReadLine(); // input for menu

                if (input == "1") // view the items
                {
                    for (int i = 0; i < arrItems.Length; i++)
                    {
                        Console.WriteLine("Item {0}: " + arrItems[i], i+1); // outputting all the items in the array
                    }
                    Console.WriteLine("\n\n"); // spaces

                }

                if (input == "2") // add items
                {
                    string [] arrTemp = new string[arrItems.Length + 1];

                    for (int i = 0; i < arrItems.Length; i++) // copying the items from the main array to a temporary array
                    {
                        arrTemp[i] = arrItems[i];   
                    }

                    arrItems = new string[arrItems.Length+1]; // resetting the main array

                    Console.WriteLine("Type the new item you want to add: "); // user inputs the new item
                    string newItem = Console.ReadLine();

                    for (int i = 0; i < arrTemp.Length; i++)
                    {
                        arrItems[i] = arrTemp[i]; // restoring the old arrays from the temporary array
                    }

                    arrItems[arrItems.Length-1] = newItem; // storing the new item into the array
                }

                if (input == "3") // change an item
                {   
                    Console.WriteLine("Type the item number you want to change"); 
                    int inputIndex = Int32.Parse(Console.ReadLine()); //taking the input of the index the user wants to change
                    inputIndex = inputIndex - 1; // user friendly index
                    Console.WriteLine("Item Name: ");
                    string input1 = Console.ReadLine();

                    arrItems[inputIndex] = input1;
                    //adding the item the user wants 1

                }

                if (input == "4") // delete an item
                {
                    string[] arrTemp = new string[arrItems.Length - 1]; //declaring temporary array 
                    Console.WriteLine("Type the item number you want to delete");
                    int inputIndex = Int32.Parse(Console.ReadLine()); //taking the input of the index the user wants to delete
                    int realIndex = inputIndex-1;
                    for (int i = 0; i < realIndex; i++) //deletting the value the user wants
                    {
                        arrTemp[i] = arrItems[i]; //storing the values upto (but not including) the index the user enters in a temporary array 

                    }
                    for (int i = realIndex; i < arrTemp.Length; i++)
                    {
                        arrTemp[i] = arrItems[i + 1]; //storing the values from (but not including) the index the user enters in the same temporary array
                    }

                    arrItems = new string[arrItems.Length-1]; // reinitializing the main array

                    for (int i = 0; i < arrTemp.Length; i++)
                    {
                        arrItems[i] = arrTemp[i]; // restoring the values from the temporary arrayto the main array  
                    }

                }

                if (input == "5")
                {  
                    break;
                }
        

            }

        }

        public static void Q4_SyedI() // application 4
        {
            string[] arrList = new string[1];
            
            
            while (true)
            {
                Console.WriteLine("Type what you want to do\n1. Add new names to the list\n2.Delete a name\n3.Reset the array\n4. View the Array\n5.Exit to main menu");
                string input = Console.ReadLine();

                if (input == "1")
                {

                    string[] arrTemp = new string[arrList.Length + 1];
                    for (int i = 0; i < arrList.Length; i++)
                    {
                        arrTemp[i] = arrList[i]; 
                    }

                    arrList = new string[arrList.Length + 1]; // reinitializing the main array

                    Console.WriteLine("Type what you want to add: ");
                    string newinput = Console.ReadLine();

                    for (int i = 0; i < arrTemp.Length; i++)
                    {
                        arrList[i] = arrTemp[i];
                    }

                    arrList[arrList.Length - 1] = newinput; // adding the user input at the end of the array
                }

                if (input == "2")
                {
                    string[] arrTemp = new string[arrList.Length-1]; //declaring temporary array 
                    Console.WriteLine("Type the index number you want to delete\nNOTE: Indexes start with 0");
                    int inputIndex = Int32.Parse(Console.ReadLine()); //taking the input of the index the user wants to delete
                    int realIndex = inputIndex;
                    for (int i = 0; i < realIndex; i++) //deletting the value the user wants
                    {
                        arrTemp[i] = arrList[i]; //storing the values upto (but not including) the index the user enters in a temporary array 
                    }
                    for (int i = realIndex; i < arrTemp.Length; i++)
                    {
                        arrTemp[i] = arrList[i + 1]; //storing the values from (but not including) the index the user enters in the same temporary array
                    }

                    arrList = new string[arrList.Length - 1]; // reinitializing the main array

                    for (int i = 0; i < arrTemp.Length; i++)
                    {
                        arrList[i] = arrTemp[i]; // restoring the values from the temporary array to the main array  
                    }

                }


                if (input == "3")
                {
                    arrList = new string[1];
                    Console.WriteLine("\nArray Reset Successful\n");// reset the array
                }

                if (input == "4")
                {
                    for (int i = 0; i < arrList.Length; i++)
                    {
                        Console.WriteLine(arrList[i]);
                    }
                }


                if (input == "5")
                {
                    break; // exit
                }
            }

        }




    }
}