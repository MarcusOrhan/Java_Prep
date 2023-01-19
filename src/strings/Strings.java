package strings;

import SampleSolutionsMethods.StringReverse;

import java.util.Arrays;

public class Strings {
    public static String spinWords(String mesaj) {
        String result;
      //  mesaj = "  Su anda mesaj kutunuza  dusen 72 yeni okunmamis mesajiniz bulunmaktadir.";

        //split mesaj " "
        //aw worrds in array[]
        // if words >5
        //reverse
        //return new mesaj

        String[] words = mesaj.split(" ");
        String changedWord = "";
        String newMessage = "";
String oldWord="";
        if (words.length < 2 && words[0].length() < 5) {
            result = mesaj;
        } else {
            for (String word : words) {
                if (word.length() < 5) {
                    oldWord=word;
                    newMessage += oldWord+" " ;
                } else {
                    changedWord = StringReverse.reverseString(word);
                    newMessage += changedWord+" " ;
                }
            }
            result = newMessage;
        }
        System.out.println(newMessage);
        return result;
    }


    public static void main(String[] args) {


        String mesaj = "  Su anda mesaj kutunuza  dusen 72 yeni okunmamis mesajiniz bulunmaktadir.";
spinWords(mesaj);
//        System.out.println("mesaj = " + mesaj);
//        System.out.println("eleman sayisi" + mesaj.length());
//        System.out.println("5. karakter : " + mesaj.charAt(5));
//        System.out.println("mesaj.concat() = " + mesaj.concat(" Okunmus yeni mesajiniz bulunmamaktadir"));
//        System.out.println(mesaj.startsWith("S"));
//        System.out.println(mesaj.endsWith("."));
//        char[] karakterler = new char[6];
//        mesaj.getChars(0, 6, karakterler, 0);
//        System.out.println("karakterler = " + Arrays.toString(karakterler));
//        System.out.println("indexOf = " + mesaj.indexOf("mesaj"));
//        System.out.println("LastindexOFmesaj = " + mesaj.lastIndexOf("mesaj"));
//
//        String yeniMesaj = mesaj.replace(" ", "_");
//        System.out.println("yeniMesaj = " + yeniMesaj);
//        System.out.println("Yeni mesaj i * replace etmek = " + yeniMesaj.replace("_", "**"));
//        System.out.println("Substring mesaj = " + mesaj.substring(13, 23));
//
//        for (String kelime : mesaj.split(" ")) {
//            System.out.println("kelime = " + kelime);
//        }
//        System.out.println("mesaj toUpperCase = " + mesaj.toUpperCase());

  }

}
