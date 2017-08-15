package main.java.decathlon;


import javafx.scene.control.Tab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InfoReader {

    String filePath = "decathlon/decathlon_results.txt";

    public void loadFile() throws FileNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        Scanner file = new Scanner(new File(classLoader.getResource(filePath).getFile()));

        List<AthleteInfo> AthleteInfoList = new ArrayList<>();
        while (file.hasNextLine()) {
            System.out.println(file.nextLine());
        }
    }
}
