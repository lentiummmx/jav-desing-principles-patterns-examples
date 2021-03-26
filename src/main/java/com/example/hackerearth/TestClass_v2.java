package com.example.hackerearth;

import java.io.*;
import java.util.*;
import java.util.stream.*;

/**
 * see - https://www.geeksforgeeks.org/number-of-subarrays-with-odd-sum/
 */
public class TestClass_v2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_A = br.readLine().split(" ");
        int[] A = new int[N];
        for(int i_A = 0; i_A < arr_A.length; i_A++)
        {
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }

        long out_ = countSubarray(N, A);
        //long out_ = countSubarray_v2(N, A);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static long countSubarray(int N, int[] A){
        // Write your code here
        int arraysCount = 0;
        //List<Integer> odds = Arrays.stream(A).boxed().collect(Collectors.toList());
//        System.out.println("before: " + odds.size());
        //odds = odds.stream().filter(vl -> vl % 2 != 0).collect(Collectors.toList());
//        System.out.println("after: " + odds.size());
        //arraysCount = odds.size();
        int pairIndex;
        for(int i = 0; i < A.length; i++){
            if (A[i] % 2 != 0) {
                arraysCount++;
            } else {
                pairIndex = i;
            }
        }




        return arraysCount;
    }

    static long countSubarray_v2(int N, int[] A){
        int temp[] = {1, 0};

        int result = 0, val = 0;

        for (int i = 0; i <= N - 1; i++) {
            val = (val + A[i]) % 2;
            temp[val]++;
        }

        result = temp[0] * temp[1];

        return result;
    }
}
