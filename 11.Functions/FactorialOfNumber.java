public class FactorialOfNumber {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i<=n; i++) {
            f = f * i;
        }
        return f;
    }
    public static int binoCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int binoCoeff = fact_n / (fact_r * fact_nmr);
        return binoCoeff;
    }
    // sum of 2 nums function
    public static int sum(int a, int b) {
        return a + b;
    }
    // sum of 3 nums function
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    // calcuate float sum
    public static float sum(float a, float b) {
        return a + b;
    }
    // prime or not
    public static boolean isPrime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    // primes in range
    public static void primsInRange(int n) {
        for(int i = 2; i<=n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    // binary to decimal
    public static void binToDec(int biNum) {
        int myNum = biNum;
        int pow = 0;
        int decNum = 0;
        while (biNum > 0) {
            int lastDigit = biNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            biNum = biNum / 10;
        }
        System.out.println("decimal of" + myNum + " = " + decNum);
    }
    // decimal to binary
    public static void decToBin(int n) {
        int Mynum = n;
        int pow = 0;
        int biNum = 0;

        while (n > 0) {
            int rem = n % 2;
            biNum = biNum + (rem * (int)Math.pow(10, pow));

            pow++;
            n = n/2;
        }
        System.out.println("binary form of" + Mynum + " = " + biNum);
    }
    public static void main(String[] args) {
        decToBin(5);
    }
}
