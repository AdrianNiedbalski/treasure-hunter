public class Base extends BoardObject {
    public Base() {
        this.symbol = "B";
    }

    @Override
    public void interact(Player player) {
        if(player.getTreasuresCollected() > 0){
            player.enterBase();
        }
    }
}
