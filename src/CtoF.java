import java.util.Scanner;
import java.util.*;

public class CtoF {
    public static void main(String[] args) {

        int[] num1 = {1,2,3,4,5};
        int n = 3;
        for (int i = 0; i <n ; i++) {
            int temp = num1[num1.length-1];
            for (int j = num1.length - 1; j > 0; j--) {

                num1[j] = num1[j-1];


            }
            num1[0] = temp;
        }


        System.out.println(Arrays.toString(num1));

    }
}




//        int[] num2 = {0,1,2,2,1};
//        System.out.println(createTargetArray(num1,num2));
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(0,1);
//        list.add(1,2);
//        list.add(1,3);
//        list.add(1,56);
//        System.out.println(list);



//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a degree in celsius:  ");
//        float c = in.nextFloat();
//        float f = (c*9/5) + 35;
//        System.out.println(f);
//        String name= "abcd";
//        char[] name2 = name.toCharArray();
//        String rev = "";
//
//        for(int i =name2.length-1;i>=0;i--){
//            rev +=name2[i];
//
//
//
//        }
//        System.out.println(rev);


//        public static ArrayList<Integer> createTargetArray(int[] nums, int[] index) {
//            ArrayList<Integer> arr=new ArrayList<Integer>();
//            int[] ans=new int[nums.length];
//            for(int i=0;i<nums.length;i++){
//
//                arr.add(index[i],nums[i]);
//            }
//            return arr;
//
//
//        }
//
//
//    }

