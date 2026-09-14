import java.util.Scanner;

public class Screen {
    Scanner keyboard = new Scanner(System.in);

    public void StartMenu(){
        System.out.println("TICK TACK TOE");
        System.out.println("___WELCOME___");
        System.out.println("Press Enter to start the game:");
        keyboard.nextLine();
    }

    public void showBoard(Board board){
        System.out.println("-------");
        for (int i = 0; i < 3; i++){
            System.out.print("|");
            for (int j = 0; j<3; j++){
                System.out.print(board.getValue(i,j));
                System.out.print("|");
            }
            System.out.println();
            System.out.println("-------");

        }

    }
    public void askMovement(int numPlayer) {
        System.out.println("Player's turn " + numPlayer);
    }

    public int askPlacementRow(){
        int row = -1;

        while (row < 1 || row > 3) {
            System.out.println("Row?:");
            row = Integer.parseInt(keyboard.nextLine());
        }

        return row - 1;
    }

    public int askPlacementCol(){
        int col = -1;

        while (col < 1 || col > 3) {
            System.out.println("Col?:");
            col = Integer.parseInt(keyboard.nextLine());
        }

        return col - 1;
    }
}
