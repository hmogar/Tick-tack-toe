

public class GameManager {
    Screen hud = new Screen();
    Board gameBoard = new Board();

    char brandPlayer;
    int turn;
    int playerTurn;

    public GameManager() {
    turn = 0;
    }

    public void showMenu(){
        hud.StartMenu();
        startGame();
    }

    public void startGame() {

        boolean isWinner = false;
        int row = -1;
        int col = -1;
        while ((!gameBoard.isFull()) && !isWinner){
            turn += 1;
            playerTurn = turn % 2;
            hud.showBoard(gameBoard);
            if (playerTurn != 0) {
                hud.askMovement(1);
                brandPlayer = 'X';
            } else {
                brandPlayer = 'O';
                hud.askMovement(2);
            }
            boolean okValue = false;
            while (!okValue) {
                row = hud.askPlacementRow();
                col = hud.askPlacementCol();
                okValue = gameBoard.setValue(row, col, brandPlayer);
            }
            isWinner = gameBoard.isWinner();
        }
        if (!isWinner){
            hud.printText("Tie");
        } else {
            playerTurn = turn % 2;
            if (playerTurn != 0) {
                hud.printText("Player 1 is the winner");
            } else {
                hud.printText("Player 2 is the winner");
            }
        }
    }
}
