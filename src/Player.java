public class Player{
    private String symbol;
    private int lives = 3;
    private Position position;
    private int treasuresCollected = 0;
    private boolean inBase = false;

    public Player(){}
    public Player(int x, int y) {
        this.symbol = "P";
        this.position = new Position(x, y);
    }

    public void move(Direction direction) {
        position.applyDirection(direction);
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getLives() {
        return lives;
    }

    public Position getPosition() {
        return position;
    }

    public int getTreasuresCollected() {
        return treasuresCollected;
    }

    public boolean isInBase() {
        return inBase;
    }
}

