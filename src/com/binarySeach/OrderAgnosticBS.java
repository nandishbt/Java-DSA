package com.binarySeach;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] Arr = {10,9,8,7,6,5,4,3,2,1,0};
        int target = 6;
        int ans = OrderBs(Arr, target);
        System.out.println(ans);


    }


    static int OrderBs(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        boolean asc = nums[start] < nums[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (asc) {
                if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
