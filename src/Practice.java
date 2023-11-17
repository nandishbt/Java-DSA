import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {4, 5, 6, 7, 8, 9, 1, 2};
        int n = arr.length;
        int num = 1234564589;
//        arr[0]=6;
//        System.out.println(Arrays.toString(arr));
        //arr={1,2,3,4,5,6}    output = {6,1,5,2,4,3}
        int[] newarr = new int[n];
        int last = n - 1;
        int first = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                newarr[i] = arr[last];
                last--;
            } else {
                newarr[i] = arr[first];
                first++;
            }

        }
        System.out.println(Arrays.toString(newarr));

        //adding first and last digit of number and checking if it is divisible by 2
        ArrayList<Integer> list = new ArrayList<>();
        while (num > 0) {
            int rem = num % 10;
            list.add(rem);
            num = num / 10;
        }
        boolean ans = (list.get(0) + list.get(list.size() - 1)) % 2 == 0 ? true : false;
        System.out.println(ans);


        //checking for duplicates
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    System.out.print(arr[i] + " ");
                }

            }

        }
        //* ** *** ** *
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            int col = i <= 3 ? i : 3 - (i - 3);
            for (int j = 0; j < col; j++) {
                System.out.print("*");

            }

            System.out.println();

        }
        //123454321 1234*4321 123***321 12*****21 1*******1
        int no = 5;
        for (int i = 0; i < no; i++) {
            for (int j = 1; j <= no - i; j++) {
                System.out.print(j + " ");

            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*" + " ");

            }
            int col = i == 0 ? no - i - 1 : no - i;
            for (int j = col; j >= 1; j--) {
                System.out.print(j + " ");

            }
            System.out.println();


        }
        //20=g,31=v,45=h,68=k,28=y

        int[] nums = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int l = nums.length;
        char[] CharArray = new char[26];
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('z' - i);
            CharArray[i] = ch;


        }
        System.out.println(Arrays.toString(CharArray));
        for (int i = 0; i < l; i++) {
            int rem = nums[i] % 26;
            char result;
            if (rem == 0) {
                result = 'a';
                System.out.println(nums[i] + "=" + result);
            } else {
                result = (char) ('a' + 26 - rem);
                System.out.print(nums[i] + "=" + result + ",");
            }

        }
        System.out.println();
        for (int i = 2; i < 10; i++) {
            if (nums[i] != nums[i - 1] + nums[i - 2]) {
                System.out.println("not");
                return;
            }


        }
        System.out.println("yes");

    }
}








