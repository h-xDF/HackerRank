package Strings.JavaStringCompare;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int k = in.nextInt();

        // start = 0, end = end - 1;
        String minSubStr = str.substring(0, k);
        String maxSubStr = str.substring(0, k);

        for (int i = 1; i <= str.length() - k; i ++) {

            String Buf = str.substring(i, i + k);

            if (Buf.compareTo(maxSubStr) > 0) {
                maxSubStr = Buf;
            }

            if (Buf.compareTo(minSubStr) < 0) {
                minSubStr = Buf;
            }
        }

        System.out.println(minSubStr);
        System.out.println(maxSubStr);
    }
}
