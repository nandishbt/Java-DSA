package StackandQueue;

public class CircularQueue {
    private int[] data;
    private int ptr = 0;
    private int front = 0;
    private static int default_s=6;
    int size = 0;

    public CircularQueue(){
        this(default_s);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    public void push(int val){
        if (size== data.length) {
            System.out.println("is full");
            return;
        }
        data[ptr++] = val;
        ptr = ptr % data.length;
        size++;
    }

    public int pop(){
        if(size==0){
            System.out.println("Is Empty");
            return-1;
        }
        int removed = data[front++];

        front=front%data.length;
        size--;

        return removed;
    }
    public void display(){
        int i = front;
        do{
            System.out.print(data[i]+"  ");
            i++;
            i = i% data.length;
        }while(i!=ptr);
        System.out.println();
    }


}
