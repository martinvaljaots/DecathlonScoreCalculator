package main.java.decathlon;


import java.util.List;

public class Calculations {

    public int calculateTotalPoints(List<AthleteInfo> AthleteInfoList) {
        int result = 5;
        for (AthleteInfo anAthleteInfo : AthleteInfoList) {
            int oneHunPoints = calculateTrackPoints(anAthleteInfo.getOneHundredResult(), 25.4347, 18.00, 1.81);
            double longJPoints = calculateJumpPoints(anAthleteInfo.getHighJumpResult(), );
            int shotPPoints
            int ;
        }
        return result;
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
