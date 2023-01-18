package abstractDemo;

public class SqlServerDBManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Data  got from :  SQL sERVER dATABASE");
    }
}
