package arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "Istanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Canakkale";
        sehirler[1][0] = "Yozgat";
        sehirler[1][1] = "Nigde";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Adana";
        sehirler[2][1] = "Hatay";
        sehirler[2][2] = "Oamaniye";
        for(int i = 0; i<= sehirler.length-1;i++){
            System.out.println("*******======================******");
            for(int j = 0; j<=2; j++){
                System.out.println(sehirler[i][j]);
            }
        }


    }
}
