using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace TestFileIO
{
    class Program
    {
        static void Main(string[] args)
        {
            fileIO();
            Console.ReadKey();
        }


        public static void NOTINUSE()
        {
            FileInfo file1 = new FileInfo(@"C:\Users\348461252\source\repos\TestFileIO");
            StreamWriter makeFile = file1.CreateText();
            makeFile.WriteLine("TEXT TEST; PLEASE CEASE FIRE");
            makeFile.Write(makeFile.NewLine);
            makeFile.WriteLine("NEXT LEVEL");
            makeFile.Close();
     

        }

        public static void fileIO()
        {
            string location = "";
            Console.WriteLine("Please Enter the file location:\nExample: @\"J:\\Programming\\TestFileIO\\filename.txt\"\n");
            location = Console.ReadLine();
            StreamReader file01 = File.OpenText(location);
            string input = "";
            string[] arrArray = new string[9];
            int counter = 0;
            while ((input = file01.ReadLine()) != null)
            {

                arrArray[counter] = input;
                Console.WriteLine(arrArray[counter]);
                counter += 1;
            }
            file01.Close();

        }




    }

}
