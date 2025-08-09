public class InversionCount {
    public static long inversionCount(int arr[]) {
        if (arr == null || arr.length <= 1) {
            return 0L;
        }
        return mergeSortCount(arr, 0, arr.length-1);

    }

    private static long mergeSortCount(int arr[], int left, int right) {
        if (left >= right) {
            return 0L;
        }

        int mid = (left + right) / 2;

        long leftCount = mergeSortCount(arr, left, mid);
        long rightCount = mergeSortCount(arr, mid + 1, right);

        long crossCount = mergeAndCount(arr, left, mid, right);

        return leftCount + rightCount + crossCount;
    }

    private static long mergeAndCount(int arr[], int left, int mid, int right) {
        int n = right - left + 1;
        int temp[] = new int[n];

        int i = left;
        int j = mid+ 1;
        int k = 0;
        long inversions = 0L;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                inversions += (mid - i + 1);
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for(k = 0, i = left; k<n; k++, i++) {
            arr[i] = temp[k];
        }

        return inversions;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println("Before: ");
        for (int v : arr) System.out.print(v + " ");
        System.out.println();

        long inv = inversionCount(arr);
        System.out.println("Inversion count = " + inv); // expected 3
        System.out.println("After merge-sorting array: ");
        for (int v : arr) System.out.print(v + " ");
        System.out.println();
    }
}
