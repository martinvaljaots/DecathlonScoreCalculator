package main.java.decathlon;

import java.util.List;
import java.util.Random;

public class Sort {

    private static final Random rand = new Random();

    public static List<AthleteInfo> bogoSort(List<AthleteInfo> athleteInfoList) {
        while (!isSorted(athleteInfoList)) {
            for (int i = 0; i < athleteInfoList.size(); i++) {
                int randomPosition = rand.nextInt(athleteInfoList.size());
                AthleteInfo temp = new AthleteInfo();
                temp = athleteInfoList.get(i);
                athleteInfoList.set(i, athleteInfoList.get(randomPosition));
                athleteInfoList.set(randomPosition, temp);
            }

        }
        return athleteInfoList;
    }

    private static boolean isSorted(List<AthleteInfo> athleteInfoList) {
        for (int i = 1; i < athleteInfoList.size(); i++) {
            if (athleteInfoList.get(i).getTotalPoints() > athleteInfoList.get(i - 1).getTotalPoints()) {
                return false;
            }
        }
        return true;
    }
}
