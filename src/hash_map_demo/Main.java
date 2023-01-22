package hash_map_demo;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> sozluk= new HashMap<String, String>();
        sozluk.put("Book", "Kitap");
        sozluk.put("Booklet", "Kitapçık");
        sozluk.put("Book Shelf", "Kitaplık");
        sozluk.put("Book store", "Kitapçı");
        System.out.println(sozluk.size());
        for (String item: sozluk.keySet()
             ) {
            System.out.println("item = " + item+ ", Value = "+sozluk.get(item));
        }

        sozluk.remove("Book");

        System.out.println("sozluk = " + sozluk.get("Booklet"));
        System.out.println( sozluk.get("Book"));//null
    }
}
