package com.example.hackerearth;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
 */
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
/*
//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass_v6 {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();                // Reading input from STDIN
        String p = br.readLine();                // Reading input from STDIN

        String[] a_split = a.split("");
        String[] p_split = p.split("");

        int count_votes = 0;
        for (int i = 0; i < a_split.length; i++){
            if (a_split[i].equals(p_split[i])) {
                count_votes++;
            }
        }

        System.out.println(count_votes);    // Writing output to STDOUT
    }
}
/*
    INPUT
    110101
    101101

    OUTPUT
    4
 */
