import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int rev = 0;
        int Originalnumber = num;
        while(num!=0){
            int rem = num%10;
            num = num/10;
            rev = rev*10+rem;
        }

        System.out.println("REverse of a number is " +rev);
        boolean val = Originalnumber == rev?true:false;
        System.out.println(val);
    }
}
