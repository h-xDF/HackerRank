package DataStructures.JavaHashset;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        //s.next();
        Set<String> set = new HashSet<>();

        /*String[] pair_left = new String[t];
        String[] pair_right = new String[t];*/

        for (int i = 0; i < t; i++) {

            String pair = s.nextLine();
            set.add(pair);
            System.out.println(set.size());
            /*pair_left[i] = s.next();
            pair_right[i] = s.next();*/
        }

        for (String pair : set) {
            System.out.println(pair);
        }
    }
}
