package DataStructures.JavaArrayList;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < N; i++) {

            arr.add(new ArrayList<Integer>());
            int row = sc.nextInt();
            for ( int j = 0; j < row; i++) {
                arr.get(i).add(j, sc.nextInt());
            }
        }

        System.out.println(arr.get(0).get(0));
    }
}
