package com.binarySeach;

import java.util.Arrays;

public class PositionOfElement{
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,4,4,4,4,4,4,5,6,8};
        int target = 2;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[] nums,int target){
        int[] ans = {-1,-1};
        ans[0] = binary(nums,target,true);
        ans[1] = binary(nums,target,false);
        return ans;
    }
    static int binary(int[] nums,int Target,boolean start){
        int ans = -1;
        int s = 0;
        int e = nums.length-1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(Target>nums[mid]){
                s = mid+1;
            }
            else if(Target<nums[mid]){
                e = mid-1;
            }
            else{
                ans = mid;
                if(start){
                    e = mid-1;
                }else{
                    s = mid+1;
                }



            }

        }
        return ans;



    }

}

