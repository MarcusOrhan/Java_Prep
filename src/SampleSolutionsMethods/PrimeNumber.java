package SampleSolutionsMethods;

public class PrimeNumber {
    public static void main(String[] args) {
        checkPrime(6);
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
}
