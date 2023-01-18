package abstractDemo;

public class CustomerManager {

    //Strategic Pattern
    BaseDatabaseManager databaseManager;
    public void getCustomers(){
        databaseManager.getData();
    }
}
