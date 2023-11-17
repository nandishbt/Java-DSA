package Sorting;
//find missing elements

import java.util.ArrayList;
import java.util.Arrays;

public class CyclicEx2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,5,3,6,7};
        System.out.println(search(arr));

    }
    static ArrayList<Integer> search(int[] arr){
        ArrayList<Integer>list = new ArrayList<>();
        sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=i+1){
                list.add(i+1);
            }


        }
        return  list;
    }
    static void sort(int[] arr){
        for (int i = 0; i <= arr.length-1; i++) {
            while(true){
                if(arr[i]==i+1){
                    break;
                }
                if(arr[i] == arr[arr[i]-1] ){
                    break;
                }

                swap(arr,i,arr[i]-1);
            }

        }
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
