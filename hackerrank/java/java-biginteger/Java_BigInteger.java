import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger m, n;

        m = in.nextBigInteger();
        n = in.nextBigInteger();
        System.out.println(m.add(n));
        System.out.println(m.multiply(n));
    }
}