package com.binarySeach;

public class Rotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,6,6,6,6,6,6,6,6,7,0,1,2,3};
        int target = 2;
        int peak = findpeakduplicate(arr);
        int ans = binary(arr,target,0,peak);
        if(ans!=-1){
            System.out.println(ans);
        }
        else{
            int Ans = binary(arr,target,peak+1,arr.length - 1);
            System.out.println(Ans);
        }

    }
    static int findpeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start!=end){
            int mid = start +(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;}
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }




        }return -1;

    }
    static int findpeakduplicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start!=end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]){
                return end;}

                end--;

        } if(arr[start]>arr[mid]||arr[start]==arr[mid]&&arr[mid]>arr[end]){
                end = mid-1;

            }else{
                start = mid+1;
            }




        }return -1;

    }



    static int binary(int[] nums,int Target,int start,int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (Target > nums[mid]) {
                start = mid + 1;
            } else if (Target < nums[mid]) {
                end = mid - 1;
            } else {

                return mid;


            }

        }return -1;
    }
}
