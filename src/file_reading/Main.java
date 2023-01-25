package file_reading;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("Users\\glnsb\\Desktop\\mesut\\students.txt");
        try {
           if (file.createNewFile()) {
               System.out.println("Dosya olusturuldu");
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
