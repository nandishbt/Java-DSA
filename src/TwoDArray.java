import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];
        int[][] Arr = {
                {1,2,3,4},
                {5,6,7},
                {8,9}

        };

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

//                arr[i][j] = in.nextInt();


            }
            System.out.println();

        }
        for (int[] i : Arr) {
            System.out.println(Arrays.toString(i));


        }
    }
}
