namespace HW10Desktop
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
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
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.Create = new System.Windows.Forms.Button();
            this.CreateClientButton = new System.Windows.Forms.Button();
            this.ClientListView = new System.Windows.Forms.ListView();
            this.ID = new System.Windows.Forms.ColumnHeader();
            this.Surname = new System.Windows.Forms.ColumnHeader();
            this.Firstname = new System.Windows.Forms.ColumnHeader();
            this.Patrynomic = new System.Windows.Forms.ColumnHeader();
            this.columnHeaderBirthday = new System.Windows.Forms.ColumnHeader();
            this.splitContainer1 = new System.Windows.Forms.SplitContainer();
            this.listView1 = new System.Windows.Forms.ListView();
            this.columnHeaderId = new System.Windows.Forms.ColumnHeader();
            this.columnHeaderClientId = new System.Windows.Forms.ColumnHeader();
            this.columnHeaderName = new System.Windows.Forms.ColumnHeader();
            this.columnHeader1 = new System.Windows.Forms.ColumnHeader();
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).BeginInit();
            this.splitContainer1.Panel1.SuspendLayout();
            this.splitContainer1.Panel2.SuspendLayout();
            this.splitContainer1.SuspendLayout();
            this.SuspendLayout();
            // 
            // Create
            // 
            this.Create.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.Create.Location = new System.Drawing.Point(692, 388);
            this.Create.Name = "Create";
            this.Create.Size = new System.Drawing.Size(96, 50);
            this.Create.TabIndex = 0;
            this.Create.Text = "Update";
            this.Create.UseVisualStyleBackColor = false;
            this.Create.Click += new System.EventHandler(this.Create_Click);
            // 
            // CreateClientButton
            // 
            this.CreateClientButton.Location = new System.Drawing.Point(611, 415);
            this.CreateClientButton.Name = "CreateClientButton";
            this.CreateClientButton.Size = new System.Drawing.Size(75, 23);
            this.CreateClientButton.TabIndex = 2;
            this.CreateClientButton.Text = "New Client";
            this.CreateClientButton.UseVisualStyleBackColor = true;
            this.CreateClientButton.Click += new System.EventHandler(this.Create_Click);
            // 
            // ClientListView
            // 
            this.ClientListView.BackColor = System.Drawing.SystemColors.InactiveCaption;
            this.ClientListView.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.ID,
            this.Surname,
            this.Firstname,
            this.Patrynomic,
            this.columnHeaderBirthday});
            this.ClientListView.FullRowSelect = true;
            this.ClientListView.GridLines = true;
            this.ClientListView.Location = new System.Drawing.Point(3, 0);
            this.ClientListView.Name = "ClientListView";
            this.ClientListView.Size = new System.Drawing.Size(458, 370);
            this.ClientListView.TabIndex = 1;
            this.ClientListView.UseCompatibleStateImageBehavior = false;
            this.ClientListView.View = System.Windows.Forms.View.Details;
            this.ClientListView.SelectedIndexChanged += new System.EventHandler(this.listView1_SelectedIndexChanged);
            // 
            // ID
            // 
            this.ID.Tag = "#";
            this.ID.Text = "Id";
            // 
            // Surname
            // 
            this.Surname.Tag = "Фамилия";
            this.Surname.Text = "Фмилия";
            this.Surname.Width = 100;
            // 
            // Firstname
            // 
            this.Firstname.Tag = "Имя";
            this.Firstname.Text = "Имя";
            this.Firstname.Width = 100;
            // 
            // Patrynomic
            // 
            this.Patrynomic.Tag = "Отчество";
            this.Patrynomic.Text = "Отчество";
            this.Patrynomic.Width = 100;
            // 
            // columnHeaderBirthday
            // 
            this.columnHeaderBirthday.Tag = "Дата рождения";
            this.columnHeaderBirthday.Text = "Дата рождения";
            this.columnHeaderBirthday.Width = 120;
            // 
            // splitContainer1
            // 
            this.splitContainer1.Location = new System.Drawing.Point(12, 12);
            this.splitContainer1.Name = "splitContainer1";
            // 
            // splitContainer1.Panel1
            // 
            this.splitContainer1.Panel1.AccessibleName = "Pets";
            this.splitContainer1.Panel1.AccessibleRole = System.Windows.Forms.AccessibleRole.Separator;
            this.splitContainer1.Panel1.Controls.Add(this.listView1);
            this.splitContainer1.Panel1.ForeColor = System.Drawing.SystemColors.ControlText;
            this.splitContainer1.Panel1.Paint += new System.Windows.Forms.PaintEventHandler(this.splitContainer1_Panel1_Paint);
            // 
            // splitContainer1.Panel2
            // 
            this.splitContainer1.Panel2.Controls.Add(this.ClientListView);
            this.splitContainer1.Size = new System.Drawing.Size(768, 370);
            this.splitContainer1.SplitterDistance = 303;
            this.splitContainer1.TabIndex = 3;
            // 
            // listView1
            // 
            this.listView1.BackColor = System.Drawing.SystemColors.Window;
            this.listView1.Columns.AddRange(new System.Windows.Forms.ColumnHeader[] {
            this.columnHeaderId,
            this.columnHeaderClientId,
            this.columnHeaderName,
            this.columnHeader1});
            this.listView1.Location = new System.Drawing.Point(0, 0);
            this.listView1.Name = "listView1";
            this.listView1.Size = new System.Drawing.Size(304, 370);
            this.listView1.TabIndex = 0;
            this.listView1.UseCompatibleStateImageBehavior = false;
            // 
            // columnHeaderId
            // 
            this.columnHeaderId.Text = "ID";
            // 
            // columnHeaderClientId
            // 
            this.columnHeaderClientId.Text = "Client ID";
            // 
            // columnHeaderName
            // 
            this.columnHeaderName.Text = "Name";
            // 
            // columnHeader1
            // 
            this.columnHeader1.Text = "Birthday";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.splitContainer1);
            this.Controls.Add(this.CreateClientButton);
            this.Controls.Add(this.Create);
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Pet Clinic";
            this.splitContainer1.Panel1.ResumeLayout(false);
            this.splitContainer1.Panel2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).EndInit();
            this.splitContainer1.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private Button Create;
        private Button CreateClientButton;
        private ListView ClientListView;
        private ColumnHeader ID;
        private ColumnHeader Surname;
        private ColumnHeader Firstname;
        private ColumnHeader Patrynomic;
        private ColumnHeader columnHeaderBirthday;
        private SplitContainer splitContainer1;
        private ListView listView1;
        private ColumnHeader columnHeaderId;
        private ColumnHeader columnHeaderClientId;
        private ColumnHeader columnHeaderName;
        private ColumnHeader columnHeader1;
    }
}