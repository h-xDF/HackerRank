package DataStructures.JavaArrayList;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine()); // Count line

        ArrayList<List<Integer>> arr = new ArrayList<List<Integer>>();

        // init 2D array
        for(int i = 0; i < N; i++) {

            int count = sc.nextInt();
            arr.add(new ArrayList<Integer>());

            for(int j = 0; j < count; j++) {

                arr.get(i).add(sc.nextInt());
            }
        }

        int M = sc.nextInt();// count check

        // coordinate 'check'
        int x,y;

        for (int i = 0; i < M; i ++) {
            x = sc.nextInt();
            y = sc.nextInt();

            try {
                System.out.println(arr.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
