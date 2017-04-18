package DataStructures.Java1DArrayPart2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt(); // length track
            int[] arr = new int[n];
            int m = sc.nextInt(); // big step

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            System.out.println(isSolved(arr,0,m,m)||isSolved(arr,0,1,m) ? "YES" : "NO");
        }
    }

    private static Boolean isSolved(int[] arr, int position, int step, int m) {

        int newPosition = position + step;
        if(newPosition >= arr.length) {
            return true;
        } else if(arr[newPosition] == 1) {
            return false;
        } else {
            arr[position] = 1; // marks as visited
            return isSolved(arr,newPosition, 1,m) || isSolved(arr,newPosition, -1,m) || isSolved(arr,newPosition, m,m);
        }
    }

}
