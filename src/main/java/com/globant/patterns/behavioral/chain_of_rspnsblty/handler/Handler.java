package com.globant.patterns.behavioral.chain_of_rspnsblty.handler;

import com.globant.patterns.behavioral.chain_of_rspnsblty.support.File;

public interface Handler {

    public void setHandler(Handler handler);
    public void process(File file);
    public String getHandlerName();

}
