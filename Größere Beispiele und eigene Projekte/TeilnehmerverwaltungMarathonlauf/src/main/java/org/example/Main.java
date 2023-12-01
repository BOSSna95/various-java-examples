package org.example;

import org.example.data.RunnerData;
import org.example.logic.RunnerService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        RunnerService runnerService = new RunnerService();

        RunnerData runner1 = new RunnerData("Alex", 482, 185);
        RunnerData runner2 = new RunnerData("Alina", 324, 170);
        RunnerData runner3 = new RunnerData("Talinea", 1052, 232);

        List<RunnerData> runnersData = new ArrayList<>();
        runnersData.add(runner1);
        runnersData.add(runner2);
        runnersData.add(runner3);

        int averageRuntime = runnerService.calculateAverageRuntime(runnersData);
        int slowestRuntime = runnerService.getSlowestRuntime(runnersData);
        System.out.println("The average runtime is: " + averageRuntime);
        System.out.println("The slowest runtime is: " + slowestRuntime);


        for (RunnerData runner : runnersData) {
            if (runner.runtimeInMin() == slowestRuntime) {
                System.out.println("The slowest runner was: ");
                System.out.println(runner);
            }
        }
    }
}