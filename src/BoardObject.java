public abstract class BoardObject {
    protected String symbol;
    protected Position position;

    public abstract void interact(Player player);

    public String getSymbol() {
        return symbol;
    }
}
