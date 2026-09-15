import java.util.Set;

public class Board {
    //The record that represents a tuple is created
    public record Position(int row, int col) {}

    char[][] board = new char[3][3];
    Set<Position> positionDia_1 = Set.of(
            new Position(0, 0),
            new Position(1, 1),
            new Position(2, 2)
    );
    Set<Position> positionDia_2 = Set.of(
            new Position(0, 2),
            new Position(1, 1),
            new Position(2, 0)
    );
    public Board() {
        for (int f = 0; f < board.length; f++) {
            for (int c = 0; c < board[f].length; c++) {
                board[f][c] = '-';
            }
        }
    }

    public char getValue(int row, int col) {

        return board[row][col];
    }

    public boolean setValue(int row, int col, char brand){
        if (board[row][col] == '-') {
            board[row][col] = brand;
            return true;

        }else {
            return false;
        }
    }
    public boolean isFull() {
        for (int f = 0; f < board.length; f++) {
            for (int c = 0; c < board[f].length; c++) {
                if (board[f][c] == '-')
                    return false;
            }
        }
        return true;
    }

    public boolean isWinner(int row, int col, char brand) {
        boolean isWinnerRow = true;
        boolean isWinnerCol = true;

        //It is calculated if the position is on the diagonal
        boolean isWinnerDia_1 = (row == col);
        boolean isWinnerDia_2 = (row + col == 2);

        for (int a = 0; a < 3; a++) {
            if (board[row][a] != brand) {
                isWinnerRow = false;
            }
            if (board[a][col] != brand) {
                isWinnerCol = false;
            }

            if (isWinnerDia_1 && board[a][a] != brand) {
                isWinnerDia_1 = false;
            }
            if (isWinnerDia_2 && board[a][2 - a] != brand) {
                isWinnerDia_2 = false;
            }
        }

        return isWinnerRow || isWinnerCol || isWinnerDia_1 || isWinnerDia_2;
    }
}
