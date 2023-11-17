package com.LinearSearchAlgorithm;

public class LinearSearcinrange {
    public static void main(String[] args) {


        int[] arr = {1, 25, 24, 36, 78, 31, 54, 63};
        int target = 24;
        int ans = linear(arr, target,2,5);
        System.out.println(ans);
    }

    static int linear(int[] nums, int Target ,int start,int end) {
        if (nums.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {

            if (nums[i] == Target) {
                return Target;
            }


        }

        return -1;
    }
}
