package DataStructures.JavaList;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // length list
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int q = sc.nextInt(); // count query

        for (int i = 0; i < q; i++) {

            String command = sc.next();
            if (command.equals("Insert")) {
                int position = sc.nextInt();
                int value = sc.nextInt();
                list.add(position, value);
            } else if (command.equals("Delete")) {
                list.remove(sc.nextInt());
            } else {
                System.out.println("ERROR");
            }
        }

        for(int element : list) {
            System.out.printf("%d ",element);
        }
    }
}
