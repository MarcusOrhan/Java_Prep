package overloading;

public class Operations {
    public int add(int num1, int num2 ){
        return num1+num2;
    }
    public static int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public double add(double sayi1, double sayi2){
        return (int) (sayi1+sayi2);
    }


    public static void main(String[] args) {
Operations operations = new Operations();
operations.add(5,7);
operations.add(1,2,3);
operations.add(12.5, 22.0);
    }
}


