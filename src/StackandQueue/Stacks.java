package StackandQueue;

public class Stacks {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    int ptr = 0;

    public Stacks(){
        this(DEFAULT_SIZE);
    }
    public Stacks(int size){
        this.data = new int[size];
    }
    public void push(int val){
        if(isFull()){
            System.out.println("stack is full");
            return;
        }
        data[ptr] = val;
        ptr++;
    }
    public int pop(){
        if(isempty()){
            return -1;
        }
        int remove = data[ptr-1];
        ptr--;
        return remove;
    }
    private boolean isFull(){
        return ptr == data.length;
    }
    private boolean isempty(){
        return ptr == 0;
    }
    public void display(){
        for (int i = 0; i <ptr ; i++) {
            System.out.println(data[i]);
        }
    }
}
