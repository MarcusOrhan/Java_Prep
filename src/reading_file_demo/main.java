package reading_file_demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=null;
        try {
          reader = new BufferedReader(new FileReader("src/reading_file_demo/sayilar.txt"));
        } catch (FileNotFoundException e) {
          e.printStackTrace();
        }finally {
            reader.close(); // added IO exception to Method signature by  throws or reader.close() wrapped in try  catch in finally
        }
    }
}
