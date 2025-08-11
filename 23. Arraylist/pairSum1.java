import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class pairSum1 {
    public static List<Integer> pairSum(ArrayList<Integer> pairArr, int target) {
        int lp =  0;
        int rp = pairArr.size() - 1;
        while (lp != rp) {
            int sum = pairArr.get(lp) + pairArr.get(rp);

            if (sum == target) {
                return Arrays.asList(pairArr.get(lp), pairArr.get(rp));
            }

            if (sum < target) {
                lp++;
            } else {
                rp--;
            }
        }

        return Collections.emptyList();
    }
    public static void main(String[] args) {
        ArrayList<Integer> pairArr = new ArrayList<>();

        pairArr.add(1);
        pairArr.add(2);
        pairArr.add(3);
        pairArr.add(4);
        pairArr.add(5);
        pairArr.add(6);

        int target = 5;
        System.out.println(pairSum(pairArr, target));
    }
}
