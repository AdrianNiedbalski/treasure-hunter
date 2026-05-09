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
}
