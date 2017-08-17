package main.java.decathlon;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AthleteInfoTest {
    @Test
    public void setAndGetNameTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setName("Jaanus Kask");
        assertEquals(ai.getName(), "Jaanus Kask");
    }

    @Test
    public void setAndGetOneHundredResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setOneHundredResult(100.11);
        assertEquals(ai.getOneHundredResult(), 100.11, 0);
    }

    @Test
    public void setAndGetLongJumpResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setLongJumpResult(100);
        assertEquals(ai.getLongJumpResult(), 100, 0);
    }

    @Test
    public void setAndGetShotPutResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setShotPutResult(100.11);
        assertEquals(ai.getShotPutResult(), 100.11, 0);
    }

    @Test
    public void setAndGetHighJumpResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setHighJumpResult(100);
        assertEquals(ai.getHighJumpResult(), 100, 0);
    }

    @Test
    public void setAndGetFourHundredResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setFourHundredResult(100.11);
        assertEquals(ai.getFourHundredResult(), 100.11, 0);
    }

    @Test
    public void setAndGetOneTenHurdlesResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setOneTenHurdlesResult(100.11);
        assertEquals(ai.getOneTenHurdlesResult(), 100.11, 0);
    }

    @Test
    public void setAndGetDiscusThrowResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setDiscusThrowResult(100.11);
        assertEquals(ai.getDiscusThrowResult(), 100.11, 0);
    }

    @Test
    public void setAndGetPoleVaultResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setPoleVaultResult(100);
        assertEquals(ai.getPoleVaultResult(), 100, 0);
    }

    @Test
    public void setAndGetJavelinThrowResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setJavelinThrowResult(100.11);
        assertEquals(ai.getJavelinThrowResult(), 100.11, 0);
    }

    @Test
    public void setAndGetFifteenHundredResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setFifteenHundredResult(100.11);
        assertEquals(ai.getFifteenHundredResult(), 100.11, 0);
    }

    @Test
    public void setAndGetTotalPointsTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setTotalPoints(100);
        assertEquals(ai.getTotalPoints(), 100, 0);
    }
}