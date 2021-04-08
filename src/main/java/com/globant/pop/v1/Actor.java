package com.globant.pop.v1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface Actor extends Artist {

    List<String> movies = Collections.emptyList();

    void addMovie(String movie);

}
