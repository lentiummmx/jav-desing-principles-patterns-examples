package com.globant.patterns.behavioral.chain_of_rspnsblty.handler.impl;

import com.globant.patterns.behavioral.chain_of_rspnsblty.handler.Handler;
import com.globant.patterns.behavioral.chain_of_rspnsblty.support.File;

public class DocFileHandler implements Handler {

    private Handler handler;
    private String handlerName;

    public DocFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {
        if(file.getFileType().equals("doc")){
            System.out.println("Process and saving doc file... by "+handlerName);
        }else if(handler!=null){
            System.out.println(handlerName+" forwards request to "+handler.getHandlerName());
            handler.process(file);
        }else{
            System.out.println("File not supported");
        }
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
