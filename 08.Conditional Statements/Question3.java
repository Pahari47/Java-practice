import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Day = sc.nextInt();

        switch (Day) {
            case 1: System.out.println("monday");
                 break;
            case 2: System.out.println("Tuesday");
                 break;
            case 3: System.out.println("Wednesday");
                 break;   
            case 4: System.out.println("Thursday");
                 break;
            case 5: System.out.println("Friday");
                 break;
            case 6: System.out.println("Sutterday");
                 break;
            case 7: System.out.println("sunday");
                 break; 
            default: System.out.println("Invalid input");                          
        }

    }
}
