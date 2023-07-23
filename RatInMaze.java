class RatInMaze {

    static boolean isSafe(int maze[][], int x, int y, int n) {
        return (x < n && x >= 0 && y < n && y >= 0 && maze[x][y] == 1);
    }

    static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][], int n) {
        if (x == n - 1 && y == n - 1) {
            sol[x][y] = 1;
            return true;
        }
        if (isSafe(maze, x, y, n) == true) {
            sol[x][y] = 1;
            if (solveMazeUtil(maze, x + 1, y, sol, n)) {
                return true;
            }
            if (solveMazeUtil(maze, x, y + 1, sol, n)) {
                return true;
            }
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    static void solveMaze(int maze[][], int n) {
        int sol[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sol[i][j] = 0;
            }
        }

        if (solveMazeUtil(maze, 0, 0, sol, n) == false) {
            System.out.println("No Solution");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(" " + sol[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        int maze[][] = {
            { 1, 0, 0, 0 },
            { 1, 1, 0, 1 },
            { 0, 1, 0, 0 },
            { 1, 1, 1, 1 },
        };

        solveMaze(maze, 4);

    }
}
