

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
        /*
        Logica del juego

        Compruebo que no hay ganador o el tablero no esta lleno
            Avanzo el turno
            Muestro el tablero actual
            Pido al jugador que le toque(dependera del turno)(par o impar) que indica la fila y la columna
            Compruebo que no este ese hueco ya seleccionado
            Si lo esta, pido de nuevo
            Si no lo esta, lo marco
        */
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
            isWinner = gameBoard.isWinner(row,col,brandPlayer);
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
