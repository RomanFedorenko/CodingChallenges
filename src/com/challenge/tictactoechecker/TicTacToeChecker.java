package com.challenge.tictactoechecker;

import java.util.Arrays;

/**
 * If we were to set up a Tic-Tac-Toe game, we would want to know whether the board's current state is solved, wouldn't we? Our goal is to create a function that will check that for us!
 * <p>
 * Assume that the board comes in the form of a 3x3 array, where the value is 0 if a spot is empty, 1 if it is an "X", or 2 if it is an "O", like so:
 * <p>
 * [[0, 0, 1],
 * [0, 1, 2],
 * [2, 1, 0]]
 * We want our function to return:
 * <p>
 * -1 if the board is not yet finished AND no one has won yet (there are empty spots),
 * 1 if "X" won,
 * 2 if "O" won,
 * 0 if it's a cat's game (i.e. a draw).
 * You may assume that the board passed in is valid in the context of a game of Tic-Tac-Toe.
 */

public class TicTacToeChecker {
    public static int isSolved(int[][] board) {
        for (int i = 0; i < 3; i++) {
            int rowResult = checkRow(board[i]);
            if (rowResult == 1 || rowResult == 2) return rowResult;

            int colResult = checkRow(new int[]{board[0][i], board[1][i], board[2][i]});
            if (colResult == 1 || colResult == 2) return colResult;
        }

        int diagResult = checkRow(new int[]{board[0][0], board[1][1], board[2][2]});
        if (diagResult == 1 || diagResult == 2) return diagResult;

        int antiDiagResult = checkRow(new int[]{board[0][2], board[1][1], board[2][0]});
        if (antiDiagResult == 1 || antiDiagResult == 2) return antiDiagResult;

        return Arrays.stream(board).flatMapToInt(Arrays::stream).anyMatch(cell -> cell == 0) ? -1 : 0;
    }

    public static int checkRow(int[] row) {
        if (row[0] == row[1] && row[1] == row[2] && row[0] != 0) {
            return row[0];
        }
        return 0;
    }
}
