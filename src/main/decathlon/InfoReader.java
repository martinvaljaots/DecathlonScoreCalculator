package main.decathlon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InfoReader {

    private String filePath = "/decathlon/decathlon_results.txt";

    public List<Athlete> loadFile() throws FileNotFoundException {
        InputStream is = getClass().getResourceAsStream(filePath);
        Scanner scanFile = new Scanner(new BufferedInputStream(is));

        List<Athlete> athleteList = new ArrayList<>();
        int i = 0;
        while (scanFile.hasNextLine()) {
            String fileLine = scanFile.nextLine();
            String[] splitLine = fileLine.split(";");

            Athlete ai = new Athlete();
            try {
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
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }

        }

        return athleteList;
    }
}
