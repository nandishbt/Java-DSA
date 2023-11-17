package Pattern;


public class patterns {

    public static void main(String[] args) {
        p8(5);
    }


    static void p1(int n) {  // * ** *** ** *
        for (int i = 1; i <= 2 * n - 1;
             i++) {
            int col = i <= n ? i : n - (i - n);

            for (int j = 1; j <= col; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }


    }

    static void p2(int n) {                 //*  **  ***   ****
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }

    static void p3(int n) {                         //1 12 123 1234
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();

        }
    }

    static void p4(int n) {
        for (int rows = 1; rows <= 2 * n - 1; rows++) {
            int totalcols = rows <= n ? rows : n - (rows - n);
            int totalspaces = n - totalcols;
            for (int space = 0; space < totalspaces; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalcols; col++) {
                System.out.print("* ");
            }
            System.out.println();


        }

    }

    static void p5(int n) {
        for (int i = 0; i < n; i++) {
            int cols = n - i;
            int spaces = n - cols;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }

    static void p6(int n) { //1 212 32123 4321234
        for (int r = 1; r <= n; r++) {
            int space = n - r;
            for (int s = 0; s < space; s++) {
                System.out.print("  ");

            }
            for (int i = r; i >= 1; i--) {
                System.out.print(i + " ");


            }
            for (int i = 2; i <= r; i++) {
                System.out.print(i + " ");

            }
            System.out.println();

        }
    }

    static void p7(int n) {//1 212 32123 4321234 32123 212 1
        for (int i = 1; i <= 2 * n - 1; i++) {

            if (i <= n) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print("  ");

                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j+" ");

                }
                for (int j = 2; j <= i; j++) {
                    System.out.print(j+" ");

                }
                System.out.println();
            } else {
                for (int j = 0; j < i-n; j++) {
                    System.out.print("  ");

                }
                for (int j = n - (i - n); j >= 1; j--) {
                    System.out.print(j+" ");

                }
                for (int j = 2; j <= n - (i - n); j++) {
                    System.out.print(j+" ");

                }
                System.out.println();


            }
        }
    }
    static void p8(int n){ //**** *** ** *
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");



            }
            for (int j = n; j >i ; j--) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}








