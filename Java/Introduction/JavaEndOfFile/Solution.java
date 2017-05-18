package Introduction.JavaEndOfFile;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i = 1;

        while (in.hasNext()) {

            System.out.printf("%d %s%n",i++,in.nextLine());
        }

        in.close();
    }
}
