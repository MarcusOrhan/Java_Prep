package interfaces;

public class main {
    public static void main(String[] args) {
    //    ICustomerDal customerDal = new MySqlCustomerDal();
CusomerManager cusomerManager = new CusomerManager();
cusomerManager.customerDal = new OracleCustomerDal();
cusomerManager.add();
    }
}
