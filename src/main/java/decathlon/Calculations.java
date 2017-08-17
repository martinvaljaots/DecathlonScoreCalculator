package main.java.decathlon;

import java.util.List;

public class Calculations {

    public List<AthleteInfo> calculateTotalPoints(List<AthleteInfo> AthleteInfoList) {

        for (AthleteInfo anAthleteInfo : AthleteInfoList) {
            int oneHundredPoints = calculateTrackPoints(anAthleteInfo.getOneHundredResult(),
                    25.4347, 18.00, 1.81);
            int longJumpPoints = calculateJumpPoints(anAthleteInfo.getLongJumpResult(),
                    0.14354, 220.00, 1.40);
            int shotPutPoints = calculateThrowPoints(anAthleteInfo.getShotPutResult(),
                    51.39, 1.50, 1.05);
            int highJumpPoints = calculateJumpPoints(anAthleteInfo.getHighJumpResult(),
                    0.8465, 75.00, 1.42);
            int fourHundredPoints = calculateTrackPoints(anAthleteInfo.getFourHundredResult(),
                    1.53775,  82.00, 1.81);
            int oneTenHurdlesPoints = calculateTrackPoints(anAthleteInfo.getOneTenHurdlesResult(),
                    5.74352, 28.50, 1.92);
            int discusThrowPoints = calculateThrowPoints(anAthleteInfo.getDiscusThrowResult(),
                    12.91, 4.00, 1.10);
            int poleVaultPoints = calculateJumpPoints(anAthleteInfo.getPoleVaultResult(),
                    0.2797, 100.00, 1.35);
            int javelinThrowPoints = calculateThrowPoints(anAthleteInfo.getJavelinThrowResult(),
                    10.14, 7.00, 1.08);
            int fifteenHundredPoints = calculateTrackPoints(anAthleteInfo.getFifteenHundredResult(),
                    0.03768, 480.00, 1.85);
            int totalPoints = oneHundredPoints + longJumpPoints + shotPutPoints + highJumpPoints + fourHundredPoints +
                    oneTenHurdlesPoints + discusThrowPoints + poleVaultPoints + javelinThrowPoints +
                    fifteenHundredPoints;
            anAthleteInfo.setTotalPoints(totalPoints);
        }
        return AthleteInfoList;
    }


    private int calculateTrackPoints(double time, double a, double b, double c) {
        double points = Math.pow(a * (b - time), c);
        return (int)Math.floor(points);
    }

    private int calculateJumpPoints(int measurement, double a, double b, double c) {
        double points = Math.pow(a * (measurement - b), c);
        return (int)Math.floor(points);
    }

    private int calculateThrowPoints(double distance, double a, double b, double c) {
        double points = Math.pow(a * (distance - b), c);
        return (int)Math.floor(points);
    }
}
