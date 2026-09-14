import java.util.Scanner;

public class GameManager {
    Screen hud = new Screen();
    Board gameBoard = new Board();
    Brand brandX =  Brand.X;
    Brand brandO =  Brand.O;


    int turn;

    public GameManager() {
    turn = 0;
    }

    public void showMenu(){
        hud.StartMenu();
        startGame();
    }

    public void startGame(){
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
        turn += 1;
        Brand brandPlayer;

        hud.showBoard(gameBoard);
        if ((turn % 2) != 0){
            hud.askMovement(1);
            brandPlayer = brandX;
        } else{
            brandPlayer = brandO;
            hud.askMovement(2);
        }
        int row = hud.askPlacementRow();
        int col = hud.askPlacementCol();
    }
}
