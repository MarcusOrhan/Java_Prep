package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArraySort {
    public static void main(String[] args) {
        int benimGuzelArrayim []={5, 4 ,8, 42, 13, 1, 61, 2};
    //    Arrays.sort(benimGuzelArrayim);
        int ilkSayi=benimGuzelArrayim[0];
        for(int i=1; i<benimGuzelArrayim.length;i++){
            if (ilkSayi>benimGuzelArrayim[i]){
               ilkSayi= benimGuzelArrayim[i];
            }
        }
        System.out.println("En kucuk elemeani :"+benimGuzelArrayim[0]);
        System.out.println("En buyuk elemeani :"+benimGuzelArrayim[benimGuzelArrayim.length-1]);
    }
}
