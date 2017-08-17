package main.java.decathlon;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // runs InfoReader.loadFile for the time being
        InfoReader ir = new InfoReader();
        List<AthleteInfo> athleteInfoList = new ArrayList<>();
        try {
            athleteInfoList = Sort.bogoSort(Calculations.calculateTotalPoints(ir.loadFile()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(AthleteInfo ai: athleteInfoList) {
            System.out.println(ai.getTotalPoints());
        }
    }
}
