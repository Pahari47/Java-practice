public class majorityElement {
    public static int mejorityCount(int arr[]) {
        return majorityElementRec(arr, 0, arr.length - 1);
    }
    public static int majorityElementRec(int arr[], int left, int right) {
        if (left == right) {
            return arr[left];
        }

        int mid = (left + right) / 2;

        int leftMejor = majorityElementRec(arr, left, mid);
        int rightMejor = majorityElementRec(arr, mid + 1, right);

        if (leftMejor == rightMejor) {
            return leftMejor;
        }

        int leftCount = countInRange(arr, leftMejor, left, right);
        int rightCount = countInRange(arr, rightMejor, left, right);

        return leftCount > rightCount ? leftMejor : rightMejor;
    } 

    private static int countInRange(int[] nums, int num, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 3};
        System.out.println(mejorityCount(arr));
    }
}
