package swithc;

import java.util.Scanner;

public class SwitchStatement {
    /*If situation A occurs, do something.
    Else if situation B occurs, do something else.
    Else if situation C occurs, do something else.
    When a user enters his/her letter grade( and using a switch statement)
    print out a message letting them know how they did.*/

    public static void main(String[] args) {
        System.out.println("Enter your letter grade: ");
        Scanner scan = new Scanner(System.in);
        String grade =scan.next();
        scan.close();

        String message;

        switch(grade){
            case "A":
                message = "Excellent job1";
                break;
            case "B":
                message = "You're doing great job";
                break;
            case "C":
                message = "Good Job";
                break;
            case "D" :
                message = "You need improvement ";
                break;
            case "F":
                message = "Failed, Try again";
                break;
            default:
                message = "Error! Invalid entry";
                break;
        }
        System.out.println("message = " + message);


    }

}
