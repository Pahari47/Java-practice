public class majorityElement {
    public static int mejorityCount(int arr[]) {
        int mejority = arr.length/2;

        for(int i=0; i<arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count += 1;
                }
            }

            if (count > mejority) {
                return arr[i];
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 3};
        System.out.println(mejorityCount(arr));
    }
}
