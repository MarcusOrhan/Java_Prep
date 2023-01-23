package exeption_handling;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        String sehir = "Ankara";
        int sayi = 12; // sayi = sehir ==> Error

        try {
            int[] sayilar = new int[]{1, 23, 3, 4, 5};
            System.out.println("sayilar[10] " + sayilar[10]);
        }catch(Exception exeption){
            System.out.println(" Hata olustu; fakat program calismaya devam edecek");
            System.out.println("exeption = " + exeption);
        }finally{
            System.out.println("Finally block her iki durumda da (try or catch) calisir");
            //we use finally to close the file, orconnection on database.
        }
    }
}
