public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int itrsearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        // key not found
        return -1;
    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int value = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return value;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int index = helper(head.next, key);
        if (index == -1) {
            return -1;
        }

        return index + 1;
    }

    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void deleteNthfromEnd(int n) {
        // calculate size of LL
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            head = head.next; // removeFirst
            return;
        }

        // size - n
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is midNode
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        Node midNode = findMid(head);

        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        if (slow == fast) {
            // spaciel case - cycle start at head
            while (fast.next != slow) {
                fast = fast.next;
            }
        } else {
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        // break cycle
        fast.next = null;
    }

    public void zigZag() {
        // find middle
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse second half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // alt merge - zig-zag merge
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();
        ll.zigZag();
        ll.print();

    }
}
