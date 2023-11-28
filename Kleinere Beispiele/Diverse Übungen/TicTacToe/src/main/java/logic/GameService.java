package logic;

import view.FieldOutput;

public class GameService {
    private final InputService inputService;

    private final FieldService fieldService;

    private final FieldOutput fieldOutput;


    public GameService(InputService inputService, FieldService fieldService, FieldOutput fieldoutput) {
        this.inputService = inputService;
        this.fieldService = fieldService;
        this.fieldOutput = fieldoutput;
    }


    public void makeMove(String[] [] fields, String symbol) {
        String move = inputService.getUserInput();
        fieldService.insertSymbol(fields, move, "X");
        fieldOutput.printField(fields);
    }
}
