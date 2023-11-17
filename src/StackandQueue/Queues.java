package StackandQueue;

public class Queues {
    private int[] arr;
    private static int d = 10;
    int ptr = 0;
    int front = 0;

    public Queues(){
        this(d);
    }
    public Queues(int size){
        this.arr = new int[size];
    }
    public void insert(int val) {
        if(ptr == arr.length){
            System.out.println("is full");
            return;
        }
        arr[ptr++] = val;
    }
    public int Remove(){
        if(front==ptr){
            System.out.println("Is empty");
            return -1;
        }
        int r = arr[front++];
        return r;
    }
    public int remove(){
        int r = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            arr[i-1] = arr[i];
        }
        ptr--;
        return r;
    }
    public void display(){
        for (int i = front; i < ptr; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
