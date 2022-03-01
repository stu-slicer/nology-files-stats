package com.nology;

import java.io.IOException;

public class Main {

    public static final String FILE = "bohemian-rhapsody.txt";
    public static final String FILE2 = "life-on-mars.txt";

    public static void main(String[] args) throws IOException {

        FileStatsGenerator generator = new FileStatsGenerator();
        FileStats fileStats = generator.generate(FILE);

        System.out.println("Name: " + fileStats.getName());
        System.out.println("Line count: " + fileStats.getLineCount());
        System.out.println("Word count: " + fileStats.getWordCount());
        System.out.println("Date updated: " + fileStats.getDateUpdated());

    }
}
