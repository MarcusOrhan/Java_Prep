package working_with_files;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        writeFile();
        readFile();
        //getFileInfo();
    }
    public static void createFile() {
        File file = new File("C:\\Users\\glnsb\\Desktop\\mesut\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya olusturuldu");
            } else {
                System.out.println("Dosya olusturulamadi Maalesf yaada dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\Users\\glnsb\\Desktop\\mesut\\students.txt");
        if (file.exists()) {
            System.out.println("file name- dosya adi: " + file.getName());
            System.out.println("file path - dosya yolu: " + file.getAbsolutePath());
            System.out.println("can file readable - dosya okunabilir : " + file.canRead());
            System.out.println("can file writable - dosya yazilabilir  : " + file.canWrite());
            System.out.println("file name size - dosya boyutu: (Byte) " + file.length());
        }
    }

    public static void readFile() {
        File file = new File("C:\\Users\\glnsb\\Desktop\\mesut\\students.txt");

        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println("line = " + line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        try {

            //  FileWriter fileWriter = new FileWriter("C:\\Users\\glnsb\\Desktop\\mesut\\students.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\glnsb\\Desktop\\mesut\\students.txt"));
            writer.newLine();
            writer.write("Muhammad Ali Clay \uD83D\uDE0E");
            writer.newLine();
            writer.write("Marcus \uD85D\uDE5E");
            writer.newLine();
            writer.write("Jasmine \uD85D\uDE6E");
            writer.newLine();
            writer.write("Betsy \uD85D\uDE7E");
            writer.newLine();
            writer.write("Isabell \uD85D\uDE8E");
            writer.newLine();
            writer.write("Elizabeth \uD85D\uDE9E");
            System.out.println(" student Dosyasina ;; eklendi");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
