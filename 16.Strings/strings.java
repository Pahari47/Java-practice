import java.util.Scanner;

public class strings {

    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static String subString(String str, int si, int ei) {
        String substr = "";
        for(int i=si; i<ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(subString(str, 0, 5));
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Tony stark";
        // System.out.println(fullName.length());

        // concatenation
        // String firstName = "Nachiketa";
        // String lastName = "Pahari";
        // String fullName = firstName + " " + lastName;
        

        // printLetters(fullName);
    }
}
