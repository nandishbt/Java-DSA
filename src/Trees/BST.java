package Trees;

import StackandQueue.Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BST {
    Node root;
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public void Height(int val){
        Node temp = root;
        Height(temp,val);
    }
    private void Height(Node node,int val) {

        if (node == null) {
            return;
        }
        if (node.val == val) {
            System.out.println(height(node));
        }
        Height(node.left, val);
        Height(node.right, val);

    }




    public boolean isempty(){
       return root == null;
    }
    public void insert(int val){

        root = insert(root,val);

    }
    public Node insert(Node node,int val){
        if(node == null){
            node = new Node(val);
            return node;
        }
        if(val<node.val){
            node.left = insert(node.left,val);
        }
        if(val>node.val){
            node.right = insert(node.right,val);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    public void display(){
        display(root,"Root node:");
    }
    private void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details + node.val);
        display(node.left,"left of "+node.val+" :");
        display(node.right,"right of "+node.val+" :");
    }
    public void bfs(){
        Queue<Node> qu = new LinkedList<>();

        BFS(root,qu);
    }
    public void BFS(Node node, Queue<Node>que) {
        if(node==null){
            return;
        }
        System.out.print(node.val+" ");
        if(node.left!=null){
        que.add(node.left);}

        if(node.right!=null){
        que.add(node.right);}

        if(!que.isEmpty()){
            BFS(que.remove(),que);
        }


    }
    private class Node {
        int val;
        Node left;
        Node right;
        int height;

        public Node(int val) {
            this.val = val;
        }
    }
}