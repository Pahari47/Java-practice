public class mergeKSortedLists {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node mergeKLists(Node[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeRange(lists, 0, lists.length - 1);

    }

    private static Node mergeRange(Node[] lists, int left, int right) {
        if (left == right) {
            return lists[left];
        }
        
        int mid = (left + right) / 2;
        Node lMerged = mergeRange(lists, left, mid);
        Node rMerged = mergeRange(lists, mid+1, right);
        return mergeTwoLists(lMerged, rMerged);
    }

    private static Node mergeTwoLists(Node a, Node b) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a= a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        if (a != null) {
            tail.next = a;
        }
        if (b != null) {
            tail.next = b;
        }

        return dummy.next;
    }
    public static void print(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.next = new Node(3);
        Node l2 = new Node(6);
        l2.next = new Node(8);
        Node l3 = new Node(9);
        l3.next = new Node(10);

        Node[] lists = new Node[] {l1, l2, l3};
        Node merged = mergeKLists(lists);
        print(merged);
    }
}
