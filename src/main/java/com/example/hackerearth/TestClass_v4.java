package com.example.hackerearth;

import java.io.*;
import java.util.*;


public class TestClass_v4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String S = br.readLine();
        long K = Long.parseLong(br.readLine().trim());

        int out_ = solve(S, K);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static int solve(String S, long K){
        // Write your code here

        return -1;
    }
}
