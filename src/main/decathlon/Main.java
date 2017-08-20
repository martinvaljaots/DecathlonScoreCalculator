package main.decathlon;

import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    //TODO: write test for InfoReader
    //TODO: clean up code
    //TODO: comment code
    //TODO: deal with exceptions

    public static void main(String[] args) {

        //Path to results file.
        String filePath = "/decathlon/decathlon_results.txt";

        InfoReader ir = new InfoReader();
        List<Athlete> athleteList = new ArrayList<>();

        try {
            athleteList = ir.readFile(filePath);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("One or more lines in info file are missing results!");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("One or more events have been marked down in incorrect format!");
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
            System.out.println(i + ".\t" + ai.getName() + " \t(" + ai.getTotalPoints() + ")");
            i++;
        }
    }
}
