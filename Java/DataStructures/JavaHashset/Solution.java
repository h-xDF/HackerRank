package DataStructures.JavaHashset;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        //s.next();
        Set<String> set = new HashSet<>();

        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {

            pair_left[i] = s.next();
            pair_right[i] = s.next();

            String pair = pair_left[i] + ' ' + pair_right[i];
            set.add(pair);
            System.out.println(set.size());
        }

        for (String pair : set) {
            System.out.println(pair);
        }

        System.out.println("++++++++++++++++++++++++++++++");

        Set<String> left = new HashSet<>();
        Set<String> right = new HashSet<>();

        for (int i = 0; i < t; i++) {
            left.add(pair_left[i]);
            right.add(pair_right[i]);
            System.out.println( left.size() > right.size() ? left.size() : right.size());
        }
    }
}
