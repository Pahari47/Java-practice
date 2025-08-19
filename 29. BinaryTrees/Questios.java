import java.util.*;

public class Questios {
    static class Node {
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

    static HashMap<String, Integer> m;

    static String sereialize(Node node) {
        if (node == null) {
            return "";
        }
        String str = "(";

        str += sereialize(node.left);
        str += Integer.toString(node.data);
        str += sereialize(node.right);

        str += ")";

        if (m.get(str) != null && m.get(str) == 1) {
            System.out.print(node.data + " ");
        }

        if (m.containsKey(str)) {
            m.put(str, m.get(str) + 1);
        } else {
            m.put(str, 1);
        }

        return str;

    }

    static void printAllDups(Node root) {
        m = new HashMap<>();
        sereialize(root);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(3);
        root.right.left = new Node(3);
        root.right.right = new Node(3);

        printAllDups(root);
    }
}
