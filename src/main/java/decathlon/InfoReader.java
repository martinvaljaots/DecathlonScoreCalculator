package main.java.decathlon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InfoReader {

    String filePath = "decathlon/decathlon_results.txt";

    public void loadFile() throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        Scanner file = new Scanner(new File(classLoader.getResource(filePath).getFile()));

        List<AthleteInfo> AthleteInfoList = new ArrayList<>();
        int i = 0;
        while (file.hasNextLine()) {
            String fileLine = file.nextLine();
            String[] splitLine = fileLine.split(";");

            AthleteInfo ai = new AthleteInfo();
            try {
                ai.setName(splitLine[0]);
                ai.setOneHunResult(Double.parseDouble(splitLine[1]));
                ai.setLongJResult(Integer.parseInt(splitLine[2]));
                ai.setShotPResult(Double.parseDouble(splitLine[3]));
                ai.setHighJResult(Integer.parseInt(splitLine[4]));
                ai.setFourHunResult(Double.parseDouble(splitLine[5]));
                ai.setOneTenHurdlesResult(Double.parseDouble(splitLine[6]));
                ai.setDiscusTResult(Double.parseDouble(splitLine[7]));
                ai.setPoleVResult(Integer.parseInt(splitLine[8]));
                ai.setJavelinTResult(Double.parseDouble(splitLine[9]));
                ai.setFifteenHunResult(Double.parseDouble(splitLine[10]));

                AthleteInfoList.add(i, ai);
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }

        }

        for (AthleteInfo aAthleteInfoList : AthleteInfoList) {
            System.out.println(aAthleteInfoList.getName() + " " + aAthleteInfoList.getOneHunResult() +
                    " " + aAthleteInfoList.getLongJResult() + " " + aAthleteInfoList.getShotPResult() +
                    " " + aAthleteInfoList.getHighJResult() + " " + aAthleteInfoList.getFourHunResult()
                    + " " + aAthleteInfoList.getOneTenHurdlesResult() + " " +
                    aAthleteInfoList.getDiscusTResult() + " " + aAthleteInfoList.getPoleVResult() +
                    " " + aAthleteInfoList.getJavelinTResult() + " " +
                    aAthleteInfoList.getFifteenHunResult());
        }
    }
}
