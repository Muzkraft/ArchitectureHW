
using PetClinicNamespace;

namespace HW10Desktop
    

{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Update_Click(object sender, EventArgs e)
        {
            ClinicClient swaggerClient = new ClinicClient("http://localhost:5174", new HttpClient());

            ICollection<Client> clients = swaggerClient.ClientGetAllAsync().Result;

            ClientListView.Items.Clear();
            foreach(Client client in clients)
            {
                ListViewItem item = new ListViewItem();
                item.Text = client.ClientId.ToString();
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = client.Surname
                });
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = client.FirstName
                });
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = client.Patronymic
                });
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = client.Birthday.ToString()
                });
                ClientListView.Items.Add(item);
            }
        }

        private void listView1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void splitContainer1_Panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void Create_Click(object sender, EventArgs e)
        {
            ClinicClient swaggerClient = new ClinicClient("http://localhost:5174", new HttpClient());

            
        }
        /*
        private void UpdatePet_Click(object sender, EventArgs e)
        {
            ClinicClient swaggerClient = new ClinicClient("http://localhost:5174", new HttpClient());

            var pets = swaggerClient.GetAllPetsAsync().Result;

            PetListView.Items.Clear();
            foreach (var pet in pets)
            {
                ListViewItem item = new ListViewItem();
                item.Text = pet.PetId.ToString();
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = pet.Name
                });
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = pet.Birthday.ToString()
                });
                PetListView.Items.Add(item);
            }
        }
        */
    }
}