public class Pattern3 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i<=4; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
