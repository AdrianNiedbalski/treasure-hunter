/*
P - gracz
E - enemy
T - treasure
X - trap
# - wall
* - puste pole
B - baza

1. Gracz może się poruszać w jednym z czterech kierunków (góra, dół, lewo, prawo).
2. Gracz musi zdobyć Treasure (T), aby wygrać grę.
3. Jeśli gracz wejdzie na pole z Enemy (E), gracz traci życie i zaczyna grę na polu oznaczonym jako baza (B).
4. Jeśli gracz wejdzie na pole z Trap (X), gracz traci życie i zaczyna grę na polu oznaczonym jako baza (B).
5. Gracz może poruszać się tylko po polach oznaczonych jako puste (*), Treasure (T) lub baza (B).
6. Gracz nie może poruszać się po polach oznaczonych jako wall (#).
7. Gracz zaczyna grę na polu oznaczonym jako baza (B).
8. Gracz ma 3 życia, jeśli straci wszystkie życia, gra się kończy.
9. Enemy powyżej połowy planszy rusza się losowo w jednym z czterech kierunków.
*/
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.runGame();
    }
}