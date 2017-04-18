package DataStructures.JavaList;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // length list
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int q = sc.nextInt(); // count query
        String command;
        for (int i = 0; i < q; i++) {
            command = sc.next();
            if (command.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x,y);
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
