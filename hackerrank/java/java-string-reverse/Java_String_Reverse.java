import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int len = A.length();
        /* Enter your code here. Print output to STDOUT. */

        boolean ans = false;
        int reserve = len;
        if( len != 1 )
        {
            for( int i = 0; i < (( len % 2 == 0)? len/2 : (len-1)/2); i++ )
            {
                if( A.charAt(i) == A.charAt(--reserve) )
                {
                    ans = true;
                    continue;
                }
                else
                {
                    ans = false;
                    break;
                }
            }
        } else ans = true;

        if( ans ) System.out.println("Yes");
        else System.out.println("No");

    }
}



