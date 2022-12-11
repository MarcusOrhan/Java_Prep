package SampleSolutionsMethods;

public class SwapNumbersNoTmp {
    public static void main(String[] args) {
        //swap two numbers without using a temporary variable
        int a = 100;
        int b = 3;
        System.out.println("b= " + b+ ";   a= "+a);
        b = (a+b)-(a=b);
        System.out.println("b NEW= " + b + "\na NEW= "+a);

    }
    /*
    * Method 2
    * a= a^b^(b=a);
    *
    *
    * Method 3
    * a += b - (b = a)
    * */

}
