package SampleSolutionsMethods;

public class PrimeNumber {
    public static void main(String[] args) {

      //  checkPrime(6);
        isPrime(22);
    }
    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n +" is NOT a prime number ");
                return false;
            }
        }
        System.out.println(n +" is a prime number ");
        return true; }

    public static void isPrime(int number) {
        int i,m=0,flag=0;
        int n=number;//it is the number to be checked
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number");
            }
        }//end of else
    }
}




