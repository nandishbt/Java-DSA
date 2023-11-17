package com.LinearSearchAlgorithm;

public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {1,25,24,36,78,31,54,63};
        int target = 31;
        int ans = linear(arr,target);
        boolean anss = linear2(arr,target);
        System.out.println(ans);
        System.out.println(anss);
    }
    static int linear(int[] nums, int Target){
        if (nums.length == 0){
            return -1;}
        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == Target){
                return i;
                }


            }

        return -1;
        }
    static boolean linear2(int[] nums, int Target){
        if (nums.length == 0){
            return false;}
        for(int i = 0; i < nums.length; i++) {
            int ele = nums[i];
            if(ele == Target){
                return true;
            }


        }

        return false;
    }


    }

