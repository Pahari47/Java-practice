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

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }

        // n is even
        int half = optimizedPower(a, n/2);
        int halfPowerSq = half * half;

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // int fnm1 = tilingProblem(n - 1);
        // int fnm2 = tilingProblem(n - 2);

        // int totalWays = fnm1 + fnm2;
        // return totalWays;

        return tilingProblem(n-1) + tilingProblem(n-2);
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar-'a'] == true) {
            removeDuplicates(str, idx+1, newStr, map);
        } else {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int friendPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int fnm1 = friendPairing(n-1);

        int fnm2 = friendPairing(n - 2);
        int pairways = (n-1) * fnm2;

        int totalways = fnm1 + pairways;
        return totalways;
    }

    public static void printBinString(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinString(n-1, 0, str+"0");
        if (lastPlace == 0) {
            printBinString(n-1, 1, str+"1");        
        }
    }

    public static String reverse(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }
        
        char lastChar = str.charAt(str.length() - 1);
        String restOfString = str.substring(0, str.length() - 1);
        String reversedRest = reverse(restOfString);
        String reversedFull = lastChar + reversedRest;

        return reversedFull;
    }

    public static boolean Sorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] >= arr[i + 1]) {
           return false; 
        }

        return isSorted(arr, i + 1);
    }

    public static int countDigits(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 10) {
            return 1;
        }
        return 1 + countDigits(n / 10);
    }

    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }

        printNumbers(n - 1);
        System.out.println(n);
    }


    public static void main(String[] args) {
        printNumbers(5);
    }
}
