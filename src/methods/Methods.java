package methods;


public class Methods {
    public static void main(String[] args) {
        String message ="Bugun hava cok guzel";
        String yeniMessage = sehirVer();
        System.out.println("yeniMessage = " + yeniMessage);
        int sayi = add(5,8);
        System.out.println("sayi = " + sayi);
    }
    public static void sayiBumlmaca(){
int sayilar[]= new int[]{1,2,3,5,10,7,9,0};
int aranacak = 6;
boolean varMi= true;

        for (int sayi:sayilar) {
            if( sayi == aranacak){
                varMi=true;
                break;
            }
        }
        String message= "";
        if(varMi) {
            message =aranacak+ " :Sayi mevcut";
            mesajVer(message);
        }else {
            mesajVer(aranacak+"Sayisi  mevcut degildir");
        }
    }
    public static void mesajVer(String message){
        System.out.println("message = " + message);

    }





    public static void ekle(){

    }
    public static void delete(){

    }
    public static void update(){
        System.out.println("Updated");
    }
    public static int add(int sayi1, int sayi2){
        return sayi1+sayi2;

    }
    public static String sehirVer(){
return "Ottawa";
    }
}
