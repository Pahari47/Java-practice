import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m;
        System.out.println("Enter your number :");
        int n = sc.nextInt();

        for(int i=1; i<=10; i++) {
            m = n*i;
            System.out.println(m);
        }
    }
}
