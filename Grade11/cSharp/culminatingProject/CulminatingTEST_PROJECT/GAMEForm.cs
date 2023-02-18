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
    //Title: Alien invaders
    //Assignment: Culminating

    public partial class GAMEForm : Form
    {
        public GAMEForm()
        {
            InitializeComponent();
            
        }
        //PLAYER VARIABLES
        int intPlayerSpeed_Horizontal = 15; // player movement value
        int intEnemyPos = 105; // enemy position value
        int intLaserSpeed = 24; //speed of the laser
        int intDirection = 1; // direction of the player movement
        int intPoints = 1; // user points; accumulates as the player destroys enemies
        int intAbsoluteBottomPos = 444; // the bottom value; after the enemies start going below this this player's health decreases
        double dblPlayerHealth = 100.00; // players health; decreases if the enemies are below the "absolute bottom" value
        
        //HIGHSCORE VARIABLES
        string[] highscoreArray1 = new string[10]; //array to score 10 best highscores
        string[] strTempHs = new string[10]; // temporay array for highscores (names)
        int[] intTempHs = new int[10]; // temporary array for highscores (scores)
        string[] HSname = new string[10]; // highscore names array
        int[] HSscore = new int[10]; //highscore scores array

        //ENEMY MOVEMENT VARIABLES
        int moveX; //enemy movement in this X direction value
        int moveY = 1; //enemy movement in this Y direction value
        int intDirection2; // enemy direction
        
        //MISCELLANEOUS VARIABLES
        bool shoot = false; //variable to see if the user has shot a laser or not
        bool noEnemies = true; 
       
        //ENEMY GENERATOR VARIABLES
        Random rnd = new Random(); // random number generator
        PictureBox[] pcbEnemyArray = new PictureBox[10]; //array for enemies 
        int enemyPosX; //enemy generating positions X
        int enemyPosY; //enemy generating positions Y
        
        

       
        private void Button1_Click(object sender, EventArgs e) // main menu button click
        {
            new formMAINMENU().Show(); // show main menu form
            this.Close(); //close the game form

        }

        private void GAMEForm_Load(object sender, EventArgs e) // when the user presses play in the main menu form and the game form loads
        {
            txtBoxName.Hide(); //hide input for highscore name
            btnMainMenu.Enabled = false; // disable main menu button
            btnClose.Enabled = false; //disable Exit button
            lblEnterNAME.Hide(); // hide "enter name" label 
            btnSaveScore.Hide(); // hide save high score button
            btnSaveScore.Enabled = false; // disable show highscore button
            generateEnemy(); // generate enemy when the form loads

            timer1.Enabled = true; // enable the time when form loads
            
        }


        private void GAMEForm_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyData == Keys.D || e.KeyData == Keys.Right) // control for going right
            {
                intDirection = 1;
                pcbPlayerShip.Left += intPlayerSpeed_Horizontal * intDirection;
                
            }

            else if (e.KeyData == Keys.A || e.KeyData == Keys.Left) //control for going left
            {
                intDirection = -1; 
                pcbPlayerShip.Left += intPlayerSpeed_Horizontal * intDirection;
                
            }

            else if (e.KeyData == Keys.Z) // control for shooting laser
            {
                shoot = true;            
            }
        }

        private void Timer1_Tick(object sender, EventArgs e) //main timer 
        {

            spaceShipPosition(); // move player spaceship function
            shootLaser(); // shoot laser function 
            moveEnemy(); // move enemies function
            lblPoints.Text = "" + intPoints; // show points 
            lblHealth.Text = "HEALTH: " + Math.Round(dblPlayerHealth, 0); //Show the player's health
        }

        private void BtnClose_Click(object sender, EventArgs e) //exit button click
        {
            Application.Exit(); // close the application
        }


        
        public void moveEnemy() // function for enemy movement
        {

            

            if (dblPlayerHealth <= 0 && intPoints < 1500) // if the player's health is less than or equal to zero and the player points is less than 1500
            {
                timer1.Enabled = false; // disable timer
                MessageBox.Show("YOU LOSE"); // show this message
                btnMainMenu.Enabled = true; // enable main menu button
                btnClose.Enabled = true; // enable exit button
            }

            if (dblPlayerHealth <= 0 && intPoints > 1500) // if the player's health is less than or equal to zero and the player points is more than 1500
            {
                for (int i = 0; i < pcbEnemyArray.Length; i++) // clear the enemies from the user's screen
                {
                    pcbEnemyArray[i].Top = -5000;
                    pcbEnemyArray[i].Left = 0;

                }
                timer1.Enabled = false; // disable timer 
                txtBoxName.Enabled = true; // enable user input for name
                txtBoxName.Show(); //show user input for name 
                lblEnterNAME.Show(); //show "enter your name" label
                btnMainMenu.Enabled = true; // enable main menu button
                btnSaveScore.Show(); //show save highscore button
                btnSaveScore.Enabled = true; // enable save highscore button
                btnClose.Enabled = true; // enable exit button

            }

            for (int i = 0; i < pcbEnemyArray.Length; i++) // movement of the enemy
            {
                
                if (intDirection2 == 1)
                {
                    
                    moveY = Math.Abs(moveY) * -1;
                }
                else if (intDirection2 == 2)
                {
                    
                    moveY = Math.Abs(moveY) * -1;
                }
                else if (intDirection2 == 3)
                {
                    
                    moveY = Math.Abs(moveY);
                }
                else if (intDirection2 == 4)
                {
                    
                    moveY = Math.Abs(moveY);
                }
                
               
                if (intDirection2 == 1 && this.pcbEnemyArray[i].Top < 0)
                {
                    intDirection2 = 4;
                }

                if (pcbEnemyArray[i].Top > intAbsoluteBottomPos)
                {
                    dblPlayerHealth -= 0.3; // standard health reduction
                    
                }

                if (pcbEnemyArray[i].Top > intAbsoluteBottomPos && intPoints > 3000)
                {
                    dblPlayerHealth -= 0.9; // if the player has more than 3000 points; decrease more health when the enemy gets below the point

                }

                pcbEnemyArray[i].Left += moveX; // enemy movement sideways
                pcbEnemyArray[i].Top += moveY; // enemy movement up and down


                if (intPoints <= 1500 && intPoints >= 1000 && noEnemies == true ) // when the player hits 1000 points, show this message
                {
                    noEnemies = false;
                    timer1.Enabled = false;
                    MessageBox.Show("You've reached the objective of 1000 points");
                    MessageBox.Show("NEXT OBJECTIVE: 1500 points");
                    timer1.Enabled = true;
                }

                if (noEnemies == false && intPoints >= 1500 && intPoints <= 3000) // when the player hits 1500 points, show this message
                {
                    noEnemies = true;
                    timer1.Enabled = false;
                    MessageBox.Show("Congrats, you've won the game!");
                    MessageBox.Show("Continue Playing to have a highscore!");
                    timer1.Enabled = true;
                    moveY = 2;
                    intPlayerSpeed_Horizontal = 18;
                }

                if (intPoints >= 3000 && noEnemies == true) // when the player hits 3000 points, show this message
                {
                    timer1.Enabled = false;
                    noEnemies = false;
                    MessageBox.Show("You've reached GODLIKE tier");
                    moveY = 3;
                    timer1.Enabled = true;
                    lblPoints.ForeColor = Color.Red;
                    dblPlayerHealth = 100;
                }

            }




        }

        public void generateEnemy() // function for generating enemies
        {
            for (int i = 0; i <= 5; i += 1) // generating enemies set 1
            {
                intEnemyPos += 66; // no 2 enemy positions should be the same
                enemyPosX = intEnemyPos;
                enemyPosY = 30; // enemy position Y
                pcbEnemyArray[i] = new PictureBox(); // create a picture box in the picture box array
                pcbEnemyArray[i].Location = new Point(enemyPosX, enemyPosY); //the number i picture box location
                pcbEnemyArray[i].Size = new Size(40, 50); // size of the image
                pcbEnemyArray[i].Name = "pcbEnemySHIP" + i;// name of the picture box
                pcbEnemyArray[i].Tag = i; // tag of the picture box
                pcbEnemyArray[i].Image = Resource1.ENEMYspaceShip; // the image file
                pcbEnemyArray[i].SizeMode = PictureBoxSizeMode.StretchImage; // size mode of the picture box
                pcbEnemyArray[i].BackColor = Color.Transparent; // background color of the picture box
                Controls.Add(pcbEnemyArray[i]); // adding controls to the form
                pcbEnemyArray[i].BringToFront(); // bringing the enemies in the front of the form
            }

            intEnemyPos = 105; // reset enemy position

            for (int i = 6; i < 10; i += 1) // generating enemies set 2
            {
                intEnemyPos += 88;  // no 2 enemy positions should be the same
                enemyPosX = intEnemyPos;                           
                enemyPosY = 100; // enemy position Y
                pcbEnemyArray[i] = new PictureBox(); // create a picture box in the picture box array
                pcbEnemyArray[i].Location = new Point(enemyPosX, enemyPosY); //the number i picture box location
                pcbEnemyArray[i].Size = new Size(40, 50); // size of the image
                pcbEnemyArray[i].Name = "pcbEnemySHIP" + i;// name of the picture box
                pcbEnemyArray[i].Tag = i; // tag of the picture box
                pcbEnemyArray[i].Image = Resource1.ENEMYspaceShip; // the image file
                pcbEnemyArray[i].SizeMode = PictureBoxSizeMode.StretchImage; // size mode of the picture box
                pcbEnemyArray[i].BackColor = Color.Transparent; // background color of the picture box
                Controls.Add(pcbEnemyArray[i]); // adding controls to the form
                pcbEnemyArray[i].BringToFront(); // bringing the enemies in the front of the form
            }

            intEnemyPos = 105; //reset enemy position

            


        }



        public void shootLaser() //  function for shooting laser 
        {
            if (pcbPlayer_Laser.Top == pcbPlayerShip.Top && pcbPlayer_Laser.Left != pcbPlayerShip.Left) // if the position of the laser(top) is equal to the player 
            {                                                                                           // spaceship but the left position is not equal to the ship;             
                pcbPlayer_Laser.Left = pcbPlayerShip.Left;                                              // set the laser's postion to the player ship's position
            }


            if (shoot == true) // if "Z" is pressed
            {
                pcbPlayer_Laser.Top -= intLaserSpeed; // change the laser's position
                
                if (pcbPlayer_Laser.Top < 0) // if the laser goes beyond the window
                {

                    pcbPlayer_Laser.Top = pcbPlayerShip.Top;// return the laser to the spaceships postion
                    shoot = false;//make sure the player does not shoot 2 lasers at once
                }
                for (int i = 0; i < pcbEnemyArray.Length; i++) //checking if the laser has hit any of the enemy ships 
                {
                    if (pcbPlayer_Laser.Bounds.IntersectsWith(pcbEnemyArray[i].Bounds))
                    {
                        pcbEnemyArray[i].Top = -250; // set the position of the enemy to that value

                        intPoints += 35; // increase the users current point

                        pcbPlayer_Laser.Top = pcbPlayerShip.Top; // return the laser to the player's position

                        shoot = false; //make sure the player does not shoot 2 lasers at once
                    }
                }

            }
        }

        public void spaceShipPosition() // player spaceship function
        {
            if (pcbPlayerShip.Left > this.Width) // if the player spaceship goes beyond the width of the window
            {
                pcbPlayerShip.Left = 800; // return it to the position of the value

            }
            else if (pcbPlayerShip.Left <= 0)// if the player goes below the width of the window 
            {
                pcbPlayerShip.Left = 0; // return it to the position of the value
            }

            
        }
        
        //HIGHSCORES
        public void highScoresADD() // highscores function
        {
            highscoreArray1[0] = txtBoxName.Text + ": " + intPoints; //store the current highscore

            int counter = 1; // counter for reading the highscore file from the desktop

            try
            {
                StreamReader highScore = File.OpenText("highscores.txt"); // reading the highscore file
                string text = null; // string that contains all the highscore file data

                int temp = 0;//int temporary array
                string temp1 = null; //string temporary array

                while ((text = highScore.ReadLine()) != null) //while the text data is not blank 
                {
                    if (counter == 10) // store the top 10 highscores of the file
                    {
                        break;
                    }
                    highscoreArray1[counter] = text; // store the data in an array
                    counter += 1;
                }

                for (int i = 0; i < highscoreArray1.Length; i++) // seperating the name from the points 
                {
                    strTempHs[i] = highscoreArray1[i]; //storing the original data in an array
                    HSname[i] = highscoreArray1[i].Substring(0, highscoreArray1[i].IndexOf(":")); //storing the names in the data in an array
                    highscoreArray1[i] = highscoreArray1[i].Substring(highscoreArray1[i].IndexOf(":") + 2); //from ":" to the end of the string is the points 
                    HSscore[i] = Int32.Parse(highscoreArray1[i]);//storing the scores in the data in an array
                    highscoreArray1[i] = strTempHs[i]; // restoring the values in the main high score array from the temp array 

                }

                highScore.Close(); // closing the file for validation
                FileInfo fileScores = new FileInfo("highscores.txt"); // setting the file for writing 
                StreamWriter highscore1 = fileScores.CreateText(); // creating a new text file; replacing the old one


                for (int i = 0; i < highscoreArray1.Length; i++) // sorting the array; from highest points to lowest points
                {
                    for (int j = 0; j < highscoreArray1.Length - 1; j++)
                    {
                        if (HSscore[j] < HSscore[j + 1])//if the score[j] is less then score[j+1] replace it with j+1  
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


                for (int i = 0; i < highscoreArray1.Length; i++) // writing the scores to the newly created file 
                {
                    highscoreArray1[i] = HSname[i] + ": " + HSscore[i]; //replacing the unsorted array with the new sorted array
                    highscore1.WriteLine(highscoreArray1[i]); // writing the scores to the newly created file
                    
                }

                highscore1.Close(); // closing the file for validation


            }

            catch (Exception f)
            {
                MessageBox.Show("" + f); // catch any errors and show to the user
            }


        }


        private void btnSaveScore_Click(object sender, EventArgs e) //save highscore button click 
        {
            highScoresADD();
            
        }

        
    }





}
