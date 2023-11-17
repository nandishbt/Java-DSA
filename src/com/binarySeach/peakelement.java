package com.binarySeach;

public class peakelement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,54,3,2,1};
        System.out.println(binary(arr));

    }
    static int binary(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start!=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
        }return arr[start];

    }

}
