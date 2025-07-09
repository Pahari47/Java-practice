public class SwapingNum {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " and " + b);
    }
    public static void main(String[] args) {
        int a  = 5;
        int b = 10;
        swap(a, b);
        
    }
}
