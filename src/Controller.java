import java.security.Provider;

public class Controller {
    Input playerInput = new Input();
    boolean running = true;
    GameService gameService = new GameService();

    public void runGame() {
        do {
            printMenu();
            int number = playerInput.getNumber();
            executeMenu(number);
        } while (running);
    }

    private void printMenu() {
        System.out.println("------------------------------");
        System.out.println("1. Play");
        System.out.println("2. Quit");
        System.out.println("------------------------------");
    }

    private void executeMenu(int number) {
        switch (number) {
            case 1:
                gameService.startGame();
                break;
            case 2:
                this.running = false;
                break;
            default:
                System.out.println("Niepoprawny wybór!");
        }
    }
}
