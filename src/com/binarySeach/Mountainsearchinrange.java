package com.binarySeach;

public class Mountainsearchinrange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        int target = 3;
        int peak = binary(arr);
        int ans = search(arr,target,0,peak-1);
        if (ans != -1) {
            System.out.println(ans);

        }else{
            int Ans = search(arr,target,peak+1,arr.length-1);
            System.out.println(Ans);
        }

    }
    static int search(int[] nums,int Target,int start,int end){
            boolean asc = start<end;
            while(start<=end) {
                int mid = start + (end - start) / 2;
                if (asc) {
                    if (Target > nums[mid]) {
                        start = mid + 1;
                    } else if (Target < nums[mid]) {
                        end = mid - 1;
                    } else {
                        return mid;

                    }
                }else{
                        if (Target > nums[mid]) {
                            end = mid - 1;
                        } else if (Target < nums[mid]) {
                            start = mid + 1;
                        } else {
                            return mid;
                        }
                    }



                }
            return -1;
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
        }return start;

    }

}

