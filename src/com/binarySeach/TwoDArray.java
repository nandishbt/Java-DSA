package com.binarySeach;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,9},
                {10,11,12,13}
        };
        int target = 4;

        System.out.println(Arrays.toString(binary(arr,target)));

    }
    static int[] binary(int[][] arr,int target){
        int row = 0;
        int col = arr[row].length -1;
        while(row<arr.length && col>=0){
            if (arr[row][col]==target){
                return new int[] {row,col};
            }
            if(arr[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }return new int[] {-1,-1};
    }
}
