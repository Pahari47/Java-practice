public class odd_even_rarearrange {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};

        for (int i=0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = -1 * arr[i];
            }
            System.out.print(arr[i] + " ");
        }
    }
}
