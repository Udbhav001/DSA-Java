package org.example.datastructure;

public class Q3_InorderTraversal {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.left = new Node(2);
        head.left.right = new Node(3);
        head.right = new Node(4);
        head.right.left = new Node(5);
        inorderTraversal(head);
    }

    private static void inorderTraversal(Node head) {
        if(head == null)
            return;
        inorderTraversal(head.left);
        System.out.print(head.data + " ");
        inorderTraversal(head.right);
    }
}
class Node {
    Node left;
    Node right;
    int data;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
