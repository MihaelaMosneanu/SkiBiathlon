import EnumsAnnotationsAssignment.Athlete;
import EnumsAnnotationsAssignment.CsvParser;
import EnumsAnnotationsAssignment.FinalStanding;
import EnumsAnnotationsAssignment.StandingsCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class StandingsCalculatorTest {

    @Test
    public void testCalculateStandings() throws IOException {
        String csvData = "11,Umar Jorgson,SK,30:27,xxxox,xxxxx,xxoxo\n" +
                "1,Jimmy Smiles,UK,29:15,xxoox,xooxo,xxxxo\n" +
                "27,Piotr Smitzer,CZ,30:10,xxxxx,xxxxx,xxxxx";
        Reader inputString = new StringReader(csvData);
        BufferedReader reader = new BufferedReader(inputString);
        List<Athlete> athletes = CsvParser.parseCsvData(reader);


        List<FinalStanding> standings = StandingsCalculator.calculateStandings(athletes);


        Assertions.assertEquals(3, standings.size());


        FinalStanding firstPlace = standings.get(0);
        Assertions.assertEquals(1, firstPlace.getPosition());
        Assertions.assertEquals("Jimmy Smiles", firstPlace.getAthlete().getAthleteName());
        Assertions.assertEquals("29:21", firstPlace.getAthlete().getFinalTimeResult());


        FinalStanding secondPlace = standings.get(1);
        Assertions.assertEquals(2, secondPlace.getPosition());
        Assertions.assertEquals("Piotr Smitzer", secondPlace.getAthlete().getAthleteName());
        Assertions.assertEquals("30:10", secondPlace.getAthlete().getFinalTimeResult());


        FinalStanding thirdPlace = standings.get(2);
        Assertions.assertEquals(3, thirdPlace.getPosition());
        Assertions.assertEquals("Umar Jorgson", thirdPlace.getAthlete().getAthleteName());
        Assertions.assertEquals("30:30", thirdPlace.getAthlete().getFinalTimeResult());
    }
}


