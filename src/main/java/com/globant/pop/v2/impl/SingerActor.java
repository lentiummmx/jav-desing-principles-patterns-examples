package com.globant.pop.v2.impl;

import com.globant.pop.v2.Actor;

public class SingerActor extends OnlySinger implements Actor {
    @Override
    public void addMovie(String movie) {
        movies.add(movie);
    }
}
