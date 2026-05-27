public class Controller {
    private boolean running = true;
    private GameService gameService = new GameService();
    private Input input = new Input();

    public void runGame() {
        do {
            printMenu();
            int number = input.getNumber();
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
                startGame();

                break;
            case 2:
                this.running = false;
                break;
            default:
                System.out.println("Niepoprawny wybór!");
        }
    }

    public void startGame() {
        gameService.initGame();

        do {
            gameService.getCurrentBoard().printBoard(gameService.getPlayer(), gameService.getEnemy());
            gameService.processMove(gameService.getPlayer(), gameService.getEnemy(), input.getDirection());
        } while (gameService.getGameRunning());
    }
}
