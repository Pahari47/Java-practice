import java.util.Scanner;

public class Question3 {

    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            int reminder = num % 10;
            sum += reminder;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(sumOfDigits(num));
    }
}
