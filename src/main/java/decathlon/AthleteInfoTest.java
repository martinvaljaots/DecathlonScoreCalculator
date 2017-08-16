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
    public void setAndGetOneHunResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setOneHunResult(100.11);
        assertEquals(ai.getOneHunResult(), 100.11, 0);
    }

    @Test
    public void setAndGetLongJResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setLongJResult(100);
        assertEquals(ai.getLongJResult(), 100, 0);
    }

    @Test
    public void setAndGetShotPResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setShotPResult(100.11);
        assertEquals(ai.getShotPResult(), 100.11, 0);
    }

    @Test
    public void setAndGetHighJResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setHighJResult(100);
        assertEquals(ai.getHighJResult(), 100, 0);
    }

    @Test
    public void setAndGetFourHunResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setFourHunResult(100.11);
        assertEquals(ai.getFourHunResult(), 100.11, 0);
    }

    @Test
    public void setAndGetOneTenHurdlesResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setOneTenHurdlesResult(100.11);
        assertEquals(ai.getOneTenHurdlesResult(), 100.11, 0);
    }

    @Test
    public void setAndGetDiscusTResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setDiscusTResult(100.11);
        assertEquals(ai.getDiscusTResult(), 100.11, 0);
    }

    @Test
    public void setPoleVResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setPoleVResult(100);
        assertEquals(ai.getPoleVResult(), 100, 0);
    }

    @Test
    public void setJavelinTResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setJavelinTResult(100.11);
        assertEquals(ai.getJavelinTResult(), 100.11, 0);
    }

    @Test
    public void setFifteenHunResultTest() throws Exception {
        AthleteInfo ai = new AthleteInfo();
        ai.setFifteenHunResult(100.11);
        assertEquals(ai.getFifteenHunResult(), 100.11, 0);
    }
}