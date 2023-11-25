package rapidIntrviewPrep;

public class leet14longestCommonPrefix {
    /*
    Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
     */
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
       // System.out.println("commonPrefix(str) = " + commonPrefix(str));
        System.out.println(commonLongestPrefix( str));
    }
    public static String commonLongestPrefix(String[] str){
        String prefix =str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty())
                    return "";
            }
    }
        return prefix;
    }

    public static String commonPrefix(String[]str){
        String result = "";
        for (int i = 0; i < str.length; i++) {
  for (int j = 0; j <str[i].length() ; j++) {
                if (str[i].charAt(j) == str[0].charAt(j))
                    result += str[0].substring(0,j);
                else break;
            }
        }
        return result;
    }
}
