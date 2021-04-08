package com.globant.pop.v2.impl;

import com.globant.pop.v2.Singer;

public class OnlySinger implements Singer {
    @Override
    public void addSong(String song) {
        songs.add(song);
    }
}
