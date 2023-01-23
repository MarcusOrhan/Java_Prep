package reading_file_demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) {

        BufferedReader reader=null;
        int total = 0;
        try {
          reader = new BufferedReader(new FileReader("src/reading_file_demo/sayilar.txt"));
          String line = null;
          while ((line = reader.readLine()) != null) {
              total += Integer.valueOf(line);
          }
            System.out.println("total = " + total);
        } catch (Exception e) {
          e.printStackTrace();
        }finally {
            try {
                reader.close(); // added IO exception to Method signature by  throws or reader.close() wrapped in try  catch in finally
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
