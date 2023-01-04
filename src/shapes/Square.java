package shapes;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.println("Emter a number: ");
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        for (int i = 0; i < number; i++) {
  for(int j=0;j<=number;j++){
      System.out.print("* ");// print astarisk row = columns
  }
            System.out.println();// end of each row
        }
    }
}
