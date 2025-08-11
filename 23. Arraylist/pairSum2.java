import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class pairSum2 {

    public static List<Integer> pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for(int i = 0; i<n; i++) {
            if (list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }

        int lp = bp+1; // smallest
        int rp = bp; // largest


        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);
            if (sum == target) {
                return Arrays.asList(list.get(lp), list.get(rp));
            }

            if (sum < target) {
                lp = (lp+1) % n;
            } else {
                rp = (n+rp-1) % n;
            }
        }

        return Collections.emptyList();
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSum2(list, target));
    }
}
