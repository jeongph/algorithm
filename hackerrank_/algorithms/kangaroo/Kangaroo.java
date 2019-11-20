import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static String kangaroo(int x1, int v1, int x2, int v2)
    {
        int len = 0;
        int pre_len = 0;
        int n = 1;
        while( true )
        {
            if( x1 != x2 && v1 == v2 ) return "NO";
            pre_len = ( x1 + v1 * (n - 1) ) - ( x2 + v2 * (n - 1) );
            len = ( x1 + v1 * n ) - ( x2 + v2 * n );

            if( pre_len < 0 && len < pre_len ) return "NO";
            else if( pre_len > 0 && len > pre_len ) return "NO";

            if( pre_len == 0 ) return "YES";

            n++;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
