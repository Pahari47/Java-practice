import java.util.*;

public class arraylist {

    public static void swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
    public static void main(String[] args) {
        // java collection frameWork
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);

        Collections.sort(list); // asending
        System.out.println(list);

        // desending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
