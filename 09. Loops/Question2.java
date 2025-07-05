import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int factorial = 1;
        System.out.println("Enter your number :");
         n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            factorial *=i;
        }
        System.out.println(" the factorial is :" + factorial);
    }
}
