package arraylist_demo;

import java.util.ArrayList;

public class ArrayListWithObject {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer engin = (new Customer(001,"Engin", "Demirog"));
        customers.add(engin);
        customers.add(new Customer(002,"Sezgin", "Demirog"));
        customers.add(new Customer(003,"Derin", "Demirog"));


        customers.remove(engin); //reference type

        for (Customer customer: customers) {
            System.out.println("customer.firstName = " + customer.firstName);
        }
    }
}
