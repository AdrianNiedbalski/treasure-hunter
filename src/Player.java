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

    public void collectTreasure() {
        treasuresCollected++;
        System.out.println("Treasure collected! Total treasures: " + treasuresCollected);
    }

    public void takeDamage() {
        lives--;
        System.out.println("Ouch! Lives remaining: " + lives);
    }

    public void enterBase() {
        inBase = true;
        System.out.println("You entered the base!");

    }

    public void resetTreasure() {
        treasuresCollected = 0;
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

    public void setInBase(boolean inBase) {
        this.inBase = inBase;
    }
}

