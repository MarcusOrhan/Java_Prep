package sampleproject1;

import java.util.Scanner;

public class QuotaCalculator {

    //initialize known values
    //get unknown values
    //decide to take output

    public static void main(String[] args) {
        //initialize known values
        int quota = 10;

        //get unknown values
        System.out.println("Enter the number of sales done this week ");
        Scanner scan = new Scanner(System.in);
        int sales = scan.nextInt();
        scan.close();

        //decide to take output
        if (sales >= quota) {
            System.out.println("Congratulations! This week your sales  " + sales + " met the quota of " + quota);
        } else {
            int salesShort = quota - sales;
            System.out.println(" Sorry You did'nt make it this time. You were "+ salesShort + " sales short. "  );

        }
    }
}
