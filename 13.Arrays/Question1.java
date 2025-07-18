public class Question1 {

    public static boolean appearTwice(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            for(int j = i+ 1; j<nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        } 
        return false;
    }

    public static int search(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) /2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid -1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target < nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println("The target is in index : " + search(nums, target));
    }
}
