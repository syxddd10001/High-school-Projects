namespace CulminatingTEST_PROJECT
{
    partial class GAMEForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(GAMEForm));
            this.btnMainMenu = new System.Windows.Forms.Button();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.btnClose = new System.Windows.Forms.Button();
            this.lblPoints = new System.Windows.Forms.Label();
            this.lblHealth = new System.Windows.Forms.Label();
            this.txtBoxName = new System.Windows.Forms.TextBox();
            this.lblEnterNAME = new System.Windows.Forms.Label();
            this.btnSaveScore = new System.Windows.Forms.Button();
            this.pcbPlayerShip = new System.Windows.Forms.PictureBox();
            this.pcbPlayer_Laser = new System.Windows.Forms.PictureBox();
            this.pictureBox2 = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.pcbPlayerShip)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pcbPlayer_Laser)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).BeginInit();
            this.SuspendLayout();
            // 
            // btnMainMenu
            // 
            this.btnMainMenu.Location = new System.Drawing.Point(725, 12);
            this.btnMainMenu.Name = "btnMainMenu";
            this.btnMainMenu.Size = new System.Drawing.Size(63, 39);
            this.btnMainMenu.TabIndex = 0;
            this.btnMainMenu.Text = "Main Menu";
            this.btnMainMenu.UseVisualStyleBackColor = true;
            this.btnMainMenu.Click += new System.EventHandler(this.Button1_Click);
            // 
            // timer1
            // 
            this.timer1.Interval = 1;
            this.timer1.Tick += new System.EventHandler(this.Timer1_Tick);
            // 
            // btnClose
            // 
            this.btnClose.Location = new System.Drawing.Point(725, 57);
            this.btnClose.Name = "btnClose";
            this.btnClose.Size = new System.Drawing.Size(63, 39);
            this.btnClose.TabIndex = 2;
            this.btnClose.Text = "EXIT";
            this.btnClose.UseVisualStyleBackColor = true;
            this.btnClose.Click += new System.EventHandler(this.BtnClose_Click);
            // 
            // lblPoints
            // 
            this.lblPoints.AutoSize = true;
            this.lblPoints.BackColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.lblPoints.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblPoints.ForeColor = System.Drawing.SystemColors.Control;
            this.lblPoints.Location = new System.Drawing.Point(7, 6);
            this.lblPoints.Name = "lblPoints";
            this.lblPoints.Size = new System.Drawing.Size(24, 25);
            this.lblPoints.TabIndex = 4;
            this.lblPoints.Text = "0";
            // 
            // lblHealth
            // 
            this.lblHealth.AutoSize = true;
            this.lblHealth.BackColor = System.Drawing.Color.Transparent;
            this.lblHealth.Font = new System.Drawing.Font("Gill Sans Ultra Bold", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblHealth.Location = new System.Drawing.Point(638, 645);
            this.lblHealth.Name = "lblHealth";
            this.lblHealth.Size = new System.Drawing.Size(31, 23);
            this.lblHealth.TabIndex = 7;
            this.lblHealth.Text = "...";
            // 
            // txtBoxName
            // 
            this.txtBoxName.Enabled = false;
            this.txtBoxName.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtBoxName.Location = new System.Drawing.Point(316, 256);
            this.txtBoxName.Name = "txtBoxName";
            this.txtBoxName.Size = new System.Drawing.Size(177, 31);
            this.txtBoxName.TabIndex = 8;
            // 
            // lblEnterNAME
            // 
            this.lblEnterNAME.AutoSize = true;
            this.lblEnterNAME.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblEnterNAME.Location = new System.Drawing.Point(329, 228);
            this.lblEnterNAME.Name = "lblEnterNAME";
            this.lblEnterNAME.Size = new System.Drawing.Size(150, 25);
            this.lblEnterNAME.TabIndex = 9;
            this.lblEnterNAME.Text = "ENTER NAME";
            // 
            // btnSaveScore
            // 
            this.btnSaveScore.Location = new System.Drawing.Point(353, 293);
            this.btnSaveScore.Name = "btnSaveScore";
            this.btnSaveScore.Size = new System.Drawing.Size(104, 39);
            this.btnSaveScore.TabIndex = 10;
            this.btnSaveScore.Text = "Save Highscore";
            this.btnSaveScore.UseVisualStyleBackColor = true;
            this.btnSaveScore.Click += new System.EventHandler(this.btnSaveScore_Click);
            // 
            // pcbPlayerShip
            // 
            this.pcbPlayerShip.BackColor = System.Drawing.Color.Transparent;
            this.pcbPlayerShip.BackgroundImageLayout = System.Windows.Forms.ImageLayout.None;
            this.pcbPlayerShip.ErrorImage = global::CulminatingTEST_PROJECT.Resource1.spaceship4;
            this.pcbPlayerShip.Image = global::CulminatingTEST_PROJECT.Resource1.spaceship5;
            this.pcbPlayerShip.Location = new System.Drawing.Point(353, 597);
            this.pcbPlayerShip.Name = "pcbPlayerShip";
            this.pcbPlayerShip.Size = new System.Drawing.Size(80, 71);
            this.pcbPlayerShip.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pcbPlayerShip.TabIndex = 1;
            this.pcbPlayerShip.TabStop = false;
            // 
            // pcbPlayer_Laser
            // 
            this.pcbPlayer_Laser.Anchor = System.Windows.Forms.AnchorStyles.Top;
            this.pcbPlayer_Laser.BackColor = System.Drawing.Color.Transparent;
            this.pcbPlayer_Laser.Image = ((System.Drawing.Image)(resources.GetObject("pcbPlayer_Laser.Image")));
            this.pcbPlayer_Laser.Location = new System.Drawing.Point(379, 614);
            this.pcbPlayer_Laser.Name = "pcbPlayer_Laser";
            this.pcbPlayer_Laser.Size = new System.Drawing.Size(27, 39);
            this.pcbPlayer_Laser.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pcbPlayer_Laser.TabIndex = 3;
            this.pcbPlayer_Laser.TabStop = false;
            // 
            // pictureBox2
            // 
            this.pictureBox2.Image = global::CulminatingTEST_PROJECT.Resource1.earth;
            this.pictureBox2.Location = new System.Drawing.Point(-9, -3);
            this.pictureBox2.Name = "pictureBox2";
            this.pictureBox2.Size = new System.Drawing.Size(813, 696);
            this.pictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox2.TabIndex = 6;
            this.pictureBox2.TabStop = false;
            // 
            // GAMEForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.Control;
            this.ClientSize = new System.Drawing.Size(796, 688);
            this.Controls.Add(this.btnSaveScore);
            this.Controls.Add(this.lblEnterNAME);
            this.Controls.Add(this.txtBoxName);
            this.Controls.Add(this.lblHealth);
            this.Controls.Add(this.pcbPlayerShip);
            this.Controls.Add(this.pcbPlayer_Laser);
            this.Controls.Add(this.btnMainMenu);
            this.Controls.Add(this.btnClose);
            this.Controls.Add(this.lblPoints);
            this.Controls.Add(this.pictureBox2);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.KeyPreview = true;
            this.Name = "GAMEForm";
            this.Text = "GAMEForm";
            this.Load += new System.EventHandler(this.GAMEForm_Load);
            this.KeyDown += new System.Windows.Forms.KeyEventHandler(this.GAMEForm_KeyDown);
            ((System.ComponentModel.ISupportInitialize)(this.pcbPlayerShip)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pcbPlayer_Laser)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnMainMenu;
        private System.Windows.Forms.PictureBox pcbPlayerShip;
        private System.Windows.Forms.Timer timer1;
        private System.Windows.Forms.Button btnClose;
        private System.Windows.Forms.PictureBox pcbPlayer_Laser;
        private System.Windows.Forms.Label lblPoints;
        private System.Windows.Forms.PictureBox pictureBox2;
        private System.Windows.Forms.Label lblHealth;
        private System.Windows.Forms.TextBox txtBoxName;
        private System.Windows.Forms.Label lblEnterNAME;
        private System.Windows.Forms.Button btnSaveScore;
    }
}