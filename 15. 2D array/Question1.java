public class Question1 {

    public static int countNumber(int matrix[][], int key) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (key == matrix[i][j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }

    public static int SecondRowSum(int matrix[][]) {
        int sum = 0;
        for (int j = 0; j < matrix[1].length; j++) {
            sum = sum + matrix[1][j];
        }
        return sum;
    }

    public static int[][] transpose(int matrix[][]) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };

        int[][] result = transpose(matrix);
        printMatrix(result);
    }

}
