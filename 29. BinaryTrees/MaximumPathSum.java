import java.util.*;
public class MaximumPathSum {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static int maxSum;

    public static int findMaxPath(Node root) {
        if (root == null) {
            return 0;
        }

        int leftMax = Math.max(0, findMaxPath(root.left));
        int rightMax = Math.max(0, findMaxPath(root.right));

        int currentPath = root.data + leftMax + rightMax;

        maxSum = Math.max(maxSum, currentPath);

        return root.data + Math.max(rightMax, leftMax);
    }

    static int maxPathSum(Node root) {
        maxSum = Integer.MIN_VALUE;
        findMaxPath(root);
        return maxSum;
    }

    public static void main(String[] args) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println(maxPathSum(root));
    }
}
