import java.util.*;
public class Arraylistex {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,2,2,3,3,4,4,5};
        ArrayList<Integer> listt = removeDuplicates(arr);

        System.out.println(listt);
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            list.add(new ArrayList<>());


        }
        for (int i = 0; i < N; i++) {
            int a = in.nextInt();

            for (int j = 0; j < a; j++) {
                list.get(i).add(in.nextInt());

            }


        }
        System.out.println(list);


        int ans[] = sum(list, N);
        for (int i : ans) {
            System.out.println(i);
        }


    }

    static int[] sum(ArrayList<ArrayList<Integer>> LIst, int M) {
        int[] Sum = new int[M];

        for (int i = 0; i < M; i++) {
            int total = 0;
            for (int j = 0; j < LIst.get(i).size(); j++) {
                total = total + LIst.get(i).get(j);

            }
            while (total % 10 != total) {
                int m = total;
                total = 0;
                while (m != 0) {
                    int rem = m % 10;
                    total = total + rem;
                    m = m / 10;
                }
            }
            Sum[i] = total;

        }
        return Sum;


    }



        static ArrayList<Integer> removeDuplicates(int[] nums) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i <= nums.length - 1; i++) {
                while (true) {
                    if (list.contains(nums[i])) {
                        break;
                    } else {
                        list.add(nums[i]);
                    }
                }


            }
            int a = list.size();
            return list;
        }


    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
