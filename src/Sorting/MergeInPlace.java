package Sorting;

import java.util.Arrays;

public class MergeInPlace {
    public static void main(String[] args) {
        int[] nums = {9,8,7,1,2,3,4,6,5};
        merge(nums,0,nums.length);
        System.out.println(Arrays.toString(nums));

    }
    static void merge(int[] arr ,int start,int end){
        if(end<=start){
            return;
        }
        int mid = start+(end - start)/2;

        merge(arr,start,mid);
        merge(arr,mid,end);

        merging(arr,start,mid,end);
    }
    private static void merging(int[] num , int s,int m,int e){
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while(i<m && j<=e){
            if(num[i]<num[j]){
                mix[k] = num[i];
                i++;
            }
            else{
                mix[k] = num[j];
                j++;
            }
            k++;

        }
        while(i<m){
            mix[k] = num[i];
            i++;
            k++;
        }
        while(j<=e){
            mix[k] = num[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            num[s + l] = mix[l];

        }
    }
}
