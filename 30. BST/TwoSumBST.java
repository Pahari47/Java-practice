import java.util.*;
public class TwoSumBST {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void inorder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
    public static ArrayList<int[]> findPairs(Node root, int x) {
        ArrayList<Integer> values = new ArrayList<>();
        inorder(root, values);

        ArrayList<int[]> pairs = new ArrayList<>();
        int left = 0, right = values.size()-1;

        while (left < right) {
            int sum = values.get(left) + values.get(right);

            if (sum == x) {
                pairs.add(new int[]{values.get(left), values.get(right)});
                left++;
                right--;
            } else if (sum < x) {
                left++;
            } else { // sum > x
                right--;
            }
        }
        return pairs;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(6);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(8);
        root.left.left.left = new Node(2);
        root.left.left.right = new Node(4);

        int x = 16;
        ArrayList<int[]> pairs = findPairs(root, x);
        System.out.println("Number of pairs: " + pairs.size());

        for(int i=0; i<pairs.size(); i++) {
            int[] p = pairs.get(i);
            System.out.println("(" + p[0] + "," + p[1] + ")");
        }
    }
}
