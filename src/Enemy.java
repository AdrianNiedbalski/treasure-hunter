import java.util.Random;

public class Enemy {
    private String symbol;
    private Position position;

    public Enemy(int x, int y) {
        this.symbol = "E";
        this.position = new Position(x, y);
    }

    public Enemy() {
    }

    public Direction getRandomDirection() {
        Random random = new Random();

        Direction[] directions = Direction.values();

        return directions[random.nextInt(directions.length)];
    }

    public void move(Direction direction) {
        position.applyDirection(direction);
    }

    public Position getPosition() {
        return position;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
