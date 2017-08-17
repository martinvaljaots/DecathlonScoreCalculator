package main.java.decathlon;

import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // runs InfoReader.loadFile for the time being
        InfoReader ir = new InfoReader();
        List<AthleteInfo> athleteInfoList = new ArrayList<>();

        try {
            athleteInfoList = ir.loadFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        athleteInfoList = Calculations.calculateTotalPoints(athleteInfoList);

        Collections.sort(athleteInfoList, new Comparator<AthleteInfo>() {

            @Override
            public int compare(AthleteInfo athlete1, AthleteInfo athlete2) {
                if (athlete1.getTotalPoints() < athlete2.getTotalPoints()) {
                    return 1;
                }
                if (athlete1.getTotalPoints() > athlete2.getTotalPoints()) {
                    return -1;
                }
                return 0;
            }
        });
        int i = 0;
        for(AthleteInfo ai : athleteInfoList) {
            System.out.println(i + ". " + ai.getName() + " (" + ai.getTotalPoints() + ")");
            i++;
        }
    }
}
