package BigNumber.JavaPrimalityTest;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();

        // certainty = 10 -> 1-(1/2)^10
        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
    }
}
