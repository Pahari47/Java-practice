import java.util.*;
public class Questios {
    static class Node{
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isUniValued(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.data != root.left.data) {
            return false;
        }

        if (root.right != null && root.data != root.right.data) {
            return false;
        }

        return isUniValued(root.left) && isUniValued(root.right);
    }

    public static Node invert(Node root) {
        if (root == null) {
            return null;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert(root.left);
        invert(root.right);

        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node deleteLeaves(Node root, int x) {
        if (root == null) {
            return null;
        }

        root.left = deleteLeaves(root.left, x);
        root.right = deleteLeaves(root.right, x);

        if (root.left == null && root.right == null && root.data == x) {
            return null;
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int x = 7;

        inOrder(root);

        System.out.println();
        deleteLeaves(root, x);
        inOrder(root);
    }
}
