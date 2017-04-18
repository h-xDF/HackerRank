package DataStructures.JavaMap;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            map.put(name, phone);
            in.nextLine();
        }

        while(in.hasNext()) {
            String s = in.nextLine();
            System.out.println((map.containsKey(s)) ? s + "=" + map.get(s) : "Not found");
        }
    }
}
