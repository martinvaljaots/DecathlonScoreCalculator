package main.decathlon;


public class Athlete {
    /**
     * Explanatory comments for variables are marked as:
     * field/variable name - unit of measurement
     *
     * Units for certain events:
     * track events (100m, 400m, 110m, 1500m) - time in seconds
     * jumps (long jump, high jump, pole vault) - centimeters
     * throws (shot put, discus throw, javelin throw)- meters
     */

    //athlete name - letters
    private String name;
    //100m - seconds
    private double oneHundredResult;
    //long jump - centimeters
    private int longJumpResult;
    //shot put - meters
    private double shotPutResult;
    //high jump - centimeters
    private int highJumpResult;
    //400m - seconds
    private double fourHundredResult;
    //110m hurdles - seconds
    private double oneTenHurdlesResult;
    //discus throw - meters
    private double discusThrowResult;
    //pole vault - centimeters
    private int poleVaultResult;
    //javelin throw - meters
    private double javelinThrowResult;
    //1500m - seconds
    private double fifteenHundredResult;
    //total points - int value
    private int totalPoints;


    public void setName(String name) {
        this.name = name;
    }

    public void setOneHundredResult(double oneHundredResult) {
        this.oneHundredResult = oneHundredResult;
    }

    public void setLongJumpResult(int longJumpResult) {
        this.longJumpResult = longJumpResult;
    }

    public void setShotPutResult(double shotPutResult) {
        this.shotPutResult = shotPutResult;
    }

    public void setHighJumpResult(int highJumpResult) {
        this.highJumpResult = highJumpResult;
    }

    public void setFourHundredResult(double fourHundredResult) {
        this.fourHundredResult = fourHundredResult;
    }

    public void setOneTenHurdlesResult(double oneTenHurdlesResult) {
        this.oneTenHurdlesResult = oneTenHurdlesResult;
    }

    public void setDiscusThrowResult(double discusThrowResult) {
        this.discusThrowResult = discusThrowResult;
    }

    public void setPoleVaultResult(int poleVaultResult) {
        this.poleVaultResult = poleVaultResult;
    }

    public void setJavelinThrowResult(double javelinThrowResult) {
        this.javelinThrowResult = javelinThrowResult;
    }

    public void setFifteenHundredResult(double fifteenHundredResult) {
        this.fifteenHundredResult = fifteenHundredResult;
    }

    public void setTotalPoints(int totalPoints) { this.totalPoints = totalPoints; }

    public String getName() {
        return this.name;
    }

    public double getOneHundredResult() {
        return this.oneHundredResult;
    }

    public int getLongJumpResult() {
        return this.longJumpResult;
    }

    public double getShotPutResult() {
        return this.shotPutResult;
    }

    public int getHighJumpResult() {
        return this.highJumpResult;
    }

    public double getFourHundredResult() {
        return this.fourHundredResult;
    }

    public double getOneTenHurdlesResult() {
        return this.oneTenHurdlesResult;
    }

    public double getDiscusThrowResult() {
        return this.discusThrowResult;
    }

    public int getPoleVaultResult() {
        return this.poleVaultResult;
    }

    public double getJavelinThrowResult() { return this.javelinThrowResult; }

    public double getFifteenHundredResult() {
        return this.fifteenHundredResult;
    }

    public int getTotalPoints() { return this.totalPoints; }

}
