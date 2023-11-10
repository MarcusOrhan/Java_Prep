package rapidIntrviewPrep;

public class Leet_ExcellColumnnumber {
    public static void main(String[] args) {
        System.out.println(columnNumber("ABC"));

    }

    public static int columnNumber(String str){
        int result = 0;
        char charNumber[] = str.toCharArray(); // A B C
        for (char each : charNumber ) {
            result = result*26 + (each-'A'+1);
        }


        return result;
    }
}
