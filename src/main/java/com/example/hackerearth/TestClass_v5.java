package com.example.hackerearth;

import java.io.*;
import java.util.*;

/**
 * see - https://www.hackerrank.com/challenges/frequency-queries/problem
 */
public class TestClass_v5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String arr[]=br.readLine().trim().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        int x = Integer.parseInt(arr[2]);
        String s = br.readLine();

        String out_ = solve(n, k, x, s);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static String solve(int n, int k, int x, String s){
        // Write your code here
        return null;
    }
}
