package if_else_if;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        //Get the Test Score
        System.out.println("Enter your test score:");
        Scanner scan = new Scanner(System.in);
        double score = scan.nextDouble();
        scan.close();

        // determine the letter grade
        char grade;
        if (score<60){
            grade = 'F';
        }else if (score<70){
            grade = 'D';
        }else if (score<80){
            grade = 'C';
        }else if (score<90){
            grade = 'B';

        }else{
            grade = 'A';
        }
        System.out.println("Your grade is = " + grade);
    }
}
