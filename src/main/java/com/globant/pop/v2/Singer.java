package com.globant.pop.v2;

import java.util.Collections;
import java.util.List;

public interface Singer extends Artist {

    List<String> songs = Collections.emptyList();

    void addSong(String song);

}
