package com.binarySeach;

public class FloorK {
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,8};
            int target = 7;
            int ans = floor(arr,target);
            System.out.println(ans);

        }
        static int floor(int[] nums,int Target){
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
                    return mid;


                }

            }return nums[e];




        }

    }



