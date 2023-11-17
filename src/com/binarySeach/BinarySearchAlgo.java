package com.binarySeach;

import java.util.Arrays;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,4,4,4,4,4,4,5,6,8};
        int target = 2;
        int ans = binary(arr,target);
        System.out.println(ans);

    }


    static int binary(int[] nums,int Target){
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(Target>nums[mid]){
                start = mid+1;
            }
            else if(Target<nums[mid]){
                end = mid-1;
            }
            else{

                return mid;



            }

        }
        return -1;



        }

    }

