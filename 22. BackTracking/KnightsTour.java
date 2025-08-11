public class KnightsTour {

    static int n = 8;

    static int[] moveX = { 2, 1, -1, -2, -2, -1, 1, 2 };
    static int[] moveY = { 1, 2,  2,  1, -1, -2, -2, -1 };

    public static void solveKnightsTour() {
        int[][] board = new int[n][n];

        for(int i =0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = -1;
            }
        }

        board[0][0] = 0;

        if (solveKTUtil(0, 0, 1, board)) {
            printBoard(board);
        } else {
            System.out.println("nope");
        }
    }

    public static boolean solveKTUtil(int x, int y, int moveCount, int board[][]) {
        if (moveCount == n * n) {
            return true;
        }

        for(int i =0; i< 8; i++) {
            int nextX = x + moveX[i];
            int nextY = y + moveY[i];

            if (isSafe(nextX, nextY, board)) {
                board[nextX][nextY] = moveCount;

                if (solveKTUtil(nextX, nextY, moveCount + 1, board)) {
                    return true;
                } else {
                    board[nextX][nextY] = -1;
                }
            }
            
        }

        return false;
    }

    public static boolean isSafe(int x, int y, int board[][]) {
        return (x >=0 && x <n && y >= 0 && y<n && board[x][y] == -1);
    }

    public static void printBoard(int board[][]) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        solveKnightsTour();
    }
}
