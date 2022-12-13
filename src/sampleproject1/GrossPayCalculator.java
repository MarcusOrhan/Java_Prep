package sampleproject1;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        //Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //get the hourly pay rate
        System.out.println("Enter the employee's pay rate: ");
        double rate = scanner.nextDouble();
        scanner.close();

        //multiply hours by pay rate
        double grossPay = hours*rate;

        //display result
        System.out.println("employee's grossPay $= " + grossPay);
    }
}
