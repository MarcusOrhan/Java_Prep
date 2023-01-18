package interfaces;
//multiple interfaces may be implemented by a class whereas only one abstract is extended by a class.
public class MySqlCustomerDal implements ICustomerDal, IRepository{
    @Override
    public void add() {
        System.out.println(" MySQL DAl ADDED");
        System.out.println(" MySQL DAl ADDED");

    }
}
