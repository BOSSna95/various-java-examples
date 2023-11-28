import logic.CheckService;
import logic.FieldService;
import logic.GameService;
import logic.InputService;
import view.FieldOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] fields = new String[3][3];
        FieldService fieldService = new FieldService();
        fieldService.initField(fields, ".");
        FieldOutput fieldOutput = new FieldOutput();
        fieldOutput.printField(fields);
        Scanner scanner = new Scanner(System.in);
        InputService inputService = new InputService(scanner);
        GameService gameService = new GameService(inputService, fieldService, fieldOutput);
        CheckService checkService = new CheckService();


        while (true) {
            System.out.print("Player 1, enter index: ");
            gameService.makeMove(fields, "X");
            if (checkService.didPlayerWin(fields, "X")) {
                System.out.println("Player 1 won");
                break;
            }



            System.out.print("Player 2, enter index: ");
            gameService.makeMove(fields, "O");
            if (checkService.didPlayerWin(fields, "O")) {
                System.out.println("Player 2 won");
                break;
            }


        }

    }
}
