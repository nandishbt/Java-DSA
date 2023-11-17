package LL;

public class DLL {
    Node head;
    Node tail;

    public void InsertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            head.prev = null;
            tail = head;
            return;

        }
        node.next = head;
        node.prev = null;
        head.prev = node;
        head = node;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void displayRev(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp = temp.prev;
        }
        System.out.println("START");
    }
    public void InsertLast(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            head.prev = null;
            tail = head;
            return;
        }
        tail.next = node;
        node.prev = tail;
        node.next = null;
        tail= node;
    }
    public void DeleteFirst(){
        if(head == null){
            return;
        }
        head = head.next;
        head.prev = null;
        if(head == null){
            tail = null;
        }
    }
    public void deletelast(){
        tail = tail.prev;
        tail.next = null;
        if(tail == null){
            head = null;
        }

    }
    public void  insert(int index,int val){
        Node node = new Node(val);
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        if(node.next!=null){
        node.next.prev = node;}



    }
    public void delete(int index){
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev=temp;

    }


    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
    }
}
