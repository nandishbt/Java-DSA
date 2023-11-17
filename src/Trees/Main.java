package Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    BST tri = new BST();
        tri.insert(15);
        tri.insert(10);
        tri.insert(5);
        tri.insert(2);
        tri.insert(12);
        tri.insert(20);
        tri.display();
        tri.bfs();


    }
}
