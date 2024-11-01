using HW10ServiceNamespace;
namespace HW10Desktop
    

{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Create_Click(object sender, EventArgs e)
        {
            HW10SwaggerClient swaggerClient = new HW10SwaggerClient("http://localhost:5174", new HttpClient());

            ICollection<Client> clients =  swaggerClient.ClientGetAllAsync().Result;

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

        private void button1_Click(object sender, EventArgs e)
        {
            HW10SwaggerClient swaggerClient = new HW10SwaggerClient("http://localhost:5174", new HttpClient());

            swaggerClient.ClientCreateAsync();
        }
    }
}