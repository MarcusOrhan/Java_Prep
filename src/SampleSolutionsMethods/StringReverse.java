package SampleSolutionsMethods;

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

}




