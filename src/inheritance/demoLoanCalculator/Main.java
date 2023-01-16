package inheritance.demoLoanCalculator;

public class Main {
    public static void main(String[] args) {
//        EducationLoanManager educationLoanManager = new EducationLoanManager();
//        educationLoanManager.Calculate();
        LoanUI loanUI = new LoanUI();
        loanUI.CalculateLoan(new VeteranLoanManager());//Polymorphism
    }
}
