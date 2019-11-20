import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int arr_len = arr.length;
        double total[] = {0, 0, 0};
        for( int i = 0; i < arr_len; i++ )
        {
            if( arr[i] > 0)
                total[0]++;
            else if( arr[i] < 0 )
                total[1]++;
            else if( arr[i] == 0 )
                total[2]++;
        }

        String out = "";
        for( int i = 0; i < total.length; i++ )
        {
            System.out.printf( "%.6f%s", total[i]/arr_len ,"\n" );
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
