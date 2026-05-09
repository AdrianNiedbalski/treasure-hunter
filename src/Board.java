public class Board {
    private final int width = 10;
    private final int height = 10;

    public void printBoard() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
