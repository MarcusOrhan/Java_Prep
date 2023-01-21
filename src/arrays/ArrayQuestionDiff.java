package arrays;

import java.util.ArrayList;

public class ArrayQuestionDiff {
    public static Object[] arrayDiff(int[] a, int[] b) {
        // Your code here
        //loop in array b
        // if b[i] present in another loop a[j] add it to c[]
        // assign c to a a=c and

        ArrayList c = new ArrayList();


        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] == (a[j])) {
                   c.add(a[j]);

                }
            }

        }

        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }
        return c.toArray();
    }

    public static void main(String[] args) {
        int[] a={1,2,2,3,4,5};
        int[] b={2,3};
arrayDiff(a,b );
    }
}

