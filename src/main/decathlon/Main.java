package main.decathlon;

import java.util.*;

/**
 * Main class containing main method.
 */
public class Main {

    public static void main(String[] args) {

        //Path to results file.
        String filePath = "/decathlon/decathlon_results.txt";

        InfoReader ir = new InfoReader();
        List<Athlete> athleteList = new ArrayList<>();

        //Reading the results file.
        try {
            athleteList = ir.readFile(filePath);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("One or more lines in info file are missing results!");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("One or more events have been marked down in incorrect format!");
            e.printStackTrace();
        }

        //Calculating total points.
        Calculations calc = new Calculations();
        athleteList = calc.calculateTotalPoints(athleteList);

        //Comparator for the sorting. Sorts the athletes to be in decreasing order by totalPoints.
        Collections.sort(athleteList, (athlete1, athlete2) -> {
            if (athlete1.getTotalPoints() < athlete2.getTotalPoints()) {
                return 1;
            }
            if (athlete1.getTotalPoints() > athlete2.getTotalPoints()) {
                return -1;
            }
            return 0;
        });

        //Printing of athlete names and total points.
        int i = 1;
        for(Athlete ai : athleteList) {
            System.out.println(i + ".\t" + ai.getName() + " \t(" + ai.getTotalPoints() + ")");
            i++;
        }
    }
}
