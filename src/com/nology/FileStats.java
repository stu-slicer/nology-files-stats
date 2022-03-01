package com.nology;

import java.time.LocalDateTime;

public interface FileStats {

    String getName();
    int getLineCount();
    int getWordCount();
    LocalDateTime getDateUpdated();

}
