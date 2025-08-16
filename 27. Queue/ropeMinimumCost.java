import java.util.*;
public class ropeMinimumCost {
    static int minCost(int arr[], int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int cost = 0;

        for(int i=0; i<arr.length; i++) {
            pq.add(arr[i]);
        }

        while (pq.size() > 1) {
            int rope1 = pq.poll();
            int rope2 = pq.poll();

            cost += rope1 + rope2;

            pq.add(rope1 + rope2);
        }

        return cost;
    }
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 6};
        int n = arr.length;

        System.out.println(minCost(arr, n));
    }
}
