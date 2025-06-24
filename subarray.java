public class subarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4};
        

        for (int i = 0; i < arr.length *i; i++){
            for (int j= i; j<arr.length*i; j++) {
                for (int k =i; k<=j; k++) {
                    System.out.println(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
