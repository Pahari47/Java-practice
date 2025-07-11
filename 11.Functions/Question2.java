import java.util.Scanner;

public class Question2 {

    public static boolean isPalindrome(int num) {
        int palindrom = num;
        int reversed = 0;

        while (palindrom != 0) {
            int digit = palindrom % 10;
            reversed = reversed * 10 + digit;
            palindrom = palindrom / 10;
        }
        if (num == reversed) {
            return true;
        } 
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int palindrom = sc.nextInt();

        if(isPalindrome(palindrom)){
            System.out.print("It is a palindrome");
        } else {
            System.out.println("It is not");
        }
        

    }
}
