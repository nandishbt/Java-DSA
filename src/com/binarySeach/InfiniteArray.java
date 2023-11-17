package com.binarySeach;
// to find index of an elemnent in an infinite array without using arr.length
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,7,9,10,13,14,15,21,28,30};
        int target = 2;
        int ans = findindex(arr,target);
        System.out.println(ans);


    }
    static int findindex(int[] nums,int target){
        int start = 0;
        int end = 1;
        while(target>nums[end]){
            int newstart = end+1;
            end = end + (end-start+1) * 2;
            start = newstart;
        }
        return(binary(nums,target,start,end));

    }
    static int binary(int[] nums,int Target,int s,int e){

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

        }
        return -1;



    }

}
