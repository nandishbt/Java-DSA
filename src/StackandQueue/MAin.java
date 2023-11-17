package StackandQueue;

public class MAin {
    public static void main(String[] args) throws Exception{
        CircularQueue c = new CircularQueue(5);
        c.push(1);
        c.push(2);
        c.push(3);
        c.push(4);
        c.push(5);
        c.display();

        c.pop();
        c.push(8);
        c.display();












    }
}
