package com.LinearSearchAlgorithm;

import java.util.Scanner;

public class CountEveNumExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of elements : ");
        int a = in.nextInt();
        int[] arr = new int[a];
        System.out.print("Enter elements : ");
        for (int i = 0; i < a; i++) {
            arr[i]= in.nextInt();


        }
        int ans = even(arr);
        System.out.println(ans);

    }
    static int Even(int[] arr){
        int sum = 0;
        for (int k: arr)
              {

                  int count= 0;
                  if (k==0){
                      count++;
                  }
                  while(k!=0){
                      count++;
                      k = k/10;

                  }
                  if(count%2==0){
                      sum++;
                  }



        }
        return sum;
    }
    static int digit(int num){
        if(num<0){
            num = num*-1;
        }
        return (int)(Math.log10(num)) + 1;
    }
    static int even(int[] arr){
        int count = 0;

        for(int i : arr){
            int a = digit(i);
            if(a%2==0){
                count++;
            }
        }return count;

    }
}
