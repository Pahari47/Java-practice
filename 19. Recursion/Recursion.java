public class Recursion {

    public static void printDec(int n) {
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fnm1;
        return fn;
    }

    public static int sumNat(int n) {
        if (n == 1) {
            return 1;
        }
        int sumNminusone = sumNat(n-1);
        int sumN = n + sumNminusone;
        return sumN;
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibonacciNM1 = fibonacci(n - 1);
        int fibonacciNM2 = fibonacci(n - 2);
        int fibonacciN = fibonacciNM1 + fibonacciNM2;
        return fibonacciN;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        } else {
            return isSorted(arr, i+1);
        }
    }

    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {7, 7, 9, 6, 5, 8, 4, 9, 3, 5};

        System.out.println(lastOccurence(arr, 5, 0));
    }
}
