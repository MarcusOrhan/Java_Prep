package generics;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
     // a class that can allow us   to work with different types class
       // tipguvenlicalismakicin generic clasla calisiriz yani Arraylist normalde object alir ; tipine<String> yada <Integer> dersek o zaman tip guvenli calismis oluruz
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Montreal");
        sehirler.add("PhnomPenh");
        sehirler.add("Ulanbator");
        sehirler.add("Yozgat");


    }
}
