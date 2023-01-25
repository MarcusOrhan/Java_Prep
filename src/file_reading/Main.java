package file_reading;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


    }

    public static void createFile(){
        File file = new File("C:\\Users\\glnsb\\Desktop\\mesut\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya olusturuldu");
            }else{
                System.out.println("Dosya olusturulamadi Maalesf yaada dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
