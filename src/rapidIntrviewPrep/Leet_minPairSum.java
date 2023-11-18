package rapidIntrviewPrep;

import java.util.Arrays;

public class Leet_minPairSum {
    public static void main(String[] args) {

    }

    /*
    logic of solution
    1- sort
    2-in for loop pair max and min (first and last) until n/2
    3-put new pairs in Array List [][]
    4-find sum of each member in a sorted list
    5-return output as list[0] which is the max.
     */

    public int minPairSum(int []nums ){

        int output = 0;
        Arrays.stream(nums).sorted();

        return output;
    }
}
