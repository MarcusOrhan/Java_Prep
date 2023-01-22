package arraylist_demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTypedDemo {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ankara");
        cities.add("Istanbul");
        cities.add("Izmir");
        cities.add("Bursa");
        
        cities.remove("Istanbul");
        Collections.sort(cities);
        for (String city:cities
             ) {
            System.out.println("city = " + city);
            
        }
    }
}
