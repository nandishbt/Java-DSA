package LL;

public class CLL {
    Node head;
    Node Tail;
    int size = 0;

    public void InsertLast(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            Tail = node;
            head.next = Tail;
            size++;
            return;
        }
        Tail.next = node;
        Tail = node;
        Tail.next = head;
    }
    public void Insert(int index,int val){
        Node node = new Node(val);
        if(index == 0){
            head = node;
            Tail = node;
            head.next = Tail;
            size++;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;




    }
    public void display(){
        Node temp = head;
        do{
            System.out.print(temp.val+"->");
            temp = temp.next;
        }

        while(temp!=head);
        System.out.println("END");
    }
    private class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
        Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }
}
