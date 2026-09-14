public class Board {
    char[][] board = new char[3][3];

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

}
