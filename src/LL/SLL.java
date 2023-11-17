package LL;

public class SLL {
    Node head;
    Node tail;
    int size;

    public SLL(){
        size = 0;

    }
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
            size+=1;
        }
    }
    public void Display(){
        if(head == null){
            System.out.println("no elements present");
            return;
            }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println("End");



        }
    public void DisplayRev(){
        Node temp = head;
        funRev(temp);
        System.out.println("START");
    }
    private void funRev(Node temp){
        if(temp == null){
            return;

        }
        funRev(temp.next);
        System.out.print(temp.value+"-->");




    }
    public void InsertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size+=1;

    }
    public void insert(int index,int value){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size-1){
            InsertLast(value);
            return;
        }
        if(index>=size){
            System.out.println("Invalid");
        }
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;

        }
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;


    }
    public void deleteFirst(){
        if(head == null){
            return;
        }
        head = head.next;
        if(head == null){
            tail = null;

        }

    }
    public int empty(){
        Node ne = new Node();
        return ne.value;

    }
    public void deletelast(){
        if(head == null){
            return;
        }
        Node temp = head;
        for (int i = 0; i < size-2; i++) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
    }
    public void removeDuplicates(){
        Node temp = head;
        while(temp.next!=null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
                size--;
            }
            else{
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;


        }

    public void delete(int index){
        if(head==null){
            return;
        }
        Node temp = head;
        for (int i = 0; i <index-1 ; i++) {
            temp = temp.next;
        }
        temp.next =temp.next.next;
    }
    public void findval(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;

        }
        System.out.println(temp.value);
    }
    public Node getnode(int i){
        Node temp = head;
        for (int j = 0; j < i; j++) {
            temp = temp.next;

        }
        return temp;
    }
    public void reverse(Node node){
        if(node==tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next=null;
    }
    public void Inreverse(){
        Node prev = null;
        Node pres = head;
        Node next = head.next;
        while(pres!=null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next!=null){
                next = next.next;
            }

        }head = prev;
    }




    private class Node{
        int value;
        Node next;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
