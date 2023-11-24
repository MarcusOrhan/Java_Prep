package rapidIntrviewPrep;


public class leet1108defangIp {
    public static void main(String[]args){
        System.out.println(ipDefang("1.200.255.255.0"));
    }
    public static String ipDefang (String str){
        String result = str.replaceAll("\\.","[.]");
        return result;
    }
}
