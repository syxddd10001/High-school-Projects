//Name: Syed Iltefat
//Date: 19/11/2019
//purpose: Assignment 7
//Title: Program with menu that has sub applications


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace Assignment7_SyedI
{
    class Program
    {
        static void Main(string[] args)
        {
            menuFunction();
            
        }
        

        public static void menuShow()
        {
            Console.WriteLine("1. Program that reads the first 30 integers from a file and sorts it out");
            Console.WriteLine("2. Program that does various complicated to code stuff ");
            Console.WriteLine("3. Exit");

        }

        public static void menuFunction()
        {
            Console.WriteLine("Press any key to continue");
            Console.ReadKey();
            while (true)
            {
                menuShow();
                Console.WriteLine("Enter a number from the menu: ");
                string menuInput = Console.ReadLine();

                if (menuInput == "1")
                {
                    Q1_SyedI();

                }

                if (menuInput == "2")
                {
                    Q2_SyedI();
                }

                if (menuInput == "3")
                {
                    break;
                }

                else
                {
                    Console.WriteLine("Please input from the menu");
                }

            }

        }


        public static void Q1_SyedI()
        {
            //The location of the file is in definite, and therefore must be set 
            string location = "";
            Console.WriteLine("You do not have to enter the file name (default file name: nums.txt)");
            Console.WriteLine("Please Enter the file location:\nExample: E:\\Programming\\CSharp\\Assignment7\\Assignment7_SyedI\\Assignment7_SyedI\\obj\\Debug");
            location = Console.ReadLine();
            StreamReader file01 = File.OpenText(location+"\\nums.txt"); // the file name is definite, combining with the location creates the file
            string input = "";
            int[] arrNumb = new int[30];
            int counter = 0; // counter to keep track of the number of arrays elapsed
            int[] arrTemp=new int[arrNumb.Length]; // array to store the numbers from the text file
            while ((input = file01.ReadLine()) != "")
            {
                if (counter >= 30)
                {
                    break;
                }
                arrNumb[counter] = Int32.Parse(input); // converting from string to integer               
                counter += 1; // accumulating the counter
            }
            file01.Close(); // closing the file

            


            while (true)
            {
                Console.WriteLine("What do you want to do?\n1.Show all the numbers in the array(unsorted)\n2.Show the numbers in the array(sorted)\n3.Show the greatest number in the array\n4.Show the smallest number\n5.Show the average\n6.Show the Median\n7.Save to a new file and get the name from the user\n8.Exit");
                string input1 = Console.ReadLine(); // menu input
                if (input1 == "1")
                {
                    Console.WriteLine("");
                    for (int i = 0; i < arrNumb.Length; i++)
                    {              
                        Console.WriteLine(arrNumb[i]); // show the array unsorted
                    }
                    Console.WriteLine("\n");
                }



                if (input1 == "2")
                {
                    int temp = 0; //declaring a variable to store a number in the array temporarily 

                    for (int i = 0; i < arrNumb.Length; i++) // sorting the array from lowest to highest
                    {
                        for (int j = 0; j < arrNumb.Length-1; j++)
                        {
                            if (arrNumb[j] > arrNumb[j + 1])
                            {
                                temp = arrNumb[j];
                                arrNumb[j] = arrNumb[j + 1];
                                arrNumb[j + 1] = temp;
                            }

                        }
                    }


                    for (int i = 0; i < arrNumb.Length ; i++)
                    {
                        Console.WriteLine(arrNumb[i]); //printing the numbers in the array(sorted) in the console 
                    }

                }

                if (input1 == "3")
                {
                    int temp = 0; 
                    // sorting the array to get the greatest number
                    for (int i = 0; i < arrNumb.Length; i++)
                    {
                        for (int j = 0; j < arrNumb.Length - 1; j++)
                        {
                            if (arrNumb[j] > arrNumb[j + 1])
                            {
                                temp = arrNumb[j];
                                arrNumb[j] = arrNumb[j + 1];
                                arrNumb[j + 1] = temp;
                            }

                        }
                    }
                    Console.WriteLine("The greatest number is: {0}", arrNumb[arrNumb.Length - 1]); // printing the greatest number in the array
                }

                if (input1 == "4")
                {
                    int temp = 0;
                    //sorting the array to get the shortest number in the array
                    for (int i = 0; i < arrNumb.Length; i++)
                    {
                        for (int j = 0; j < arrNumb.Length - 1; j++)
                        {
                            if (arrNumb[j] > arrNumb[j + 1])
                            {
                                temp = arrNumb[j];
                                arrNumb[j] = arrNumb[j + 1];
                                arrNumb[j + 1] = temp;
                            }

                        }
                    }
                    Console.WriteLine("The smallest number is: {0}", arrNumb[0]); // printing the shortest number in the array

                }

                if (input1 == "5")
                {
                    int Sum = 0;
                    for (int i = 0; i < arrNumb.Length; i++)
                    {
                        Sum += arrNumb[i]; 
                    }

                    Console.WriteLine("The Average is: {0}", Sum/30); // average of the array
                }

                if (input1 == "6")
                {
                    Console.WriteLine("The Median is: {0}", arrNumb[14]); // median of the array
                }

                if (input1 == "7") // saving the current array to a text file
                {                   
                    Console.WriteLine("Name your file: ");
                    string fileName = Console.ReadLine();
                    FileInfo file1 = new FileInfo(location+"\\"+fileName);
                    StreamWriter makeFile = file1.CreateText();
                    
                    for (int i = 0; i < 30; i++)
                    {
                        makeFile.WriteLine(arrNumb[i]);
                    }
                    makeFile.Close();
                    
                }

                if (input1 == "8")
                {
                    break; // exit

                }


                else
                {
                    Console.WriteLine("Please input from the menu: ");

                }
            }
                

        }
        //2


        public static void Q2_SyedI()
        {

            
            int size = 0;
            string location = "";
            Console.WriteLine("Please Enter the file location\nYou do not have to enter the file name(default file name: manualNames.txt)\nExample: J:\\Programming\\CSharp\\Assignment7\\Assignment7_SyedI\\Assignment7_SyedI\\obj\\Debug");
            location = Console.ReadLine(); //The location of the file is in definite, and therefore must be set
            StreamReader file01 = File.OpenText(location + "\\manualNames.txt"); // location of the text file 
            string input = "";
            string[] arrNames = new string[65];
                

            while ((input = file01.ReadLine()) != "")
            {
                if (size >= 65)
                {
                    break;
                }
                arrNames[size] = input;

                size += 1; // accumulating the counter
            }

            file01.Close();

            Random rnd = new Random();
            int intRandom = rnd.Next(100, 200);
            int intRandomGrade = 0;
            string[] arrNEWNames1 = new string[intRandom]; // array to store the default array order

            FileInfo file12 = new FileInfo(location + "\\studentData.txt"); // file reading 
            StreamWriter makeFile = file12.CreateText();
            int size1 = 0;
            while (size1 < arrNEWNames1.Length)
            {

                intRandomGrade = rnd.Next(30, 101); // randomly generated marks
                intRandom = rnd.Next(0, 65); 
                arrNEWNames1[size1] = size1 + ", " + arrNames[intRandom] + ", " + intRandomGrade; // linking all informations into one array
                //Console.WriteLine(arrNEWNames1[size1]);
                makeFile.WriteLine(arrNEWNames1[size1]);
                size1 += 1;

            }
            string[] arrNEWNames2 = new string[arrNEWNames1.Length]; // array to save all current arrays
                                                    //four arrays for four different information
            int[] arrStudentNumber = new int[arrNEWNames1.Length];
            string[] arrStudentName = new string[arrNEWNames1.Length];
            string[] arrStudentGender = new string[arrNEWNames1.Length];
            int[] arrStudentMarks = new int[arrNEWNames1.Length];
            string[] arrTemp = new string[arrNEWNames1.Length];
            for (int i = 0; i < arrNEWNames1.Length; i++)
            {
                arrTemp[i] = arrNEWNames1[i];
                arrStudentNumber[i] = Int32.Parse(arrNEWNames1[i].Substring(0, arrNEWNames1[i].IndexOf(",")));
                arrNEWNames1[i] = arrNEWNames1[i].Substring(arrNEWNames1[i].IndexOf(",") + 2);
                arrStudentName[i] = arrNEWNames1[i].Substring(0, arrNEWNames1[i].IndexOf(","));
                arrNEWNames1[i] = arrNEWNames1[i].Substring(arrNEWNames1[i].IndexOf(",") + 2);
                arrStudentGender[i] = arrNEWNames1[i].Substring(0, arrNEWNames1[i].IndexOf(","));
                arrNEWNames1[i] = arrNEWNames1[i].Substring(arrNEWNames1[i].IndexOf(",") + 2);
                arrStudentMarks[i] = Int32.Parse(arrNEWNames1[i]);
                arrNEWNames1[i] = arrTemp[i];
            }
            string input1 = null;

            while (true)
            {
                Console.WriteLine("What do you want to do with the list");
                Console.WriteLine("1.Show the list (unsorted)\n2.Show the number of records in the list\n3.Sort List by Name\n4.Sort List by Grade\n5.Show Current List\n6.Add record\n7.Delete a specific record\n8.show the averages by gender\n9.Number of males and females\n10.Save the list to a new file\n11.Exit");
                Console.WriteLine("");
                input1 = Console.ReadLine();

                if (input1 == "1") // show the list (unsorted)
                {
                    for (int i = 0; i < arrNEWNames1.Length; i++)
                    {
                        Console.WriteLine(arrNEWNames1[i]);
                    }
                    Console.WriteLine("\n");
            }

                if (input1 == "2") // Number of records in the array
                {
                    Console.WriteLine("You have {0} records in the list", arrNEWNames1.Length);
                    Console.WriteLine("\n");
                }

                if (input1 == "3")// sort by name
                {
                    string temp = null;
                    int IntTemp = 0;
                    arrNEWNames2 = new string[arrNEWNames1.Length];
                    for (int j = 0; j < arrNEWNames1.Length; j++)
                    {
                        for (int i = 0; i < arrNEWNames1.Length - 1; i++)
                        {
                            if (String.Compare(arrStudentName[i], arrStudentName[i + 1]) > 0)
                            {
                                IntTemp = arrStudentNumber[i];
                                arrStudentNumber[i] = arrStudentNumber[i + 1];
                                arrStudentNumber[i + 1] = IntTemp;

                                temp = arrStudentName[i];
                                arrStudentName[i] = arrStudentName[i + 1];
                                arrStudentName[i + 1] = temp;

                                temp = arrStudentGender[i];
                                arrStudentGender[i] = arrStudentGender[i + 1];
                                arrStudentGender[i + 1] = temp;

                                IntTemp = arrStudentMarks[i];
                                arrStudentMarks[i] = arrStudentMarks[i + 1];
                                arrStudentMarks[i + 1] = IntTemp;


                            }



                        }


                    }




                    for (int i = 0; i != arrNEWNames1.Length; i++)
                    {
                        arrNEWNames2[i] = arrStudentNumber[i] + ", " + arrStudentName[i] + ", " + arrStudentGender[i] + ", " + arrStudentMarks[i];
                        Console.WriteLine(arrNEWNames2[i]); // printing the array
                    }


                }

                if (input1 == "4") // sorting by grade
                {

                    int temp = 0;
                    string temp1 = null;
                    arrNEWNames2 = new string[arrNEWNames1.Length];
                    for (int i = 0; i < arrNEWNames1.Length; i++)
                    {
                        for (int j = 0; j < arrNEWNames1.Length - 1; j++)
                        {
                            if (arrStudentMarks[j] > arrStudentMarks[j + 1])
                            {
                                temp = arrStudentMarks[j];
                                arrStudentMarks[j] = arrStudentMarks[j + 1];
                                arrStudentMarks[j + 1] = temp;

                                temp = arrStudentNumber[j];
                                arrStudentNumber[j] = arrStudentNumber[j + 1];
                                arrStudentNumber[j + 1] = temp;

                                temp1 = arrStudentName[j];
                                arrStudentName[j] = arrStudentName[j + 1];
                                arrStudentName[j + 1] = temp1;

                                temp1 = arrStudentGender[j];
                                arrStudentGender[j] = arrStudentGender[j + 1];
                                arrStudentGender[j + 1] = temp1;


                            }

                        }


                    }

                    for (int i = 0; i < arrNEWNames2.Length; i++)
                    {
                        arrNEWNames2[i] = arrStudentNumber[i] + ", " + arrStudentName[i] + ", " + arrStudentGender[i] + ", " + arrStudentMarks[i];
                        Console.WriteLine(arrNEWNames2[i]); // printing in the console
                    }
                    Console.WriteLine("\n");



            }

                if (input1 == "5") // show current list
                {
                    for (int i = 0; i < arrNEWNames2.Length; i++)
                    {
                        Console.WriteLine(arrNEWNames2[i]); // show current list
                    }

                }

                if (input1 == "6") // add a new record
                {
                        

                    string[] arrTemp2 = new string[arrNEWNames1.Length + 1]; // creating temporary arrays to store the previous arrays 
                    int[] arrTemp3 = new int[arrNEWNames1.Length + 1];
                    int[] arrTemp4 = new int[arrNEWNames1.Length + 1];
                    string[] arrTemp5 = new string[arrNEWNames1.Length + 1];

                    string[] arrTemp1 = new string[arrNEWNames1.Length + 1];
                    string[] arrTemp01 = new string[arrNEWNames2.Length + 1];
                    int arrlength = arrNEWNames1.Length;

                    for (int i = 0; i < arrNEWNames1.Length; i++)  
                    {
                        arrTemp1[i] = arrNEWNames1[i];
                        arrTemp2[i] = arrStudentGender[i];
                        arrTemp3[i] = arrStudentNumber[i];
                        arrTemp4[i] = arrStudentMarks[i];
                        arrTemp5[i] = arrStudentName[i];
                        arrTemp01[i] = arrNEWNames2[i];

                    }
                    arrNEWNames1 = new string[arrNEWNames1.Length + 1];
                    arrStudentName = new string[arrNEWNames1.Length + 1];
                    arrStudentNumber = new int[arrNEWNames1.Length + 1];
                    arrStudentMarks = new int[arrNEWNames1.Length + 1];
                    arrStudentGender = new string[arrNEWNames1.Length + 1];
                    arrNEWNames2 = new string[arrNEWNames2.Length + 1];
                    Console.WriteLine("Type the Name: "); // getting the information the user wants to add
                    string strNinput = Console.ReadLine();
                    Console.WriteLine("Type the Gender: ");
                    string strGinput = Console.ReadLine();
                    Console.WriteLine("Type the Marks: ");
                    string intMinput = Console.ReadLine();

                for (int i = 0; i < arrTemp1.Length; i++)
                {
                        arrNEWNames1[i] = arrTemp1[i];
                        arrStudentGender[i] = arrTemp2[i];
                        arrStudentNumber[i] = arrTemp3[i];
                        arrStudentMarks[i] = arrTemp4[i];
                        arrStudentName[i] = arrTemp5[i];
                        arrNEWNames2[i] = arrTemp01[i];
                         
                }

                arrNEWNames1[arrNEWNames1.Length-1] = arrlength + ", " + strNinput + ", " + strGinput + ", " + intMinput;
                arrStudentMarks[arrNEWNames1.Length -2] = Int32.Parse(intMinput);
                arrStudentNumber[arrNEWNames1.Length - 2] = arrStudentNumber.Length;
                arrStudentGender[arrNEWNames1.Length - 2] = strGinput;
                arrStudentName[arrNEWNames1.Length - 2] = strNinput;
                arrNEWNames2[arrNEWNames1.Length - 1] = arrStudentNumber.Length + ", " + strNinput + ", " + strGinput + ", " + intMinput;
                    

            }

                if (input1 == "7")
                {

                    Console.WriteLine("Which index value do you want to delete? NOTE: Indexes Start with 0");
                    int intIndex = Int32.Parse(Console.ReadLine());
                    int realIndex = intIndex;

                    string[] arrTemp2 = new string[arrNEWNames1.Length-1];
                    int[] arrTemp3 = new int[arrNEWNames1.Length-1];
                    int[] arrTemp4 = new int[arrNEWNames1.Length-1];
                    string[] arrTemp5 = new string[arrNEWNames1.Length-1];

                    string[] arrTemp1 = new string[arrNEWNames1.Length-1];
                        


                    for (int i = 0; i < realIndex; i++)
                    {
                        arrTemp1[i] = arrNEWNames1[i];
                        arrTemp2[i] = arrStudentGender[i];
                        arrTemp3[i] = arrStudentNumber[i];
                        arrTemp4[i] = arrStudentMarks[i];
                        arrTemp5[i] = arrStudentName[i];

                    }

                    for (int i = realIndex; i < arrTemp2.Length; i++)
                    {
                        arrTemp1[i] = arrNEWNames1[i+1];
                        arrTemp2[i] = arrStudentGender[i+1];
                        arrTemp3[i] = arrStudentNumber[i+1];
                        arrTemp4[i] = arrStudentMarks[i+1];
                        arrTemp5[i] = arrStudentName[i+1];

                    }
                    arrNEWNames1 = new string[arrNEWNames1.Length - 1];
                    arrStudentName = new string[arrNEWNames1.Length - 1];
                    arrStudentNumber = new int[arrNEWNames1.Length - 1];
                    arrStudentMarks = new int[arrNEWNames1.Length - 1];
                    arrStudentGender = new string[arrNEWNames1.Length - 1];


                    for (int i = 0; i < arrTemp1.Length; i++)
                    {
                        arrNEWNames1[i] = arrTemp1[i];

                    }


                }

                if (input1 == "8") // average by marks by male and female 
                {
                    int counterM = 0;
                    int counterF = 0;
                    double sum1 = 0;
                    double sum2 = 0;
                    double average1 = 0;
                    double average2 = 0;

                    for (int i = 0; i < arrNEWNames1.Length; i++)
                    {
                        if (arrStudentGender[i] == "M")
                        {
                            counterM += 1;
                        }
                        else if (arrStudentGender[i] == "F")
                        {
                            counterF += 1;
                        }

                        else { }
                    }

                    for (int i = 0; i < arrNEWNames1.Length; i++)
                    {
                        if (arrStudentGender[i] == "M")
                        {
                            sum1 += arrStudentMarks[i];
                        }
                        else if (arrStudentGender[i] == "F")
                        {
                            sum2 += arrStudentMarks[i];
                        }
                    }

                    average1 = sum1 / counterM;
                    average2 = sum2 / counterF;

                    Console.WriteLine("Male average marks: {0}", Math.Round(average1, 1));
                    Console.WriteLine("Female average marks: {0}", Math.Round(average2, 1));

                }


                if (input1 == "9") //Male and Female Numbers
                {
                    int counterM = 0;
                    int counterF = 0;
                    for (int i = 0; i < arrNEWNames1.Length; i++)
                    {
                        if (arrStudentGender[i] == "M")
                        {
                            counterM += 1;
                        }
                        else if (arrStudentGender[i] == "F")
                        {
                            counterF += 1;
                        }
                    }
                    Console.WriteLine("There are {0} males and {1} females in the list", counterM, counterF);
                }

                if (input1 == "10") // save to a new file
                {
                    Console.WriteLine("Name your file: ");
                    string fileName = Console.ReadLine();
                    FileInfo file1 = new FileInfo(location + "\\" + fileName + ".txt");
                    StreamWriter makeFile3 = file1.CreateText();

                    for (int i = 0; i < arrNEWNames2.Length; i++)
                    {
                        makeFile3.WriteLine(arrNEWNames2[i]);
                    }
                    makeFile.Close();


                }


                if (input1 == "11")
                {
                    break;
                }

                else 
                {
                    Console.WriteLine("Please enter from the menu\n\n");
                    

                }

            }






            makeFile.Close();


            

            }








    }
}
