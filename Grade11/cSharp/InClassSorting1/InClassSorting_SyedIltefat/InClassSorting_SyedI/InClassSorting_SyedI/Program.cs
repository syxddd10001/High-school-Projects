using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InClassSorting_SyedI
{
    class Program
    {
        static void Main(string[] args)  // DOCUMENTATION IS NOT INCLUDED IN THIS PROJECT
        {
            application_Main();
            Console.ReadKey();
        }


        public static void application_Main()
        {
            int[] arrNumbers = new int[100];
            Random rand = new Random();
            int intRandom = 0;


            for (int i = 0; i < arrNumbers.Length; i++)
            {
                intRandom = rand.Next(1, 100);
                arrNumbers[i] = intRandom;
            }



            while (true)
            {
                Console.WriteLine("What do you want to do: \n1.Show all the numbers in the array unsorted\n2.Show all the numbers sorted out\n3.Show the greatest number in the array\n4.Show the smallest number in the array\n5.Show the average\n6.Show the median\n7.Exit");
                string menuInput = Console.ReadLine();
                if (menuInput == "1")
                {

                    for (int i = 0; i < arrNumbers.Length; i++)
                    {
                        Console.WriteLine(arrNumbers[i]);

                    }
                    Console.WriteLine(" ");
                }

                if (menuInput == "2")
                {                  
                    int temp = 0;

                    for (int i = 0; i < arrNumbers.Length; i++)
                    {
                        for (int j = 0; j < arrNumbers.Length - 1; j++)
                        {
                            if (arrNumbers[j] > arrNumbers[j + 1])
                            {
                                temp = arrNumbers[j];
                                arrNumbers[j] = arrNumbers[j + 1];
                                arrNumbers[j + 1] = temp;
                            }

                        }
                    }

                    for (int i = 0; i != arrNumbers.Length; i++)
                    {
                        Console.WriteLine(arrNumbers[i]);
                    }

                }



                if (menuInput == "3")
                {

                    int temp = 0;

                    for (int i = 0; i < arrNumbers.Length; i++)
                    {
                        for (int j = 0; j < arrNumbers.Length - 1; j++)
                        {
                            if (arrNumbers[j] > arrNumbers[j + 1])
                            {
                                temp = arrNumbers[j];
                                arrNumbers[j] = arrNumbers[j + 1];
                                arrNumbers[j + 1] = temp;
                            }

                        }

                    }

                    
                    Console.WriteLine("The greatest number is: {0}", arrNumbers[arrNumbers.Length-1]);

                }

                if (menuInput == "4")
                {
                    int temp = 0;

                    for (int i = 0; i < arrNumbers.Length; i++)
                    {
                        for (int j = 0; j < arrNumbers.Length - 1; j++)
                        {
                            if (arrNumbers[j] > arrNumbers[j + 1])
                            {
                                temp = arrNumbers[j];
                                arrNumbers[j] = arrNumbers[j + 1];
                                arrNumbers[j + 1] = temp;
                            }

                        }

                    }
                 
                    Console.WriteLine("The smallest number is: {0}", arrNumbers[0]);

                }

                if (menuInput == "5")
                {
                    int averageSum = 0;

                    for (int i = 0; i < arrNumbers.Length; i++)
                    {
                        averageSum += arrNumbers[i];

                    }

                    averageSum = averageSum / arrNumbers.Length;
                    Console.WriteLine("The Average is: {0}", averageSum);
                }


                if (menuInput == "6")
                {
                    int temp = 0;

                    for (int i = 0; i < arrNumbers.Length; i++)
                    {
                        for (int j = 0; j < arrNumbers.Length - 1; j++)
                        {
                            if (arrNumbers[j] > arrNumbers[j + 1])
                            {
                                temp = arrNumbers[j];
                                arrNumbers[j] = arrNumbers[j + 1];
                                arrNumbers[j + 1] = temp;
                            }

                        }

                    }

                    Console.WriteLine("The Median is {0}",arrNumbers[(arrNumbers.Length/2)-1]);


                }

                if (menuInput == "7")
                {
                    break;

                }
                Console.WriteLine("Press Any Key to continue");
                Console.ReadKey();


            }

        }



    }
}
