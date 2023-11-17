package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxindex = getmax(arr, 0, last);
            swap(arr, maxindex, last);

        }
    }
        static int getmax(int[] arr,int start,int end){
        int max = start;
            for (int i = 0; i <=end ; i++) {
                if(arr[i]>arr[max]){
                    max = i;
                }

            }return max;
    }
        static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        }

}
