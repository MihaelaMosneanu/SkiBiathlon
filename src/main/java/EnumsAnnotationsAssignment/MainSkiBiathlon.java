package EnumsAnnotationsAssignment;

import java.io.*;
import java.util.List;


public class MainSkiBiathlon {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\Biathlon.csv"));
        List<Athlete> athletes = CsvParser.parseCsvData(br);
        List<FinalStanding> standings = StandingsCalculator.calculateStandings(athletes);

        System.out.println("Final Standings:");
        for (
                int i = 0; i < standings.size(); i++) {
            FinalStanding standing = standings.get(i);
            System.out.println((i + 1) + ". " + standing.getAthlete().getAthleteName() + " - " + standing.getFinalTimeResult());
        }
    }
}

