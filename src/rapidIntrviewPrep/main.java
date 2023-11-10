package rapidIntrviewPrep;

public class main {
    public static void main(String[] args) {
        String text = "adida";
        StringBuffer sb= new StringBuffer(text);
        System.out.println();
        if (text.equals(sb.reverse())){
            System.out.println(text+"  is a Palindrome");
        }
        else
        System.out.println( text + " NOT a Palindrome");
    }
}
