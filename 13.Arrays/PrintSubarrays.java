public class PrintSubarrays {

    public static void subarray(int numbers[]) {
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        int prefix[] = new int [numbers.length];
        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int sum = 0;
                int end = j;

                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                // for(int k= start; k<=end; k++) {
                //     System.out.print(numbers[k] + " ");
                //     sum += numbers[k];
                // }
                ts++;
                System.out.print("Sum of this array is : " + sum);
                System.out.println();

                if (maxSum < sum) {
                    maxSum = sum;
                }
                if (minSum > sum) {
                    minSum = sum;
                }
            }
            System.out.println();
            
        }
        System.out.println("the minsum of array is : " + minSum);
        System.out.println("the maxsum of array is : " + maxSum);
        System.out.println("total subarrays : " + ts);
    }

    public static void kadanes(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<numbers.length; i++) {
            sum = sum + numbers[i];
            if (sum < 0) {
                sum = 0;
            }
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println("your max subarry sum is : " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        kadanes(numbers);
    }
}
