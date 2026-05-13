public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void applyDirection(Direction direction) {
        this.x += direction.getDx();
        this.y += direction.getDy();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
