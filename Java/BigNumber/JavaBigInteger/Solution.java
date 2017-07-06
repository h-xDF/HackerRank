package BigNumber.JavaBigInteger;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// use BigInteger
public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());

        sc.close();

        System.out.println(b.add(a)); // sum
        System.out.println(b.multiply(a)); // multiply
    }
}
