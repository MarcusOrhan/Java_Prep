package inheritance;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();


        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        employeeManager.bestEmployeeOfTheMonth("you");//from its own EmployeeManager
        employeeManager.list();// inherited from PersonManager Class
        customerManager.add();// inherited from PersonManager Class

    }
}
