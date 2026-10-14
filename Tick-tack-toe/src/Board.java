public class Board {
    //The record that represents a tuple is created
    public record Position(int row, int col) {}

    char[][] board = new char[3][3];
    //Counters of each row and column, plus the two diagonals.
    //When 'X' places its brand it adds 1, when 'O' places its brand it subtracts 1
    int[] rows = new int[3];
    int[] cols = new int[3];
    int diag_1 = 0;
    int diag_2 = 0;

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
            updateCounters(row, col, brand);
            return true;

        }else {
            return false;
        }
    }

    private void updateCounters(int row, int col, char brand) {
        int value = (brand == 'X') ? 1 : -1;
        rows[row] += value;
        cols[col] += value;

        //It is calculated if the position is on a diagonal
        if (row == col) {
            diag_1 += value;
        }
        if (row + col == 2) {
            diag_2 += value;
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

    public boolean isWinner() {
        //If a row, a column or a diagonal reaches 3 (X) or -3 (O), that player wins
        boolean isWinnerRow = (rows[0] == 3 || rows[0] == -3)
                || (rows[1] == 3 || rows[1] == -3)
                || (rows[2] == 3 || rows[2] == -3);
        boolean isWinnerCol = (cols[0] == 3 || cols[0] == -3)
                || (cols[1] == 3 || cols[1] == -3)
                || (cols[2] == 3 || cols[2] == -3);

        boolean isWinnerDia_1 = (diag_1 == 3 || diag_1 == -3);
        boolean isWinnerDia_2 = (diag_2 == 3 || diag_2 == -3);

        return isWinnerRow || isWinnerCol || isWinnerDia_1 || isWinnerDia_2;
    }
}
