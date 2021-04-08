package com.globant.pop.v2;

import java.util.Collections;
import java.util.List;

public interface Actor extends Artist {

    List<String> movies = Collections.emptyList();

    void addMovie(String movie);

}
