package com.example.hackerearth;

import java.io.*;
import java.util.*;
import java.util.stream.*;

/**
 * see - https://www.geeksforgeeks.org/find-second-largest-element-array/?ref=rp
 */
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_Array = br.readLine().split(" ");
        int[] Array = new int[N];
        for(int i_Array = 0; i_Array < arr_Array.length; i_Array++)
        {
            Array[i_Array] = Integer.parseInt(arr_Array[i_Array]);
        }
        int Q = Integer.parseInt(br.readLine().trim());
        int[][] Queries = new int[Q][2];
        for(int i_Queries = 0; i_Queries < Q; i_Queries++)
        {
            String[] arr_Queries = br.readLine().split(" ");
            for(int j_Queries = 0; j_Queries < arr_Queries.length; j_Queries++)
            {
                Queries[i_Queries][j_Queries] = Integer.parseInt(arr_Queries[j_Queries]);
            }
        }

        int[] out_ = solve(N, Q, Array, Queries);
        System.out.println(out_[0]);
        for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
        {
            System.out.println(out_[i_out_]);
        }

        wr.close();
        br.close();
    }
    static int[] solve(int N, int Q, int[] Array, int[][] Queries){
        // Write your code here
        int[] result = new int[Q];
        for(int i = 0; i < Q; i++){
            List<Integer> lst = Arrays.stream(Array).boxed().collect(Collectors.toList());
            Collections.sort(lst, Collections.reverseOrder());

            int query_result = 0;
            int[] range = Queries[i];
            List<Integer> queryLst = lst.subList(range[0], range[1]);

            Integer secondGreat = queryLst.get(1);

            Map<Integer, Integer> mp = new HashMap();
            for (Integer el : queryLst){
                if(mp.get(el) != null){
                    mp.put(el, mp.get(el) + 1);
                } else {
                    mp.put(el, 1);
                }
            }

            Set<Map.Entry<Integer, Integer>> values = mp.entrySet();
            for (Map.Entry<Integer, Integer> tuple : values){
                if(tuple.getValue() == secondGreat){
                    query_result++;
                }
            }


            result[i] = query_result;
        }
        return result;
    }
}
