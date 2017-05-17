package Arrays.AlgorithmicCrush;

import java.io.*;
import java.util.*;

/**
 5 3
 1 2 100
 2 5 100
 3 4 100
 */

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();// size array
        int countIter = sc.nextInt();

        int[] arr = new int[size];
        int startIndex = 0;
        int finishIndex = 0;
        int delta = 0;
        int max = 0; // global max

        for (int i = 0; i < countIter; i++) {

            startIndex = sc.nextInt();
            finishIndex = sc.nextInt();
            delta = sc.nextInt();

            for (int j = startIndex - 1; j < finishIndex; j++) {
                arr[j] += delta;
                if (arr[j] > max) {max = arr[j];}
            }
        }

        System.out.println(max);

    }
}