import java.util.*;
public class reversingKelement {
    static void reverseK(Queue<Integer> list, int k) {
        Stack<Integer> temp = new Stack<>();
        for(int i=0; i < k; i++) {
            temp.push(list.remove());
        }

        while (!temp.isEmpty()) {
            list.add(temp.pop());
        }

        int size = list.size();
        for(int i=0; i<size-k; i++) {
            list.add(list.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();

        int k = 5;

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        // System.out.print(list);
        reverseK(list, k);
        System.out.print(list);
    }
}
