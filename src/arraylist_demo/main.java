package arraylist_demo;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        numbers.add(1);
        numbers.add(100);
        numbers.add("Istanbul");
       // System.out.println("numbers.size() = " + numbers.size());
        System.out.println(numbers.get(0));
        numbers.set(2,42);
//        numbers.remove(0);
//        numbers.clear();
        for(Object i:numbers){
            System.out.println("i = " + i);
        }
    }
}
