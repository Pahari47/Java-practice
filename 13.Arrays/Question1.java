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

    public static int stocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i<prices.length; i++) {
            if (buyPrice < prices[i]) {
            int profit = prices[i] - buyPrice;
            maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
    public static int holdRainWater(int height[]) {
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1; i<height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        for(int i = 1; i<height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            trappedWater += waterLevel - height[i];
        }

        return trappedWater;

        
    }
    public static void triplate(int numbers[]) {
        
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("The hold rain water is : " + holdRainWater(prices));
    }
}
