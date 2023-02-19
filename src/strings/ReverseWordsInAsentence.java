package strings;

public class ReverseWordsInAsentence {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";
        for (String word : words) {
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            result += reversed + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String s = "Today I am very happy";
        System.out.println(reverseWords(s));
    }
}
