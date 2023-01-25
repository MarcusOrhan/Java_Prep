package file_reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

getFileInfo();
readFile();
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

    public static void getFileInfo(){
        File file = new File("C:\\Users\\glnsb\\Desktop\\mesut\\students.txt");
        if(file.exists()){
            System.out.println("file name- dosya adi: " + file.getName());
            System.out.println("file path - dosya yolu: " + file.getAbsolutePath());
            System.out.println("can file readable - dosya okunabilir : " + file.canRead());
            System.out.println("can file writable - dosya yazilabilir  : " + file.canWrite());
            System.out.println("file name size - dosya boyutu: (Byte) " + file.length());
        }
    }

    public static void readFile(){
        File file = new File("C:\\Users\\glnsb\\Desktop\\mesut\\students.txt");

        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println("line = " + line);
                reader.close();
            }
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }


    }

}
