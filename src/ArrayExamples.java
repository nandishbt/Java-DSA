import java.util.*;

public class ArrayExamples {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};//reverse of an array
//        int s = 0;
//        int e = arr.length - 1;
//        while (s < e) {
//            int tem = arr[s];
//            arr[s] = arr[e];
//            arr[e] = tem;
//            s++;
//            e--;
//        }
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arr));
//
//    }
//}
        Scanner in = new Scanner(System.in);//sum of an array into single digit
        int n = in.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {


            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=in.nextInt();


            }



        }
        int ans[] = sum(arr,n);  //sum of an array
        for (int i = 0; i <n ; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }

        for(int k:ans){
            System.out.println(k);
        }

    }
    static int[] sum(int[][] Arr, int L ) {
        int[] Sum = new int[L];
        for (int i = 0; i < L; i++) {
            int t = 0;
            for (int j = 0; j < Arr[i].length; j++) {
                t = t + Arr[i][j];
            }

            while (t%10!=t) {
                int m = t;
                t = 0;
                while(m!=0) {
                    int rem = m % 10;
                    t = t + rem;
                    m = m / 10;

                }

                }





            Sum[i] = t;
        }


        return Sum;


    }
}


