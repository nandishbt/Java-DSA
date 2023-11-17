package com.LinearSearchAlgorithm;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {45,65,98},
                {45,23,68}
        };
        int target = 45;
        int[] ans = answer(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] answer(int[][] Arr,int t){
        for (int i = 0; i <Arr.length ; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                if(Arr[i][j]==t){
                    return new int[]{i,j};
                }


            }

        }
        return new int[]{-1,-1};

    }
}
