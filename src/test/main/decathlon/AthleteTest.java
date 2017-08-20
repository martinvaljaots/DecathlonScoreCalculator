package main.decathlon;

import main.decathlon.Athlete;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AthleteTest {
    @Test
    public void setAndGetNameTest() throws Exception {
        Athlete ai = new Athlete();
        ai.setName("Jaanus Kask");
        assertEquals(ai.getName(), "Jaanus Kask");
    }

    @Test
    public void setAndGetOneHundredResultTest() throws Exception {
        Athlete ai = new Athlete();
        ai.setOneHundredResult(100.11);
        assertEquals(ai.getOneHundredResult(), 100.11, 0);
    }

    @Test
    public void setAndGetLongJumpResultTest() throws Exception {
        Athlete ai = new Athlete();
        ai.setLongJumpResult(100);
        assertEquals(ai.getLongJumpResult(), 100, 0);
    }

    @Test
    public void setAndGetShotPutResultTest() throws Exception {
        Athlete ai = new Athlete();
        ai.setShotPutResult(100.11);
        assertEquals(ai.getShotPutResult(), 100.11, 0);
    }

    @Test
    public void setAndGetHighJumpResultTest() throws Exception {
        Athlete ai = new Athlete();
        ai.setHighJumpResult(100);
        assertEquals(ai.getHighJumpResult(), 100, 0);
    }

    @Test
    public void setAndGetFourHundredResultTest() throws Exception {
        Athlete ai = new Athlete();
        ai.setFourHundredResult(100.11);
        assertEquals(ai.getFourHundredResult(), 100.11, 0);
    }

    @Test
    public void setAndGetOneTenHurdlesResultTest() throws Exception {
        Athlete ai = new Athlete();
        ai.setOneTenHurdlesResult(100.11);
        assertEquals(ai.getOneTenHurdlesResult(), 100.11, 0);
    }

    @Test
    public void setAndGetDiscusThrowResultTest() throws Exception {
        Athlete ai = new Athlete();
        ai.setDiscusThrowResult(100.11);
        assertEquals(ai.getDiscusThrowResult(), 100.11, 0);
    }

    @Test
    public void setAndGetPoleVaultResultTest() throws Exception {
        Athlete ai = new Athlete();
        ai.setPoleVaultResult(100);
        assertEquals(ai.getPoleVaultResult(), 100, 0);
    }

    @Test
    public void setAndGetJavelinThrowResultTest() throws Exception {
        Athlete ai = new Athlete();
        ai.setJavelinThrowResult(100.11);
        assertEquals(ai.getJavelinThrowResult(), 100.11, 0);
    }

    @Test
    public void setAndGetFifteenHundredResultTest() throws Exception {
        Athlete ai = new Athlete();
        ai.setFifteenHundredResult(100.11);
        assertEquals(ai.getFifteenHundredResult(), 100.11, 0);
    }

    @Test
    public void setAndGetTotalPointsTest() throws Exception {
        Athlete ai = new Athlete();
        ai.setTotalPoints(100);
        assertEquals(ai.getTotalPoints(), 100, 0);
    }
}