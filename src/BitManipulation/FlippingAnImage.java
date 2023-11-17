package BitManipulation;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}

        };



        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= (arr[i].length-1)/ 2; j++) {
                int temp = arr[i][j] ^1;
                arr[i][j] = arr[i][arr[i].length - 1 - j] ^1;
                arr[i][arr[i].length - 1 - j] = temp;


            }



        }
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));


    }

}
