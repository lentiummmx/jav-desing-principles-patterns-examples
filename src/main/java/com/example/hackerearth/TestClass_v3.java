package com.example.hackerearth;

import java.io.*;
import java.util.*;

/**
 * see - https://www.geeksforgeeks.org/lexicographic-smallest-permutation-of-a-string-containing-the-second-string-as-a-substring/?ref=rp
 * see - https://www.geeksforgeeks.org/lexicographically-smallest-substring-with-maximum-occurrences-containing-as-and-bs-only/?ref=rp
 * see - https://www.geeksforgeeks.org/count-of-substrings-of-a-string-containing-another-given-string-as-a-substring/?ref=rp
 * see - https://www.geeksforgeeks.org/number-of-sub-strings-which-are-anagram-of-any-sub-string-of-another-string/?ref=rp
 */
public class TestClass_v3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String A = br.readLine();
        String B = br.readLine();

        int out_ = smallest_common_substrings(A, B);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static int smallest_common_substrings(String A, String B){
        // Write your code here

        return -1;
    }
}
