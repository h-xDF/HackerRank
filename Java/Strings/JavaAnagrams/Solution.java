package Strings.JavaAnagrams;

import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {

        char[] first = a.toLowerCase().toCharArray();
        char[] second = b.toLowerCase().toCharArray();
        // if length of strings is not same
        if (first.length != second.length) {
            return false;
        }
        int[] counts = new int[26];
        for (int i = 0; i < first.length; i++) {
            counts[first[i] - 97]++;
            counts[second[i] - 97]--;
        }
        for (int i = 0; i < 26; i++) {
            if (counts[i] != 0) {
                return false;
            }
        }
        return true;

        /*System.out.println(countCodeChar(a));
        System.out.println(countCodeChar(b));

        return (countCodeChar(a) == countCodeChar(b)) ? true : false;*/
    }

    /*static int countCodeChar(String s) {

        int buf = 0;
        for (Character ch: s.toLowerCase().toCharArray()) {

            buf += (int) ch;
        }
        return buf;
    }*/


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // 16 Test Case
        String a = "a"; //scan.next();
        String b = "z"; //scan.next();

        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

