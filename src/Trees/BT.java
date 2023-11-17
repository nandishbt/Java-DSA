package Trees;

import java.util.Scanner;

public class BT {
    Node root;
    public BT() {

    }
    public void insert(Scanner scan) {
        System.out.println("Enter the root node :");
        int val = scan.nextInt();
        root = new Node(val);
        insert(scan, root);
    }
    private void insert(Scanner scan ,Node node){
        System.out.println("Do you want to insert left of"+node.val);
        boolean left = scan.nextBoolean();
        if(left){
            System.out.println("Enter a value");
            int valu = scan.nextInt();
            node.left = new Node(valu);
            insert(scan,node.left);
        }
        System.out.println("Do you want to insert right of"+node.val);
        boolean right = scan.nextBoolean();
        if(right){
            System.out.println("Enter a value");
            int valu = scan.nextInt();
            node.right = new Node(valu);
            insert(scan,node.right);
        }

    }
    public void display(){
        display(root,"");
    }
    private void display(Node node,String indent){
        if(node == null){
            return;
        }
        System.out.println(indent+node.val);
        display(node.left,indent + "\t");
        display(node.right,indent + "\t");


    }
    private class Node{
        int val;
        Node left;
        Node right;
        public Node(int ele){
            this.val = ele;
        }
    }
}
