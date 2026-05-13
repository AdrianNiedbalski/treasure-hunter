public enum Direction {
    UP(0, 1), DOWN(0, -1), LEFT(-1, 0), RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int x, int y) {
        this.dx = x;
        this.dy = y;
    }

    public int getDy() {
        return dy;
    }

    public int getDx() {
        return dx;
    }
}
