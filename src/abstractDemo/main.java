package abstractDemo;

public class main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        //Strategy define
        customerManager.databaseManager = new MySqlDBManager();
        customerManager.databaseManager = new SqlServerDBManager();
        customerManager.databaseManager = new OracleDBManager();
        customerManager.getCustomers();
    }
}
