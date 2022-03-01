package com.nology;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader {

    public List<String> readFile(String file) throws IOException {

        Path filePath = Path.of(file);

        List<String> allLines = Files.readAllLines(filePath);

        return allLines;
    }

}
