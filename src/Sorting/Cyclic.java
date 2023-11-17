package Sorting;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        Ksort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        for (int i = 0; i <= arr.length-1; i++) {
            while(true){
                if(arr[i]==i+1){
                    break;
                }
                swap(arr,i,arr[i]-1);
            }

        }
    }
    static void Ksort(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correct = arr[i] - 1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
