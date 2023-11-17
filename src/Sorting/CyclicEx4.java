package Sorting;
//findDuplicate

import java.util.ArrayList;

public class CyclicEx4 {
    public static void main(String[] args) {
        int[] arr = {4,2,3,3,3,2,1,7,4};
        System.out.println(dup(arr));

    }
    static ArrayList<Integer> dup(int[] arr){
        ArrayList<Integer>list = new ArrayList<>();
        for (int i = 0; i <= arr.length-1 ; i++) {
            while(true){
                if(arr[i] == i+1){
                    break;
                }
                if(arr[i] == arr[arr[i]-1]) {
                    if (list.contains(arr[i])) {
                        break;

                    } else {
                        list.add(arr[i]);
                        break;
                    }
                }

                swap(arr,i,arr[i]-1);
            }

        }return list;
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
