import java.util.Scanner;

public class twoDArray {

    public static boolean search(int matrix[] [], int key) {
        for(int i=0; i<matrix.length; i++) {
            for(int j =0; j<matrix[0].length; j++) {
                if (matrix[i] [j] == key) {
                    System.out.println("found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void largestSmallest(int matrix[] []) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<matrix.length; i++) {
            for(int j =0; j<matrix[0].length; j++) {
                if (largest < matrix[i] [j]) {
                    largest = matrix[i] [j];
                }
                if (smallest > matrix[i] [j]) {
                    smallest = matrix[i] [j];
                }
            }
        }
        System.out.println("The largest in matrix : " + largest);
        System.out.println("The smallest in matrix : " + smallest);
    }
    public static void main(String[] args) {
        int matrix[] [] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        // input
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for(int i=0; i<n; i++) {
            for(int j =0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 5);
        largestSmallest(matrix);

    }
}
