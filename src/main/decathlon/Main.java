package main.decathlon;

import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    //TODO: write test for InfoReader
    //TODO: clean up code
    //TODO: comment code
    //TODO: deal with exceptions

    public static void main(String[] args) {

        InfoReader ir = new InfoReader();
        List<Athlete> athleteList = new ArrayList<>();

        try {
            athleteList = ir.loadFile();
        } catch (FileNotFoundException e) {
            System.out.println("Could not find info file!");
            e.printStackTrace();
        }
        Calculations calc = new Calculations();
        athleteList = calc.calculateTotalPoints(athleteList);

        Collections.sort(athleteList, new Comparator<Athlete>() {

            @Override
            public int compare(Athlete athlete1, Athlete athlete2) {
                if (athlete1.getTotalPoints() < athlete2.getTotalPoints()) {
                    return 1;
                }
                if (athlete1.getTotalPoints() > athlete2.getTotalPoints()) {
                    return -1;
                }
                return 0;
            }
        });

        int i = 1;
        for(Athlete ai : athleteList) {
            System.out.println(i + ".\t" + ai.getName() + "  (" + ai.getTotalPoints() + ")");
            i++;
        }
    }
}
