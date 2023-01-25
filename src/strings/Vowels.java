package strings;

public class Vowels {
    public static void main(String[] args) {
        char harf = 'E';
//        char[] strong = new char[4];
//        strong= new char[]{'A', 'O', 'U', 'I'};
//        char[] mild = new char[4];
//        mild  = new char[]{'E', 'İ', 'Ü', 'Ö'};
//
        switch (harf) {
            case 'A':
            case 'O':
            case 'U':
            case 'I':
                System.out.println("Kalin sesli  harf = " + harf);
                break;
            case 'E':
            case 'İ':
            case 'Ü':
            case 'Ö':
                System.out.println("Ince Seesli harf = " + harf);

        }
    }
}
