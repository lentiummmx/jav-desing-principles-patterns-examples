package com.globant.pop.v1;

import java.util.Collections;
import java.util.List;

public interface Singer extends Actor {

    List<String> songs = Collections.emptyList();

    void addSong(String song);

}
