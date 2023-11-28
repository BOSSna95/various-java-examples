package Input;

import java.util.Scanner;

public class InputService {
    private final Scanner scanner;

    public InputService(Scanner scanner) {
        this.scanner = scanner;
    }

    public String UserInput () {
        return scanner.nextLine();
    }
}
