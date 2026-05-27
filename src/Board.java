public class Board {
    private int width = 10;
    private int height = 10;
    private BoardObject[][] mapGrid;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.mapGrid = new BoardObject[width][height];
    }

    public void printBoard(Player player, Enemy enemy) {
        for (int y = height - 1; y >= 0; y--) {
            for (int x = 0; x < width; x++) {
                if (player.getPosition().getX() == x && player.getPosition().getY() == y) {
                    System.out.print(" " + player.getSymbol() + " ");
                } else if (enemy.getPosition().getX() == x && enemy.getPosition().getY() == y) {
                    System.out.print(" " + enemy.getSymbol() + " ");
                } else if (mapGrid[x][y] != null) {
                    System.out.print(" " + mapGrid[x][y].getSymbol() + " ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    public void addObject(int x, int y, BoardObject boardObject) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            mapGrid[x][y] = boardObject;
        }
    }

    public void removeObject(int x, int y) {
        mapGrid[x][y] = null;
    }

    public BoardObject[][] getMapGrid() {
        return mapGrid;
    }

    public BoardObject getObject(int x, int y) {

        if (x >= 0 && x < width && y >= 0 && y < height) {
            return mapGrid[x][y];
        }
        return new Wall();
    }
}
