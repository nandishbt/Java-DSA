package com.binarySeach;

public class ceilingK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8};
        char[] Arr = {'a','b','g','h'};
        char Target ='b';
        int target = 7;
        char ans = ceiling(Arr,Target);
        System.out.println(ans);

    }
    static char ceiling(char[] nums,char Target){
        int s = 0;
        int e = nums.length-1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(Target == nums[0]){
                return nums[e];
            }
            if(Target<nums[mid]){
                e = mid-1;
            }
            else if(Target>nums[mid]){
                s = mid+1;
            }
            else {
                e = mid-1;
            }





        }return nums[e % nums.length];




    }

}


