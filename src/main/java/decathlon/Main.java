package main.java.decathlon;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
	// write your code here
    InfoReader ir = new InfoReader();
    try{
        ir.loadFile();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    }
}
