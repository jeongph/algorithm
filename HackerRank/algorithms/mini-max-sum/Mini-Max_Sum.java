import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long sum[] = {0, 0, 0, 0, 0};

        int arrlen = arr.length;
        int pointer = 0;
        for( int i = 0; i < arrlen; i++)
        {
            for( int j = 0; j < arrlen; j++ )
            {
                if( j == i ) continue;
                sum[pointer] += arr[j];
            }
            pointer++;
        }

        long max = 0;
        long min = sum[0];
        for( int i = 0; i < sum.length; i++ )
        {
            if( sum[i] > max ) max = sum[i];
            if( sum[i] < min ) min = sum[i];
        }
        System.out.printf("%d %d", min, max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
