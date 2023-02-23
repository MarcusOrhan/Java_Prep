package arrays;

import java.util.ArrayList;
import java.util.List;

public class Yavuz {
    public static void main(String[] args) {
//An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
//Given an array arr[] of size N, Return the all peak elements.

int[] arr ={15,4,5,2, 13}; // bunu eklersen calisir

        List<Integer> peakelement = new ArrayList<>();
        for (int i = 1; i < arr.length-1;i ++ ){
            if (arr[i]> arr[i-1] && arr[i]> arr[i+1]){
                peakelement.add(arr[i]);
            }
        //
    }
        Vehicle y = new Car(20);
        System.out.println(y);
}

}
// Question 13
class Vehicle{
    int x;
    Vehicle(){
        this(10);
    }
    Vehicle(int x){
        this.x = x;
    }
}
class  Car extends Vehicle{
    int y;
    Car() {
        super(10);
    }
    Car(int y){
        super(y);
        this.y=y;
    }
    public String toString(){
        return super.x+" : "+this.y;
    }
}

