package arrays;

public class Arrays1 {
    public static void main(String[] args) {
        double[] myList = {1.2, 1.3, 7.3, 9.3};


double total=0;
double max = myList[0];
for(double number:myList){
    if(max<number) {
        max=number;
    }
    total=total+number;
    System.out.println("number = " + number);

}
        System.out.println("total = " + total);
        System.out.println("max = " + max);
    }
}