public class Main {

    public static void main(String[] args) {
//        int sayi1 = 42;
//        int sayi2 = 5;
//        int sayi3 = 123;
//
//int enbuyuk=sayi1;
//if (sayi1<enbuyuk){
//    enbuyuk=sayi2;
//} if (sayi2<enbuyuk) {
//    enbuyuk=sayi3;
//}
        //   System.out.println("enbuyuk = " + enbuyuk);


        int n = 493193 ;
        int lastDigit = n % 10;
        int rest = n / 10;
        int subTotal = lastDigit;
        int result = 0;
        while (rest > 0) {
            lastDigit = rest % 10;
            subTotal += lastDigit;
            rest = rest / 10;
        }
        if (subTotal >= 10) {
            rest = subTotal/10;
            lastDigit= subTotal%10;
            subTotal=0;
            while (rest > 0) {
                subTotal += lastDigit;
                lastDigit=rest%10;
                rest = rest / 10;
                result= lastDigit+rest;
            }
            System.out.println("subtot = " + subTotal+ ", result: "+result);

        } else {
           //subTotal= addDig(subTotal);
           result= lastDigit+rest;
          System.out.println("subtotal = " + subTotal+ "  resultas: "+result);
        }
    }
    public static int addDig(int a) {
        int lastDigita = a % 10;
        int resta = a / 10;
        int subTotala = lastDigita;
do { lastDigita = resta % 10;
    subTotala += lastDigita;
    resta = resta / 10;

} while (resta >= 1);

        return subTotala;
    }
}



