public class GameService {
    private boolean gameRunning;
    private LevelFactory levelFactory = new LevelFactory();
    ;
    private Player player = new Player(0, 0);
    private Enemy enemy = new Enemy(3, 1);
    private int currentLevel = 1;
    private Board currentBoard;


    public void initGame() {
        gameRunning = true;
        currentBoard = levelFactory.loadLevel(currentLevel, player, enemy);
    }

    public void processEnemyMove(Enemy enemy) {
        boolean moved = false;
        while (!moved) {
            Direction direction = enemy.getRandomDirection();
            Position nextEnemyPosition = enemy.getPosition().calculateNextPosition(direction);
            BoardObject target = currentBoard.getObject(nextEnemyPosition.getX(), nextEnemyPosition.getY());


            if (target == null) {
                enemy.move(direction);
                moved = true;
            }
        }
        if (enemy.getPosition().getX() == player.getPosition().getX() && enemy.getPosition().getY() == player.getPosition().getY()) {
            System.out.println("Enemy caught you!");
            player.takeDamage();
            player.resetPlayerPosition();
        }
    }

    public void processMove(Player player, Enemy enemy, Direction direction) {
        Position nextPosition = player.getPosition().calculateNextPosition(direction);
        BoardObject target = currentBoard.getObject(nextPosition.getX(), nextPosition.getY());

        if (target != null && !target.isPassable()) {
            System.out.println("You can't move there!");
            return;
        }

        player.move(direction);

        int playerX = player.getPosition().getX();
        int playerY = player.getPosition().getY();

        target = currentBoard.getObject(player.getPosition().getX(), player.getPosition().getY());

        if (target != null) {
            target.interact(player);

            if (target instanceof Treasure) {
                currentBoard.removeObject(playerX, playerY);
            } else if (target instanceof Trap) {
                currentBoard.removeObject(playerX, playerY);
            }
        }
        nextLevel(player);
    }

    public void nextLevel(Player player) {
        if (!player.isInBase()) {
            return;
        }
        currentLevel++;
        player.setInBase(false);
        player.resetTreasure();
        Board board = levelFactory.loadLevel(currentLevel, player, enemy);
        this.currentBoard = board;
    }

    public boolean getGameRunning() {
        return gameRunning;
    }

    public LevelFactory getLevelFactory() {
        return levelFactory;
    }

    public Player getPlayer() {
        return player;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public boolean isGameRunning() {
        return gameRunning;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public Board getCurrentBoard() {
        return currentBoard;
    }

}

//
