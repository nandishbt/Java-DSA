package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,25,11,15,13};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr){
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 1; j <= arr.length - 1-i; j++) {//after first pass that is after i=0 ,we are getting last element
                if(arr[j]>arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

            }


        }
    }
}
