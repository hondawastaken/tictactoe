import java.util.Scanner;

public class TicTacToe {
    public static void main (String[] args) {
        System.out.println("at least it starts...");
        char grid [][] = { {'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'} };
        char startingPlayer = 'x';

        // --------------------------------------------------------------------

        Scanner sc = new Scanner(System.in);
        while(true) {
            printBoard(grid);

            System.out.print("whoever is " + startingPlayer + ", enter a row (0 - 2) // ");
            int row = sc.nextInt();
            System.out.print("whoever is " + startingPlayer + " enter a col (0 - 2) // ");
            int col = sc.nextInt();
            
            if (grid[row][col] != '-') {
                System.out.println("don't be a cheater...");
                continue;
            }

            grid[row][col] = startingPlayer;
            
            if (startingPlayer == 'x') {
                startingPlayer = 'o';
            } else {
                startingPlayer = 'x';
            }
        }
    }

    public static void printBoard (char [][] grid) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
