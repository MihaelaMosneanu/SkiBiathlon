package EnumsAnnotationsAssignment;

public class FinalStanding {
    private int position;
    private Athlete athlete;

    public FinalStanding(int position, Athlete athlete) {
        this.position = position;
        this.athlete = athlete;
    }

    public int getPosition() {
        return position;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public String getFinalTimeResult() {
        return athlete.getFinalTimeResult();
    }
}



