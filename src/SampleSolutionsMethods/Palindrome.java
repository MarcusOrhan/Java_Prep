package SampleSolutionsMethods;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a text: ");
        String str = scan.nextLine();
        isPalindrome(str);
    }
    public static void isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
       if (sb.reverse().toString().equals(str)) {
           System.out.println(str +" is a Palindrome");
       }else {
           System.out.println( str + " is Not a Palindrome");
       }
    }

    public static boolean isPalindromeCharAt(String str){
        int head = 0;
        int tail = str.length() - 1;
        while (head < tail) {
            if (str.charAt(head) != str.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }
        return true;

    }
}
