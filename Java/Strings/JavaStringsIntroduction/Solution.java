package Strings.JavaStringsIntroduction;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();

        String lexic = A.compareTo(B) > 0 ? "Yes" : "No";  /// ???

        A = A.substring(0,1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(A.length() + B.length());
        System.out.println(lexic);
        System.out.printf("%1$s %2$s",A,B);
    }
}
