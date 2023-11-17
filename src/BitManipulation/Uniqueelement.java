package BitManipulation;

public class Uniqueelement {
    public static void main(String[] args) {
        int ans = 0;
        int[] arr = {1,1,1,2,2,2,15,15,15,13,13,3,3,3,4,4,4,7,7,7,8,8,8};
        int i = 0;
        int base = 1;
        while(i<=3){
            int bits = 0;
            for(int n : arr){
                n = n>>i;

                    int last = n&1;
                    bits+=last;


            }
            int m = bits%3>0?1:0;
            ans = ans + m*base;
            base = 2*base;
            i++;


        }
        System.out.println(ans);

    }
}
