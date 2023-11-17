package OOPS;

public class A {
    int x;
    public A(int x){
        this.x = x;
    }
}
class B extends A{
    int y;
    public B(int x,int y){
        super(x);
        this.y = y;
    }

    public static void main(String[] args) {
        B oj = new B(5,6);
        System.out.println(oj.x+","+oj.y);

    }

}
