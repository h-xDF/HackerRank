package Strings.JavaStringTokens;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //String s = scan.nextLine();
        // Write your code here.
        //scan.close();

        String str = "This is an example string, right?  Yes!";
        String delims = "[^A-Za-z]+";//"[ !,?._'@]+";
        String[] tokens = str.split(delims);

        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
