package main.decathlon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class containing readFile() method for reading the results file.
 */
public class InfoReader {
    /**
     * Method for reading the results file and separating the results into Athlete instances.
     * Returns a list of Athlete instances, one for every line of the file.
     */
    public List<Athlete> readFile(String filePath) throws ArrayIndexOutOfBoundsException, NumberFormatException {
        InputStream is = getClass().getResourceAsStream(filePath);
        Scanner scanFile = new Scanner(new BufferedInputStream(is));

        List<Athlete> athleteList = new ArrayList<>();
        int i = 0;
        while (scanFile.hasNextLine()) {
            String fileLine = scanFile.nextLine();
            String[] splitLine = fileLine.split(";");

            Athlete ai = new Athlete();
            ai.setName(splitLine[0]);
            ai.setOneHundredResult(Double.parseDouble(splitLine[1]));
            ai.setLongJumpResult(Integer.parseInt(splitLine[2]));
            ai.setShotPutResult(Double.parseDouble(splitLine[3]));
            ai.setHighJumpResult(Integer.parseInt(splitLine[4]));
            ai.setFourHundredResult(Double.parseDouble(splitLine[5]));
            ai.setOneTenHurdlesResult(Double.parseDouble(splitLine[6]));
            ai.setDiscusThrowResult(Double.parseDouble(splitLine[7]));
            ai.setPoleVaultResult(Integer.parseInt(splitLine[8]));
            ai.setJavelinThrowResult(Double.parseDouble(splitLine[9]));
            ai.setFifteenHundredResult(Double.parseDouble(splitLine[10]));

            athleteList.add(i, ai);
            i++;
        }

        return athleteList;
    }
}
