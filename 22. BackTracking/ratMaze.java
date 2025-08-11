public class ratMaze {
    public static void solvemaze(int maze[][]) {
        int n = maze.length;
        int sol[][] = new int[n][n];

        if (maze[0][0] == 0) {
            return;
        }
        
        solveMazeUtil(maze, 0, 0, sol);
    }

    public static void solveMazeUtil(int maze[][], int row, int col, int sol[][]) {
        int n = maze.length;

        // base case 
        if (row == n -1 && col == n-1) {
            sol[row][col] = 1;
            printSolution(sol);
            sol[row][col] = 0;
            return;
        }

        sol[row][col] = 1;

        if (isSafe(maze, row+1, col, sol)) {
            solveMazeUtil(maze, row+1, col, sol);;
        }
        if (isSafe(maze, row, col+1, sol)) {
            solveMazeUtil(maze, row, col+1, sol);;
        }
        if (isSafe(maze, row-1, col, sol)) {
            solveMazeUtil(maze, row-1, col, sol);;
        }
        if (isSafe(maze, row, col-1, sol)) {
            solveMazeUtil(maze, row, col-1, sol);;
        }

        sol[row][col] = 0;
    }

    public static boolean isSafe(int maze[][], int row, int col, int sol[][]) {
        if (row < 0 || row >= maze.length || col < 0 || col >= maze.length) {
            return false;
        }

        if(maze[row][col] == 0) {
            return false;
        }

        if (sol[row][col] == 1) {
            return false;
        }

        return true;
    }

    public static void printSolution(int sol[][]) {
        for(int i=0; i<sol.length; i++) {
            for(int j=0; j<sol.length; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };

        solvemaze(maze);
    }
}
