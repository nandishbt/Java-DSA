package com.binarySeach;

import java.util.Arrays;

public class TwoDSorted {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}

        };
        System.out.println(Arrays.toString(search(arr,10)));

    }
    static int[] binary(int[][] matrix,int row,int cstart,int cend,int target){
        while(cstart<=cend){
            int mid = cstart + (cend-cstart)/2;
            if(matrix[row][mid]==target){
                return new int[] {row,mid};
            }
            if(matrix[row][mid]<target){
                cstart = mid+1;
            }
            else{
                cend  = mid-1;
            }
        }return new int[] {-1,-1};
    }
    static int[] search(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int rstart = 0;
        int rend = rows - 1;
        int cmid = (cols-1)/2;
        while(rstart<rend-1){
            int mid = rstart+(rend-rstart)/2;
            if(matrix[mid][cmid]==target){
                return new int[] {mid,cmid};
            }
            if(matrix[mid][cmid]<target){
                rstart = mid;
            }
            else{
                rend = mid;
            }
        }
        if(target==matrix[rstart][cmid]){
            return new int[] {rstart,cmid};
        }
        if(target==matrix[rstart+1][cmid]){
            return new int[] {rstart+1,cmid};
        }
        if(target>matrix[rstart][cmid] && target<matrix[rstart][cols-1]){
           return binary(matrix,rstart,cmid+1,cols-1,target);
        }

        if(target>matrix[rstart+1][cmid] && target<matrix[rstart+1][cols-1]){
            return binary(matrix,rstart+1,cmid+1,cols-1,target);
        }
        if(target<matrix[rstart][cmid]){
            return binary(matrix,rstart,0,cmid-1,target);
        }
        if(target<matrix[rstart+1][cmid]){
            return binary(matrix,rstart+1,0,cmid-1,target);
        }


    return new int[] {-1,-1};
    }

}
