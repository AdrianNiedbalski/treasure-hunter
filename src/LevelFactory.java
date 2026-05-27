public class LevelFactory {

    public Board loadLevel(int level, Player player, Enemy enemy) {
        switch (level) {
            case 1:
                Board boardLevel1 = new Board(5, 5);
                player.setPosition(new Position(0, 0));
                enemy.setPosition(new Position(1, 3));
                boardLevel1.addObject(4, 4, new Base());
                boardLevel1.addObject(0, 4, new Treasure());
                boardLevel1.addObject(1, 2, new Wall());
                boardLevel1.addObject(2, 2, new Wall());
                boardLevel1.addObject(3, 4, new Trap());
                return boardLevel1;
            case 2:
                Board boardLevel2 = new Board(4, 4);
                player.setPosition(new Position(0, 0));
                enemy.setPosition(new Position(2, 1));
                boardLevel2.addObject(3, 3, new Base());
                boardLevel2.addObject(0, 3, new Treasure());
                boardLevel2.addObject(1, 1, new Wall());
                boardLevel2.addObject(2, 1, new Wall());
                return boardLevel2;
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
