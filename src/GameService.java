import java.util.Scanner;

public class GameService {
    private boolean gameRunning = true;
    LevelFactory levelFactory = new LevelFactory();
    Player player = new Player(0, 0);
    Enemy enemy = new Enemy(3, 1);
    Input input = new Input();

    public void startGame() {
        Board board;
        do {
            board = levelFactory.loadLevel(player, enemy);
            board.printBoard(player, enemy);
            player.move(input.getDirection());

        } while (gameRunning);
    }
}

