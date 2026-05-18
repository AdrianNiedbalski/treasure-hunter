public class LevelFactory {
    private int level = 1;

    public Board loadLevel (Player player, Enemy enemy) {
        switch (level){
            case 1:
                Board board = new Board(5, 5);
                player.setPosition(new Position(0,0));
                enemy.setPosition(new Position(3,1));
                board.addObject(4, 4, new Base());
                board.addObject(4, 0, new Treasure());
                board.addObject(2, 2, new Wall());
                board.addObject(2, 1, new Wall());
                return board;
            default:
                System.out.println("Przeszedłeś wszystkie dostępne poziomy!");
                return null;
        }
    }
}

/*
LEVEL 1:
P * * * *
* * * * *
* # # * *
* E * * *
T * * * B
*/
