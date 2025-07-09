public class ProductAandB {

    public static int mltiply(int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int prod = mltiply(a, b);
        System.out.println(prod);
        prod = mltiply(10, 20);
        System.out.println(prod);
    }
}
