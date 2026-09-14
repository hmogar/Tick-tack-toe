import java.util.Scanner;

public class GameManager {
    Screen hud = new Screen();
    Scanner keyboard = new Scanner(System.in);
    int turn;
    public GameManager() {
    turn = 0;
    }
    public void showMenu(){
        hud.StartMenu();
        keyboard.nextLine();
        startGame();
    }

    public void startGame(){
        while (turn <= 9){
            
        }
    }
}
