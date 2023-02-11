package arrays;

import java.util.Arrays;

public class ArrayFirstTwo {
    public static void main(String[] args) {
        int [] arr = {5, 6, 76, 31, 43, 1};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        for(int i=0; i<=arr.length-1 ; i++){
            if (arr[i]%2==0) {
                System.out.println("arraydaki cift sayi:  " + arr[i]);
            }
        }
        for(int i=1; i<arr.length-3 ; i++){
            System.out.print(" yazdiran array " + arr[i]+",");

        }
    }

}
