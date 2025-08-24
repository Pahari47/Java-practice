import java.util.*;
public class maxBSTsum {
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    public static int maxSum = 0;
    static class Info {
        boolean isBST;
        int sum, min, max;
        Info(boolean isBST, int sum, int min, int max) {
            this.isBST = isBST;
            this.sum = sum;
            this.min = min;
            this.max = max;
        }
    }

    public static int helper(Node root) {
        if (root == null) {
            ret
        }
    }
    public static void main(String[] args) {
        
    }
}