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
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String a = "a"; //scan.next();
        String b = "z"; //scan.next();

        scan.close();

        System.out.println( isAnagram(a, b) ? "Anagrams" : "Not Anagrams" );
    }
}

