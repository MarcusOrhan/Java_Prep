package value_and_reference_types;

public class CustomerManager {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
//        customerManager.Add();
//        customerManager.Remove();
//        customerManager.Update();

//Primitive data types - Value
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 =30;
        System.out.println("sayi2 = " + sayi2);// sayi2=10


        int[] sayilar1= new int[]{1,2,3,};

    }

}
