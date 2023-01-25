package SampleSolutionsMethods;

public class MukemmelSayi {
    public static void main(String[] args) {


        int num = 1;
        int total = 0;

        for (int i=1; i<num; i++){
            if(num % i == 0){
                total=total+i;
            }
        }
        System.out.println("total = " + total);
        if (total==num){
            System.out.println("This number = " + num+ " is a perfect number");
        }else {
            System.out.println("number = " + num+" is NOT a perfect number");
        }
    }
}