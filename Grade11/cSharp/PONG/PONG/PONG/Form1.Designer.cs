namespace PONG
{
    partial class Form1
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
            this.btnSTART = new System.Windows.Forms.Button();
            this.btnSTOP = new System.Windows.Forms.Button();
            this.pcb_Ball = new System.Windows.Forms.PictureBox();
            this.pcbBox = new System.Windows.Forms.PictureBox();
            this.tmrMain = new System.Windows.Forms.Timer(this.components);
            ((System.ComponentModel.ISupportInitialize)(this.pcb_Ball)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pcbBox)).BeginInit();
            this.SuspendLayout();
            // 
            // btnSTART
            // 
            this.btnSTART.Location = new System.Drawing.Point(12, 508);
            this.btnSTART.Name = "btnSTART";
            this.btnSTART.Size = new System.Drawing.Size(83, 51);
            this.btnSTART.TabIndex = 0;
            this.btnSTART.Text = "START";
            this.btnSTART.UseVisualStyleBackColor = true;
            this.btnSTART.Click += new System.EventHandler(this.btnSTART_Click);
            // 
            // btnSTOP
            // 
            this.btnSTOP.Location = new System.Drawing.Point(12, 565);
            this.btnSTOP.Name = "btnSTOP";
            this.btnSTOP.Size = new System.Drawing.Size(83, 51);
            this.btnSTOP.TabIndex = 1;
            this.btnSTOP.Text = "STOP";
            this.btnSTOP.UseVisualStyleBackColor = true;
            this.btnSTOP.Click += new System.EventHandler(this.btnSTOP_Click);
            // 
            // pcb_Ball
            // 
            this.pcb_Ball.BackColor = System.Drawing.Color.Transparent;
            this.pcb_Ball.BackgroundImage = global::PONG.Properties.Resources.images;
            this.pcb_Ball.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom;
            this.pcb_Ball.Location = new System.Drawing.Point(363, 412);
            this.pcb_Ball.Name = "pcb_Ball";
            this.pcb_Ball.Size = new System.Drawing.Size(33, 34);
            this.pcb_Ball.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.pcb_Ball.TabIndex = 2;
            this.pcb_Ball.TabStop = false;
            this.pcb_Ball.Click += new System.EventHandler(this.Pcb_Ball_Click);
            // 
            // pcbBox
            // 
            this.pcbBox.BackColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.pcbBox.Location = new System.Drawing.Point(299, 452);
            this.pcbBox.Name = "pcbBox";
            this.pcbBox.Size = new System.Drawing.Size(165, 12);
            this.pcbBox.TabIndex = 3;
            this.pcbBox.TabStop = false;
            this.pcbBox.Click += new System.EventHandler(this.pcbBox_Click);
            // 
            // tmrMain
            // 
            this.tmrMain.Interval = 1;
            this.tmrMain.Tick += new System.EventHandler(this.tmrMain_Tick);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 628);
            this.Controls.Add(this.pcbBox);
            this.Controls.Add(this.pcb_Ball);
            this.Controls.Add(this.btnSTOP);
            this.Controls.Add(this.btnSTART);
            this.Name = "Form1";
            this.Text = "Form1";
            this.KeyDown += new System.Windows.Forms.KeyEventHandler(this.Form1_KeyDown);
            ((System.ComponentModel.ISupportInitialize)(this.pcb_Ball)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pcbBox)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btnSTART;
        private System.Windows.Forms.Button btnSTOP;
        private System.Windows.Forms.PictureBox pcb_Ball;
        private System.Windows.Forms.PictureBox pcbBox;
        private System.Windows.Forms.Timer tmrMain;
    }
}

