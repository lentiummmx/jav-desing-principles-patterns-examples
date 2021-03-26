package com.globant.patterns.behavioral.chain_of_rspnsblty;

import com.globant.patterns.behavioral.chain_of_rspnsblty.handler.Handler;
import com.globant.patterns.behavioral.chain_of_rspnsblty.handler.impl.*;
import com.globant.patterns.behavioral.chain_of_rspnsblty.support.File;

public class TestChainOfResponsibility {
    public static void main(String[] args) {
        File file = null;
        Handler audioHandler = new AudioFileHandler("Audio Handler");
        Handler docHandler = new DocFileHandler("Doc Handler");
        Handler excelHandler = new ExcelFileHandler("Excel Handler");
        Handler textHandler = new TextFileHandler("Text Handler");
        Handler imageHandler = new ImageFileHandler("Image Handler");
        Handler videoHandler = new VideoFileHandler("Video Handler");

        audioHandler.setHandler(docHandler);
        docHandler.setHandler(excelHandler);
        excelHandler.setHandler(imageHandler);
        imageHandler.setHandler(textHandler);
        textHandler.setHandler(videoHandler);

        file = new File("Abc.jpg", "image", "~/Downloads");
        audioHandler.process(file);

        System.out.println();

        file = new File("Abc.mp3", "audio", "~/Downloads");
        audioHandler.process(file);

        System.out.println();

        file = new File("Abc.doc", "doc", "~/Downloads");
        audioHandler.process(file);

        System.out.println();

        file = new File("Abc.bat", "bat", "~/Downloads");
        audioHandler.process(file);
    }
}
