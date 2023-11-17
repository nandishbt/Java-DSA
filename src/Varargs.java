import java.util.Arrays;
import java.util.Scanner;

public class Varargs {
    public static void main(String[] args) {
       get(1,2,3,4);

        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int ans = sum(a,b);
//        System.out.println(ans);

    }
    static void get(int ...a){
        System.out.println(Arrays.toString(a));



    }
    static int sum(int a,int b){
        return a+b;
    }
}
