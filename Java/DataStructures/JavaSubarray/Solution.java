package DataStructures.JavaSubarray;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // start solved
        int count = 0;
        for (int size = 1; size <= n; size ++) {

            for (int start = 0; start <= (n - size); start += size ) {

                int subSum = 0;
                 for (int i = start; start <= start + size; start ++) {

                     subSum += arr[i];
                 }
                 if (subSum < 0) {count ++;}
            }
        }

        System.out.println(count);
    }
}