package main.decathlon;

import java.util.List;

import static java.lang.Math.*;
import static java.lang.Math.pow;

public class Calculations {

    public List<Athlete> calculateTotalPoints(List<Athlete> athleteList) {

        for (Athlete anAthlete : athleteList) {
            int oneHundredPoints = calculateTrackPoints(anAthlete.getOneHundredResult(),
                    25.4347, 18.00, 1.81);
            int longJumpPoints = calculateJumpPoints(anAthlete.getLongJumpResult(),
                    0.14354, 220.00, 1.40);
            int shotPutPoints = calculateThrowPoints(anAthlete.getShotPutResult(),
                    51.39, 1.50, 1.05);
            int highJumpPoints = calculateJumpPoints(anAthlete.getHighJumpResult(),
                    0.8465, 75.00, 1.42);
            int fourHundredPoints = calculateTrackPoints(anAthlete.getFourHundredResult(),
                    1.53775,  82.00, 1.81);
            int oneTenHurdlesPoints = calculateTrackPoints(anAthlete.getOneTenHurdlesResult(),
                    5.74352, 28.50, 1.92);
            int discusThrowPoints = calculateThrowPoints(anAthlete.getDiscusThrowResult(),
                    12.91, 4.00, 1.10);
            int poleVaultPoints = calculateJumpPoints(anAthlete.getPoleVaultResult(),
                    0.2797, 100.00, 1.35);
            int javelinThrowPoints = calculateThrowPoints(anAthlete.getJavelinThrowResult(),
                    10.14, 7.00, 1.08);
            int fifteenHundredPoints = calculateTrackPoints(anAthlete.getFifteenHundredResult(),
                    0.03768, 480.00, 1.85);
            int totalPoints = oneHundredPoints + longJumpPoints + shotPutPoints + highJumpPoints + fourHundredPoints +
                    oneTenHurdlesPoints + discusThrowPoints + poleVaultPoints + javelinThrowPoints +
                    fifteenHundredPoints;
            anAthlete.setTotalPoints(totalPoints);
        }
        return athleteList;
    }


    private int calculateTrackPoints(double time, double a, double b, double c) {
        double points = a * pow((b - time), c);
        return (int) floor(points);
    }

    private int calculateJumpPoints(int measurement, double a, double b, double c) {
        double points = a * pow((measurement - b), c);
        return (int) floor(points);
    }

    private int calculateThrowPoints(double distance, double a, double b, double c) {
        double points = a * pow((distance - b), c);
        return (int) floor(points);
    }
}
