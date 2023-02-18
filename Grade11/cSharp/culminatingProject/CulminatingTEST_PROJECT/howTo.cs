using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CulminatingTEST_PROJECT
{
    //Name: SYED ILTEFAT
    //Date: 20/1/2020
    //Title: Alien invaders
    //Assignment: Culminating


    public partial class howTo : Form
    {
        public howTo()
        {
            InitializeComponent();
        }

        private void btnMenu_Click(object sender, EventArgs e) // going back to main menu on click
        {
            new formMAINMENU().Show();
            this.Close();

        }
    }
}
