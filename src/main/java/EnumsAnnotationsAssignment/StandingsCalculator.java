package EnumsAnnotationsAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StandingsCalculator {
    public static List<FinalStanding> calculateStandings(List<Athlete> athletes) {

        for (Athlete athlete : athletes) {
            int penalty = calculatePenalty(athlete.getShootingRangeResults());
            athlete.setFinalTimeResult(calculateFinalTime(athlete.getSkiTimeResult(), penalty));
        }
        Collections.sort(athletes);
        List<FinalStanding> standings = new ArrayList<>();
        for (int i = 0; i < athletes.size(); i++) {
            Athlete athlete = athletes.get(i);
            standings.add(new FinalStanding(i + 1, athlete));
        }

        return standings;
    }

    private static int calculatePenalty(ShootingRangeResults shootingRangeResults) {
        int penalty = 0;
        penalty += countMissedShots(shootingRangeResults.getFirstShootingResult().toCharArray());
        penalty += countMissedShots(shootingRangeResults.getSecondShootingResult().toCharArray());
        penalty += countMissedShots(shootingRangeResults.getThirdShootingResult().toCharArray());
        return penalty;
    }

    private static int countMissedShots(char[] shootingResult) {
        int count = 0;
        char miss = ShotResult.MISS.asChar();
        for (char c : shootingResult) {
            if (c == miss) {
                count++;
            }
        }
        return count;
    }

    private static String calculateFinalTime(String skiTimeResult, int penalty) {
        String[] timeParts = skiTimeResult.split(":");
        int minutes = Integer.parseInt(timeParts[0]);
        int seconds = Integer.parseInt(timeParts[1]);
        int totalSeconds = minutes * 60 + seconds + penalty;
        int finalMinutes = totalSeconds / 60;
        int finalSeconds = totalSeconds % 60;
        return String.format("%02d:%02d", finalMinutes, finalSeconds);
    }
}
