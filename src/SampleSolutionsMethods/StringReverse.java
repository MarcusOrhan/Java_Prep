package SampleSolutionsMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringReverse {
//reverse string with for loop
    public static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
//reverse string with StringBuilder.reverse()
    public static String reverseSB(String str) {
        String reverse_sb = "";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
        reverse_sb = sb.reverse().toString();
        return reverse_sb;
    }
//reverse String with Char array
    public void charReverse(char[] letters, int size){
        for (int i = letters.length-1; i >= 0 ; i--){
        System.out.print(letters[i]);
        }
    }

    //ReverseString ArrayList-Iterator
    public static String reverseStringArrayListIterator(String input){
        List<Character> arrList= new ArrayList<>();
        for(char c:input.toCharArray()){
            arrList.add(c);
            Collections.reverse(arrList);

            Object[] arr2 = arrList.toArray();
            String reverse="";
            for(int i = 0; i <arr2.length; i++) {
                reverse += arr2[i];
            }
            System.out.println(reverse);
            return reverse;
        }
    }

}




