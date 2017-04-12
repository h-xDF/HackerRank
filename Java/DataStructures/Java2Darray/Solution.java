package DataStructures.Java2Darray;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static int[][] arr = new int[6][6];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    //    int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println(maxHourglass());
    }

    static int maxHourglass() {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 4; j++) {

                int sum = patternCount(i, j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    static int patternCount(int i, int j) {

        int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

        return sum;
    }
}
