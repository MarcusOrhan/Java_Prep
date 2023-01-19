package interfaces;

public class main {
    public static void main(String[] args) {
        // ICustomerDal customerDal = new MySqlCustomerDal();
        // customerManager.customerDal = new OracleCustomerDal();
CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());

customerManager.add();
    }
}
