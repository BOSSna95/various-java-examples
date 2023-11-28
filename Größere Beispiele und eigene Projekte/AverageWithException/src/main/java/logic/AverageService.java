package logic;

import Input.InputService;

public class AverageService {

   private final InputService inputService;

    private int amountOfNumbersToAdd;

    private int sum;


    public AverageService(InputService inputService) {
       this.inputService = inputService;
    }

    public void setAmountOfNumbersToAdd() {

        while (true) {
            System.out.println("How many numbers do you want to add?!");
            try {
                amountOfNumbersToAdd = Integer.parseInt(inputService.UserInput());
            } catch (Exception e) {
                System.out.println("Input not valid! Please give me a number!");
                continue;
            }
            if (amountOfNumbersToAdd > 0) {
                break;
            } else {
                System.out.println("Please give me a positive number!");
            }
        }
    }


    public int calculateAverage() {

        for (int i = 0; i < amountOfNumbersToAdd; ) {
            System.out.println("Please give me a number to add!");
            try {
                int inputNumber = Integer.parseInt(inputService.UserInput());
                sum += inputNumber;
                i++;
            } catch (Exception e) {
                System.out.println("Input not valid!");
            }
        }
        return sum / amountOfNumbersToAdd;
    }

}

