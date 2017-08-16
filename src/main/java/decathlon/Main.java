package main.java.decathlon;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
	// runs InfoReader.loadFile for the time being
    InfoReader ir = new InfoReader();
    try{
        ir.loadFile();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    }
}
