import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    static int migratoryBirds(List<Integer> arr)
    {
        HashMap<Integer, Integer> type = new HashMap<Integer, Integer>();
        int c_Birds = arr.size();

        int temp_type = 0;
        int ret = 0;

        for( int i = 0; i < c_Birds; i++ )
        {
            int temp = arr.get(i);
            if( type.containsKey(temp) )
                type.put( temp, (type.get(temp) + 1) );
            else
                type.put(temp, 1);

            if( type.get(temp) > ret )
            {
                temp_type = temp;
                ret = type.get(temp);
            }
            else if( type.get(temp) == ret )
            {
                if( temp < temp_type)
                {
                    temp_type = temp;
                    ret = type.get(temp);
                }
            }
        }

        return temp_type;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
