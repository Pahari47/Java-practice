import java.util.Scanner;

public class PrintLargestof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        if(num1 >= num2){
            System.out.println("The largest number is: " + num1);
        } else {
            System.out.println("The largest number is: " + num2);
        }
    }
}
