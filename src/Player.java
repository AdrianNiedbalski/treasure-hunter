public class Player {
    private String name = "P";
    private int lives = 3;
    private Position position;
    private int treasuresCollected = 0;
    private boolean inBase = false;

    public Player(int x, int y) {
        this.position = new Position(x, y);
    }

    public void move(Direction direction) {
        position.applyDirection(direction);
    }
}

