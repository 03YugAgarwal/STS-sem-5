import java.util.Scanner;

class NQueen {

    static void soln(int board[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int board[][], int row, int column, int n) {
        int i, j;
        for (i = 0; i < column; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        for (i = row, j = column; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (i = row, j = column; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    static void solveNQueen(int board[][], int column, int n) {
        if (column >= n) {
            soln(board, n);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(board, i, column, n)) {
                board[i][column] = 1;
                solveNQueen(board, column + 1, n);
                board[i][column] = 0;
            }
        }
    }

    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int board[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 0;
            }
        }

        solveNQueen(board, 0, n);
    }
}
