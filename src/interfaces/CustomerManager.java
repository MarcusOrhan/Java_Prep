package interfaces;

public class CustomerManager {
   private ICustomerDal customerDal;
    // not a suggested way. may be  forgetten easily

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add() {
        // bussiness codes - is kodlari
        customerDal.add();

    }
}
