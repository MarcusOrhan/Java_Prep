package rapidIntrviewPrep;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
       String str =  "MCMXCIV";
        System.out.println(roman(str));
    }
public static int roman(String str){
    int result = 0;
    int digit = 0;
    Map<Character, Integer> keysMap = new HashMap<>();
    keysMap.put('I',1);
    keysMap.put('V',5);
    keysMap.put('X',10);
    keysMap.put('L',50);
    keysMap.put('C',100);
    keysMap.put('D',500);
    keysMap.put('M',1000);

    for (int i = str.length()-1; i < 0; i--) {

        if (keysMap.get(str.charAt(i))>= keysMap.get(str.charAt(i-1)))
           digit +=keysMap.get(str.charAt(i)-keysMap.get(str.charAt(i-1)));
        else digit = keysMap.get(str.charAt(i));
        result+= digit;
    }

       return result;
}

}
