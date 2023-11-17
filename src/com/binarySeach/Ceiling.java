package com.binarySeach;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8,10,12,14};
        int target = -1;
        int ans = ceiling(arr,target);
        System.out.println(ans);


    }


    static int ceiling(int[] nums , int target){
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(target==nums[mid]){
                return target;
            }
            if(target<nums[s]){
                return nums[s];
            }
            if(target>nums[e]){
                return nums[e];
            }
            if(target>nums[mid] && target<nums[mid+1]){
                return nums[mid+1];
            }
            if(target>nums[mid]){
                s = mid+1;
            }else if(target<nums[mid]){
                e = mid-1;

        }
    }return -1;
}
}
