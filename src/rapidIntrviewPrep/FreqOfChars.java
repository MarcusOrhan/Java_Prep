package rapidIntrviewPrep;

import java.util.HashMap;
import java.util.Map;

public class FreqOfChars {

    public static void main(String[] args) {
    String str = "aabcccdddaaaaac";
    //find  the occurances of chars output a6b1c4d2
    // output : a2b1c3d2a4c1
    }
public static String countChars(String str){

    Map<Character, Integer> hMap = new HashMap<>();
    for (char ch :str.toCharArray()){
        hMap.put(ch,hMap.getOrDefault(ch,0)+1);
    }
    System.out.println(hMap);
    StringBuilder sb = new StringBuilder();
    for (Map.Entry<Character, Integer> entry: hMap.entrySet()){
        sb.append(entry.getKey()).append(entry.getValue());
    }
    return sb.toString();
}
    public static String countCharAndWrite(String str){
        int left = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int right = 0; right < str.length(); right++) {
            if(str.charAt(left)==str.charAt(right)){
                count++;
            }else{
                sb.append(str.charAt(left)).append(count);
                left=right;
                count=1;
            }
        }
        return sb.append(str.charAt(left)).append(count).toString();
    }
}

