public class Main {

    public static void main(String[] args) {
        int sayi1 = 42;
        int sayi2 = 5;
        int sayi3 = 123;

int enbuyuk=sayi1;
if (sayi1<enbuyuk){
    enbuyuk=sayi2;
} if (sayi2<enbuyuk) {
    enbuyuk=sayi3;
}

        System.out.println("enbuyuk = " + enbuyuk);
    }
}
