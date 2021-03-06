package main.decathlon;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

/**
 * Class for testing Calculations class.
 */
public class CalculationsTest {

    /**
     * Method to test that the method calculateTotalPoints(List<Athlete> athleteList) calculates correctly.
     * Based on results from: http://www.decathlon2000.com/884/decathlon-points-calculator/
     */
    @Test
    public void calculateTotalPointsTest() throws Exception {
        List<Athlete> athleteList = new ArrayList<>();
        Athlete ai = new Athlete();
        ai.setOneHundredResult(10.2);
        ai.setLongJumpResult(790);
        ai.setShotPutResult(18.75);
        ai.setHighJumpResult(217);
        ai.setFourHundredResult(46.00);
        ai.setOneTenHurdlesResult(13.70);
        ai.setDiscusThrowResult(57.50);
        ai.setPoleVaultResult(478);
        ai.setJavelinThrowResult(81.00);
        ai.setFifteenHundredResult(220.0);

        athleteList.add(0, ai);

        Calculations calc = new Calculations();
        List<Athlete> returnedInfoList = calc.calculateTotalPoints(athleteList);

        assertEquals(10124, returnedInfoList.get(0).getTotalPoints());
    }
}