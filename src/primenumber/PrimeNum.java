package primenumber;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        int reminder = number%2;
//psedo isPrime (if (num/2   for())
        if (number==1){
            System.out.println("number one is not prime= " + number);
            return;
        }
boolean isPrime=true;
         for(int i=2;i<number;i++){
           if  (number%i==0) {
               isPrime=false;
           }
         }
        if (isPrime){
            System.out.println("Its a PRIME number = " + number);
        }else{
            System.out.println("NOT a PRIME number = " + number);
        }
    }
}

