package org.example.logic;

import org.example.data.Inputs;

public class Validations {

    private final Inputs input1;

    public Validations(Inputs input) {
        this.input1 = input;
    }


    public boolean inputValidator(String input) {
        return input.matches("[1-9]");
    }


    public int placementValidator(String input, boolean validatedInput, String [] spielfeld) {

        while (!validatedInput || spielfeld[Integer.parseInt(input) - 1].matches("[X,O]")) {
            System.out.println("Placing at " + input + " not possible. Try again!");
            validatedInput = inputValidator(input = input1.getInput());
        } return Integer.parseInt(input);
    }
}
