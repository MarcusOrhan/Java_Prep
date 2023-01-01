package shapes;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println(" Enter the number for print: ");
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        starPrinter(number);

    }

    public static void starPrinter (int number) {
        int i,j;
        for(i=0;i<number;i++){
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
