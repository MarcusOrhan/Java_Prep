package SampleProject1;

public class Main {
    public static void main(String[] args) {
        FourOperations fourOperations = new FourOperations();
        int result = fourOperations.add(11,13);
        System.out.println("result = " + result);
        int resultOfSubs = fourOperations.substract(100,200);
        System.out.println(resultOfSubs);
    }
}
