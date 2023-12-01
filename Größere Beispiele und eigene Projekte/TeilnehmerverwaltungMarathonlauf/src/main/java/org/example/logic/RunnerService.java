package org.example.logic;

import org.example.data.RunnerData;

import java.util.List;

public class RunnerService {

    public int calculateAverageRuntime(List<RunnerData> runnersData) {
        int totalRuntime = 0;
        for (RunnerData data : runnersData) {
            totalRuntime += data.runtimeInMin();
        }
        return totalRuntime/runnersData.size();
    }

    public int getSlowestRuntime(List<RunnerData> runnersData) {
        int slowestRuntime = runnersData.get(0).runtimeInMin();
        for (int i = 1; i < runnersData.size(); i++) {
            if (runnersData.get(i).runtimeInMin() > slowestRuntime) {
                slowestRuntime = runnersData.get(i).runtimeInMin();
            }
        }
        return slowestRuntime;
    }


}
