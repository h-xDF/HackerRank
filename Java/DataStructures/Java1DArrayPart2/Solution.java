package DataStructures.Java1DArrayPart2;

import java.util.*;

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

            System.out.println(isSolved(arr,m, 0) ? "YES" : "NO");
        }

        sc.close();
    }

    private static Boolean isSolved(int[] arr, int bigStep, int newPosition) {

        if ( newPosition < 0 || arr[newPosition] == 1) {
            return false;
        } else if (newPosition + 1 >= arr.length ||  newPosition + bigStep >= arr.length) {
            return true;
        } else {
            arr[newPosition] = 1; // is no loop
            return     isSolved(arr, bigStep, newPosition - 1)
                    || isSolved(arr, bigStep, newPosition + 1)
                    || isSolved(arr, bigStep, newPosition + bigStep);
        }
    }
}
