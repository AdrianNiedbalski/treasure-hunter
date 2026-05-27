public class Treasure extends BoardObject {
    public Treasure() {
        this.symbol = "T";
    }

    @Override
    public void interact(Player player) {
        player.collectTreasure();
    }
}
