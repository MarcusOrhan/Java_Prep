package SampleSolutionsMethods;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int [] arr = {5, 6, 76, 31, 43, 1};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

    }

}
