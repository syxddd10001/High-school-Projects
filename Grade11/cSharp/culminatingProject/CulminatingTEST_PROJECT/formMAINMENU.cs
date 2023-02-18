using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Threading;
namespace CulminatingTEST_PROJECT
{


    //Name: SYED ILTEFAT
    //Date: 20/1/2020
    //Title: Alien Invaders
    //Assignment: Culminating


    public partial class formMAINMENU : Form
    {
        
        public formMAINMENU()
        {
            InitializeComponent();
        }
        
        
        //all button clicks in the menu
        private void Button1_Click(object sender, EventArgs e)
        {
            this.Hide(); // hide the menu form
            new formHIGHSCORE().Show(); // show the High Score form
            
        }

        private void Button2_Click(object sender, EventArgs e)
        {
            Application.Exit(); //exit the application
        }

        private void ExitToolStripMenuItem_Click(object sender, EventArgs e) // menu Strip
        {
            this.Hide(); // hide the menu form
            new formHIGHSCORE().Show(); // show the High Score form
        }

        private void ExitToolStripMenuItem1_Click(object sender, EventArgs e) // menu Strip
        {
            Application.Exit(); //exit the application
        }

        private void BtnPLAY_Click(object sender, EventArgs e)
        {
            new GAMEForm().Show(); // show the game form
            this.Hide(); //hide the menu form
                      
        }

        private void btnControls_Click(object sender, EventArgs e)
        {
            
            new controls().Show(); // show the controls form
            this.Hide(); // hide the menu form
        }

        private void button1_Click_1(object sender, EventArgs e)
        {
            new howTo().Show(); // show the How to Play form
            this.Hide(); //hide the menu form
        }
    }
}
