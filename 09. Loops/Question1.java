import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter the number :");
            num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }

            System.out.print("If you want to continue press 1 else 0");

            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("sum of even numbers :" + evenSum);
        System.out.println("sum of odd numbers :" + oddSum);
    }
}
