package nested_If;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
       //initialize known
        int requiredSalary = 60000;
        int requiredYears = 5;
        //get unknown
        System.out.println("Enter your salary:");
        Scanner scan = new Scanner(System.in);
        double salary = scan.nextDouble();

        System.out.println("Enter the numbers of years you worked with current employer");
        double years = scan.nextDouble();
        scan.close();

       //decision making

        if (salary>= requiredSalary){
            if (years>=requiredYears){
                System.out.println("Congratulations!! You are qualified for the loan");
            }
            else{
                System.out.println(" Sorry, you must have worked at your current employer" +
                        " at least "+requiredYears+" years.");
            }
        }
        else{
            System.out.println("Sorry!  You must earn minimum requiredSalary = " + requiredSalary+" to qualify for the loan.");
        }

    }

}
