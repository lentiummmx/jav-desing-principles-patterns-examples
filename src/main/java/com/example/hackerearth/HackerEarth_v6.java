package com.example.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HackerEarth_v6 {
    protected void finalize() {
        System.out.println("Coding!");
    }

    public static void main(String[] args) {
        HackerEarth_v6 hacker = new HackerEarth_v6();
        hacker = null;
        System.gc();
    }
}
