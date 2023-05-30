package EnumsAnnotationsAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {
    private static final String CSV_SEPARATOR = ",";

    public static List<Athlete> parseCsvData(BufferedReader reader) throws IOException {
        List<Athlete> athletes = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            String[] columns = line.split(CSV_SEPARATOR);
            if (columns.length >= 7) {
                int athleteNumber = Integer.parseInt(columns[0].trim());
                String athleteName = columns[1].trim();
                String countryCode = columns[2].trim();
                String skiTimeResult = columns[3].trim();
                String firstShootingResult = columns[4].trim();
                String secondShootingResult = columns[5].trim();
                String thirdShootingResult = columns[6].trim();

                ShootingRangeResults shootingRangeResults = new ShootingRangeResults();
                shootingRangeResults.setFirstShootingResult(firstShootingResult);
                shootingRangeResults.setSecondShootingResult(secondShootingResult);
                shootingRangeResults.setThirdShootingResult(thirdShootingResult);

                Athlete athlete = new Athlete(athleteNumber, athleteName, countryCode, skiTimeResult, shootingRangeResults);
                athletes.add(athlete);
            }
        }

        return athletes;
    }
}





