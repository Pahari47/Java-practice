import java.util.*;

public class palindrom {
    public static class Node {
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    static boolean isPalindrome(LinkedList<Character> list) {
        Stack<Character> hey = new Stack<>();
        Node temp = head;

        while (temp != null) {
            hey.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            if (temp.data != hey.pop()) {
                return false;
            }

            temp = temp.next;
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();

        list.add('A');
        list.add('B');
        list.add('C');
        list.add('B');
        list.add('A');

        if (isPalindrome(list)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }
}
