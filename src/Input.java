import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public int getNumber() {
        while (true) {
            try {
                int inputNumber = scanner.nextInt();
                scanner.nextLine();
                return inputNumber;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }
    }

    public Direction getDirection() {
        Direction direction = null;

        do {
            String userDirection = scanner.nextLine();

            direction = switch (userDirection) {
                case "W" -> Direction.UP;
                case "A" -> Direction.LEFT;
                case "S" -> Direction.DOWN;
                case "D" -> Direction.RIGHT;
                default -> {
                    System.out.println("Niepoprawna wartość. Wybierz kierunek : W, A, S, D");
                    yield null;
                }
            };
        } while (direction == null);

        return direction;
    }
}

