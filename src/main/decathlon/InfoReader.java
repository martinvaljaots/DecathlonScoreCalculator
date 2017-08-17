package main.decathlon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InfoReader {

    private String filePath = "decathlon/decathlon_results.txt";

    public List<AthleteInfo> loadFile() throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(filePath).getFile());
        Scanner scanFile = new Scanner(file);

        List<AthleteInfo> AthleteInfoList = new ArrayList<>();
        int i = 0;
        while (scanFile.hasNextLine()) {
            String fileLine = scanFile.nextLine();
            String[] splitLine = fileLine.split(";");

            AthleteInfo ai = new AthleteInfo();
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

                AthleteInfoList.add(i, ai);
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }

        }

        return AthleteInfoList;
    }
}
