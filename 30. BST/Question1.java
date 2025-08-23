import java.util.*;
public class Question1 {
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    public static int rangeSum(Node root, int L, int R) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.data >= L && root.data <= R) {
            sum += root.data;
        }

        if(root.data<L) {
            sum += rangeSum(root.right, L, R);
        }

        else if(root.data > R) {
            sum += rangeSum(root.left, L, R);
        }

        else {
            sum += rangeSum(root.left, L, R);
            sum += rangeSum(root.right, L, R);
        }

        return sum;
    }

    public static int closestElement(Node root, int k) {
        int closest = root.data;
        while (root != null) {
            if (Math.abs(root.data - k) < Math.abs(closest - k)) {
                closest = root.data;
            }

            if (k < root.data) {
                root = root.left;
            } else if (k > root.data) {
                root = root.right;
            } else {
                return root.data;
            }
        }

        return closest;
    }
    static int count = 0;
    static int result = -1;
    public static void inorder(Node root, int k) {
        if (root == null) {
            return;
        }

        inorder(root.left, k);
        count++;
        if (count == k) {
            result = root.data;
            return;
        }
        inorder(root.right, k);
    }
    public static int kthElement(Node root, int k) {
        count = 0;
        result = -1;
        inorder(root, k);
        return result;
    } 

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(11);
        root.right.right = new Node(20);

        System.out.println(kthElement(root, 5));
    }
}
