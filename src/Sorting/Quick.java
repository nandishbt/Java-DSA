package Sorting;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {

        int[] nums = {9,8,7,1,2,100,55,3,4,6,5};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
    static void sort(int[] arr,int low,int hi){
        if(low>=hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = (s+e)/2;
        int pivot = arr[m];
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;

            }
        }sort(arr,0,e);
        sort(arr,s,hi);

    }
}
