public class Question4 {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'A';
        short s = 612;
        int i = 1000;
        float f = 3.14f;
        double d = 99.674;

        double result = (f * b) + (i % c) - (d * s);

        System.out.printf("%.2f", result);
    }
}
