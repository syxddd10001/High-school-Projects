using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace CulminatingTEST_PROJECT
{
    //Name: SYED ILTEFAT
    //Date: 20/1/2020
    //Title: Alien Invaders
    //Assignment: Culminating

    public partial class formHIGHSCORE : Form
    {
        public formHIGHSCORE()
        {
            InitializeComponent();
        }

        //HIGHSCORES

        int lblPosY = 56; // position of the label
        string[] highscoreArray1 = new string[10]; // array for storing the highscores
        Label[] lblArray = new Label[10]; // array for generating the labels for showing the highscores
        int posCounter = 50; // every label should have different positions; so we ditermine that by a counter


       
        string[] strTempHs = new string[10]; // temporary string array
        int[] intTempHs = new int[10]; //temporary int array
        string[] HSname = new string[10]; //all the names array
        int[] HSscore = new int[10]; // all the scores array

        //all button clicks in the menu
        private void Button1_Click(object sender, EventArgs e)
        {
            new formMAINMENU().Show();
            this.Close();
        }

        private void BtnExit_Click(object sender, EventArgs e) // exit button click
        {
            Application.Exit(); // exit the application
        }

        public void showHighScores()
        {
            try
            {
                int counter = 0; // counter for reading the highscore file from the desktop
                int temp; // temporary int variable
                string temp1; // temporary string variable
                StreamReader highScore = File.OpenText("highscores.txt");  // reading the highscore file
                string input = null; // string that contains all the highscore file data
                while ((input = highScore.ReadLine()) != null)//while the text data is not blank
                {
                    if (counter == 10)// store the top 10 highscores of the file
                    {
                        break;
                    }
                    highscoreArray1[counter] = input;// store the data in an array
                    counter += 1;
                }


                for (int i = 0; i < highscoreArray1.Length; i++) // seperating the name from the points
                {
                    strTempHs[i] = highscoreArray1[i]; //storing the original data in an array
                    HSname[i] = highscoreArray1[i].Substring(0, highscoreArray1[i].IndexOf(":"));//storing the names in the data in an array
                    highscoreArray1[i] = highscoreArray1[i].Substring(highscoreArray1[i].IndexOf(":") + 2);//from ":" to the end of the string is the points
                    HSscore[i] = Int32.Parse(highscoreArray1[i]);//storing the scores in the data in an array
                    highscoreArray1[i] = strTempHs[i];// restoring the values in the main high score array from the temp array 

                }


                for (int i = 0; i < highscoreArray1.Length; i++) // sorting the array; from highest points to lowest points
                {
                    for (int j = 0; j < highscoreArray1.Length - 1; j++) //if the score[j] is less then score[j+1] replace it with j+1 
                    {
                        if (HSscore[j] < HSscore[j + 1])
                        {
                            temp = HSscore[j]; // storing the current score in a temp variable
                            HSscore[j] = HSscore[j + 1]; // replacing the next score with the current score
                            HSscore[j + 1] = temp; // replacing the current score with the next score

                            temp1 = HSname[j]; // replacing the name with the score
                            HSname[j] = HSname[j + 1];
                            HSname[j + 1] = temp1;

                        }

                    }


                }
                for (int i = 0; i < highscoreArray1.Length; i++) //replacing the unsorted array with the new sorted array
                {
                    highscoreArray1[i] = HSname[i] + ": " + HSscore[i]; //replacing the unsorted array with the new sorted array

                }

                for (int i = 0; i < highscoreArray1.Length; i++)
                {
                    lblArray[i].Text = highscoreArray1[i]; //reading the data from the array and assigning them to the created labels
                }

                highScore.Close(); // closing the file for validation

            }

            catch (Exception e)
            {
                MessageBox.Show("" + e); // any errors

            }


        }

        public void generateLabels()//function for generating labels 
        {
            for (int i = 0; i < lblArray.Length; i++)
            {
                posCounter += 30; // different positions for all the labels
                
                lblArray[i] = new Label(); // creating a label
                lblArray[i].Location = new Point(15, posCounter); // determining the position using the counter variable so its always different from the previous one              
                lblArray[i].Name = "lblHighscore" + i; // name of the label
                lblArray[i].Tag = i; // tag of the label
                lblArray[i].Text = highscoreArray1[i]; // the data array which was used earlier to show the user as a text
                lblArray[i].BackColor = Color.Transparent; // transparent background color
                Controls.Add(lblArray[i]); //adding controls to the form
                lblArray[i].BringToFront(); // bringing the label to the very front of the form

            }

        }

        private void lblHighScores_Click(object sender, EventArgs e) //useless
        {

        }

        private void formHIGHSCORE_Load(object sender, EventArgs e) // this gets called when the form loads aka when the highscore button is pressed from the menu
        {
            generateLabels();// generating labels function
            showHighScores();//assigning the labels with data function
            
        }
    }
}
