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
    //Title: Alien Invaders
    //Assignment: Culminating

    public partial class controls : Form
    {
        public controls()
        {
            InitializeComponent();
        }

        private void btnMainMenu_Click(object sender, EventArgs e)
        {
            this.Close();
            new formMAINMENU().Show();
        }
    }
}
