package main.java.decathlon;

/**
 * Created by Smarta on 15.08.2017.
 */
public class AthleteInfo {
    /**
     * Explanatory comments for variables are marked as:
     * field/variable name - unit of measurement
     *
     * Units for certain events:
     * track events - time in seconds
     * jumps - centimeters
     * throws - meters
     */

    //athlete name - letters
    private String name;
    //100m - seconds
    private double oneHunResult;
    //long jump - centimeters
    private int longJResult;
    //shot put - meters
    private double shotPResult;
    //high jump - centimeters
    private int highJResult;
    //400m - seconds
    private double fourHunResult;
    //110m hurdles - seconds
    private double oneTenHurdlesResult;
    //discus throw - meters
    private double discusTResult;
    //pole vault - centimeters
    private int poleVResult;
    //javelin throw - meters
    private double javelinTResult;
    //1500m - seconds
    private double fifteenHunResult;


    public void setName(String name) {
        this.name = name;
    }

    public void setOneHunResult(double oneHunResult) {
        this.oneHunResult = oneHunResult;
    }

    public void setLongJResult(int longJResult) {
        this.longJResult = longJResult;
    }

    public void setShotPResult(double shotPResult) {
        this.shotPResult = shotPResult;
    }

    public void setHighJResult(int highJResult) {
        this.highJResult = highJResult;
    }

    public void setFourHunResult(double fourHunResult) {
        this.fourHunResult = fourHunResult;
    }

    public void setOneTenHurdlesResult(double oneTenHurdlesResult) {
        this.oneTenHurdlesResult = oneTenHurdlesResult;
    }

    public void setDiscusTResult(double discusTResult) {
        this.discusTResult = discusTResult;
    }

    public void setPoleVResult(int poleVResult) {
        this.poleVResult = poleVResult;
    }

    public void setJavelinTResult(double javelinTResult) {
        this.javelinTResult = javelinTResult;
    }

    public void setFifteenHunResult(double fifteenHunResult) {
        this.fifteenHunResult = fifteenHunResult;
    }

    public String getName() {
        return this.name;
    }

    public double getOneHunResult() {
        return this.oneHunResult;
    }

    public double getLongJResult() {
        return this.longJResult;
    }

    public double getShotPResult() {
        return this.shotPResult;
    }

    public double getHighJResult() {
        return this.highJResult;
    }

    public double getFourHunResult() {
        return this.fourHunResult;
    }

    public double getOneTenHurdlesResult() {
        return this.oneTenHurdlesResult;
    }

    public double getDiscusTResult() {
        return this.discusTResult;
    }

    public double getPoleVResult() {
        return this.poleVResult;
    }

    public double getJavelinTResult() { return this.javelinTResult; }

    public double getFifteenHunResult() {
        return this.fifteenHunResult;
    }

}
