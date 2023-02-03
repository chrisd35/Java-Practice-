package Arrays;

import java.util.Scanner;

public class TicTacToe {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        char[][] tttBoard = { { '_', '_', '_' },
                { '_', '_', '_' },
                { '_', '_', '_' }
        };

        System.out.println("Let's play tic tac toe!");
        printBoard(tttBoard);

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("Turn: X");
                int[] place = askUser(tttBoard); // array place will capture return value from askUser
                tttBoard[place[0]][place[1]] = 'X'; // updates the board to which row and column the user inputted
            } else {
                System.out.println("Turn: O");
                int[] place = askUser(tttBoard);
                tttBoard[place[0]][place[1]] = 'O';

            }
            printBoard(tttBoard); // prints the board after the user inputs values for row and column

            int count = checkWin(tttBoard); // checks who won while the loop iterates
            if (count == 3) {
                System.out.println("Player X wins!! ");
                break;
            } else if (count == -3) {
                System.out.println("Player O wins!! ");
                break;
            } else if (i == 8) {
                System.out.println("No one wins, it's a tie!");
            }
        }

        scanner.close();

    }

    // Function to print the contents of the tic tac toe board
    public static void printBoard(char[][] board) {
        System.out.println("\n");
        for (int i = 0; i < board.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n\n");
        }
    }

    // Function to ask the user to input 2 binary numbers to store the values in the
    // indexes of the row and column
    public static int[] askUser(char[][] board) {
        System.out.print("- pick the row and column: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        // If a place is taken, then it will prompt the user to input again
        while (board[row][column] != '_') {
            System.out.print("Place taken, please input another place! ");
            row = scanner.nextInt();
            column = scanner.nextInt();
        }

        // places row in index 0 and column in index 1
        return new int[] { row, column };

    }

    public static int checkWin(char[][] board) {
        int count = 0;

        // Checks for the sraight horizontal
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    count++;
                } else if (board[i][j] == 'O') {
                    count--;
                }
            }
            if (count == 3 || count == -3) {
                return count;
            } else {
                count = 0;
            }
        }

        // Checks for the straight vertical
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == 'X') {
                    count++;
                } else if (board[j][i] == 'O') {
                    count--;
                }
            }
            if (count == 3 || count == -3) {
                return count;
            } else {
                count = 0;
            }
        }

        // Checks for the left diagonal
        for (int i = 0; i < 3; i++) {
            if (board[i][i] == 'X') {
                count++;
            } else if (board[i][i] == 'O') {
                count--;
            }

            if (count == 3 || count == -3) {
                return count;
            } else {
                count = 0;
            }
        }

        // Checks for the right diagonal
        for (int i = 0; i < 3; i++) {
            int index = 2 - i;
            if (board[index][i] == 'X') {
                count++;
            } else if (board[index][i] == 'O') {
                count--;
            }

            if (count == 3 || count == -3) {
                return count;
            } else {
                count = 0;
            }
        }

        return count;
    }

}
