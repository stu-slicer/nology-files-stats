package com.nology;

import java.io.IOException;
import java.nio.file.Path;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;

public class FileStatsGenerator {

    private FileReader fileReader = new FileReader();

    public FileStats generate(String file) {

        List<String> lines = fileReader.readFile(file);

        FileStatsImpl stats = new FileStatsImpl();

        stats.setName( getFileName(file) );
        stats.setLineCount( getLineCount(lines) );
        stats.setWordCount( getWordCount(lines) );
        stats.setDateUpdated( getDateUpdated(file) );

        return stats;
    }

    private String getFileName(String file) {
        return Path.of( file ).toFile().getAbsolutePath();
    }

    private int getLineCount(List<String> lines) {
        return lines.size();
    }

    private int getWordCount(List<String> lines) {
        return (int) lines.stream()
                .flatMap( L -> Arrays.stream( L.split(" +") ) )
                .count();
    }

    private LocalDateTime getDateUpdated(String file) {
        long lastModified = Path.of(file).toFile().lastModified();
        return Instant.ofEpochMilli(lastModified).atZone( ZoneId.systemDefault()).toLocalDateTime();
    }

}
