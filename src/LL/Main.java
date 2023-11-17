package LL;

public class Main {
    public static void main(String[] args) {
        SLL list = new SLL();
//        list.InsertFirst(1);
//        list.InsertFirst(2);
//        list.InsertFirst(3);
//        list.InsertFirst(4);
//        list.display();
//        list.displayRev();
        list.InsertLast(5);
        list.InsertLast(4);
        list.InsertLast(3);
        list.InsertLast(2);
        list.InsertLast(1);
        list.InsertLast(0);
        list.Display();
        list.reverse(list.head);
        list.Display();
        list.Inreverse();
        list.Display();





    }
}
