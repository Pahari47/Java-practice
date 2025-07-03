import java.util.Scanner;

public class PrintNumberOddorEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number " + num + " is even.");
        } else {
            System.out.println("The number " + num + " is odd.");
        }
    }
}
