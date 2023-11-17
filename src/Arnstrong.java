import java.util.Scanner;

public class Arnstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
//        boolean ans = isArmstr(a);
//        if(ans==true){
//            System.out.println("Is a Arnstrong number");
//
//        }
//        else{
//            System.out.println("not a Armstrong number");
//        }
//
//    }
//    static boolean isArmstr(int n){
//        int num = n;
//        int arm = 0;
//        while(n!=0){
//            int rem = n % 10;
//            arm = arm + (rem*rem*rem);
//            n = n/10;
//
//        }
//        if(arm==num){
//            return true;
//        }
//        else{
//            return false;
//    }
//    }
        int arm = 0;
        int num = a;
        while(a>0){
            int rem = a%10;
            arm = arm + (rem*rem*rem);
            a = a/10;
        }
        String ans = num == arm?"Is Armstrong":"Is Not ArmStrong";
        System.out.println(ans);
        }
}

