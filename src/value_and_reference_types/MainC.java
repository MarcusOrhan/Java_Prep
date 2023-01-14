package value_and_reference_types;

public class MainC {
    public static void main(String[] args) {
// Classes are REFERENCE TYPE!!! Stack=varName ===> var value,Heap=000101 (ref no);
            CustomerManager customerManager = new CustomerManager();
            CustomerManager customerManager2 = new CustomerManager();
            customerManager2=customerManager ; //  Garbage Collector removes customerManager because heap no reference for cM anymore
       customerManager.Add();
      customerManager.Remove();
      customerManager.Update();

//Primitive data types - Value     Stack=varName and value ===> heap no ref
            int sayi1 = 10;
            int sayi2 = 20;
            sayi2 = sayi1;
            sayi1 =30;
            System.out.println("sayi2 = " + sayi2);// sayi2=10

//Arrays are REFERENCE TYPE
            int[] sayilar1= new int[]{1,2,3,};
            int[] sayilar2= new int[]{100,200,300,};
            sayilar2=sayilar1;
            sayilar1[0]=42;
            System.out.println("sayilar2[0] = " + sayilar2[0]); // sayilar2[0] = 42



    }
}
