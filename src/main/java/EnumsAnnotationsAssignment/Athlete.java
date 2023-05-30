package EnumsAnnotationsAssignment;

public class Athlete implements Comparable<Athlete> {
    private int athleteNumber;
    private String athleteName;
    private String countryCode;
    private String skiTimeResult;
    private ShootingRangeResults shootingRangeResults;
    private String finalTimeResult;

    public Athlete(int athleteNumber, String athleteName, String countryCode, String skiTimeResult, ShootingRangeResults shootingRangeResults) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.shootingRangeResults = shootingRangeResults;
    }

    public int getAthleteNumber() {
        return athleteNumber;
    }

    public void setAthleteNumber(int athleteNumber) {
        this.athleteNumber = athleteNumber;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getSkiTimeResult() {
        return skiTimeResult;
    }

    public void setSkiTimeResult(String skiTimeResult) {
        this.skiTimeResult = skiTimeResult;
    }

    public ShootingRangeResults getShootingRangeResults() {
        return shootingRangeResults;
    }

    public void setShootingRangeResults(ShootingRangeResults shootingRangeResults) {
        this.shootingRangeResults = shootingRangeResults;
    }

    public String getFinalTimeResult() {
        return finalTimeResult;
    }

    public void setFinalTimeResult(String finalTimeResult) {
        this.finalTimeResult = finalTimeResult;
    }

    @Override
    public int compareTo(Athlete other) {
        return this.finalTimeResult.compareTo(other.finalTimeResult);
    }
}
