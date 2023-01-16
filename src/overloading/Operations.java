package overloading;

public class Operations {
    public int add(int num1, int num2 ){
        return num1+num2;
    }
    public int add(int num1, int num2, int num3 ){
        return num1+num2;
    }


    public static void main(String[] args) {
Operations operations = new Operations();
operations.add(5,7);
operations.add(1,2,3);
    }
}


