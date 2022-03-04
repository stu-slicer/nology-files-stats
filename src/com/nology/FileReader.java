package com.nology;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    /**
     * Opens the given file and reads into a List.
     * @param file
     * @return
     */
    public List<String> readFile(String file) {

        Path filePath = Path.of(file);

        try {
            BufferedReader reader = Files.newBufferedReader(filePath);

            String line;
            List<String> lines = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            return lines;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return List.of();
    }

}
