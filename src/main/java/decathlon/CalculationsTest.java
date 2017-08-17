package main.java.decathlon;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;


public class CalculationsTest {

    @Test
    public void calculateTotalPointsTest() throws Exception {
        List<AthleteInfo> AthleteInfoList = new ArrayList<>();
        AthleteInfo ai = new AthleteInfo();
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

        AthleteInfoList.add(0, ai);

        List<AthleteInfo> returnedInfoList = Calculations.calculateTotalPoints(AthleteInfoList);

        assertEquals(10124, returnedInfoList.get(0).getTotalPoints());
    }
}