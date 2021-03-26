package com.globant.patterns.behavioral.chain_of_rspnsblty.support;

import lombok.Data;

@Data
public class File {

    private final String fileName;
    private final String fileType;
    private final String filePath;

    public File(String fileName, String fileType, String filePath) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.filePath = filePath;
    }
}
